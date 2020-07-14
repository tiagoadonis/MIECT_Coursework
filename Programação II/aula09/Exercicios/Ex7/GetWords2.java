import static java.lang.System.*;
import java.io.*;
import java.util.Scanner;
import p2utils.Sorting;

public class GetWords2{
	static final String fileName = "words.txt";
  
	public static void main(String[] args){
		if (args.length < 1){
			err.println("Usage: java GetWords2 <file> ...");
			exit(1);
		}
		File localFile1 = new File("words.txt");
		String[][] arrayOfString;
		if ((localFile1.exists()) && (!localFile1.isDirectory()) && (localFile1.canRead())){
			arrayOfString = new String[args.length + 1][];
			arrayOfString[(arrayOfString.length - 1)] = extractWords(localFile1);
		}
		else{
			arrayOfString = new String[args.length][];
		}
		for (int i = 0; i < args.length; i++){
			File localFile2 = new File(args[i]);
			arrayOfString[i] = extractWords(localFile2);
		}
		String[] arrayOfString1 = concatArrays(arrayOfString);
    
		Sorting.mergeSort(arrayOfString1, 0, arrayOfString1.length);
    
		int j = countDistinctWords(arrayOfString1);
		String[] arrayOfString2 = new String[j];
    
		j = 0;
		arrayOfString2[(j++)] = arrayOfString1[0];
		for (int k = 1; k < arrayOfString1.length; k++) {
			if (!arrayOfString1[k].equals(arrayOfString1[(k - 1)])) {
				arrayOfString2[(j++)] = arrayOfString1[k];
			}
		}
		printList(arrayOfString2, arrayOfString2.length);
    
		writeWordsInFile(localFile1, arrayOfString2);
	}
  
	static String[] concatArrays(String[][] paramArrayOfString){
		assert (paramArrayOfString != null);
    
		int i = 0;
		for (int j = 0; j < paramArrayOfString.length; j++) {
			i += paramArrayOfString[j].length;
		}
		String[] arrayOfString = new String[i];
		i = 0;
		for (int k = 0; k < paramArrayOfString.length; k++){
			System.arraycopy(paramArrayOfString[k], 0, arrayOfString, i, paramArrayOfString[k].length);
			i += paramArrayOfString[k].length;
		}
		return arrayOfString;
	}
  
	static int countDistinctWords(String[] paramArrayOfString){
		assert (paramArrayOfString != null);
    
		int i = paramArrayOfString.length > 0 ? 1 : 0;
		for (int j = 1; j < paramArrayOfString.length; j++) {
			if (!paramArrayOfString[j].equals(paramArrayOfString[(j - 1)])) {
				i++;
			}
		}
		return i;
	}
  
	static void printList(String[] paramArrayOfString, int paramInt){
		assert (paramArrayOfString != null);
		assert ((paramInt >= 0) && (paramInt <= paramArrayOfString.length));
		for (int i = 0; i < paramInt; i++) {
			out.printf("%s\n", new Object[] { paramArrayOfString[i] });
		}
		out.printf("Number of distinct words is: %d\n", new Object[] { Integer.valueOf(paramInt) });
	}
  
	static String[] extractWords(File paramFile){
		try{
			int i = 0;
			Scanner localScanner = new Scanner(paramFile).useDelimiter("[\\p{Punct}\\p{Space}]+");
			while (localScanner.hasNext()){
				localScanner.next();
				i++;
			}
			localScanner.close();
      
			String[] arrayOfString = new String[i];
      
			int j = 0;
			localScanner = new Scanner(paramFile).useDelimiter("[\\p{Punct}\\p{Space}]+");
			while (localScanner.hasNext()){
				arrayOfString[j] = localScanner.next();
				j++;
			}
			localScanner.close();
      
			return arrayOfString;
		}
		catch (IOException localIOException){
			err.printf("Error: %s\n", new Object[] { localIOException });
			exit(1);
		}
		return null;
	}
  
	static void writeWordsInFile(File paramFile, String[] paramArrayOfString){
		try{
			PrintWriter localPrintWriter = new PrintWriter(paramFile);
			for (int i = 0; i < paramArrayOfString.length; i++) {
				localPrintWriter.println(paramArrayOfString[i]);
			}
			localPrintWriter.close();
		}
		catch (IOException localIOException){
			err.printf("Error: %s\n", new Object[] { localIOException });
			exit(1);
		}
	}
}
