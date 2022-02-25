import static java.lang.System.*;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class GetWords {
	static int equalCount = 0;
	static int i = 0;
	public static void main(String[] args) throws IOException{ 
		if (args.length < 1) {
			err.println("Usage: java -ea GetWords <file>");
			exit(1);
		}
		String[] words = new String[1000];
		for (int j = 0; j < args.length; j++){
			words = extractsWords(words, new File(args[j]));
			orderWords(words);
		}	
		
		for(int j = 0; j < i; j++)
			out.printf("%s\n", words[j]);
	}

	static String[] extractsWords(String[] words, File fin) throws IOException {
		assert fin != null;
	    assert !fin.isDirectory(); 
	    assert fin.canRead();      
		
	    int n = 0;
	    Scanner scf = new Scanner(fin);
	    while (scf.hasNext()) {
	    	scf.next();
	    	n++;
	    }
	    scf.close();
	  
	    scf = new Scanner(fin);
	    while(scf.hasNext()) {
	    	String word = scf.next();
	    	if(isInArray(words, word)){
	    		equalCount++;
	    	}
	    	else{
	    		words[i] = word;
	    		i++;
	    	}
	    }
	    scf.close();

	    return words;
	}

	static void orderWords(String[] words) {
		for (int k = 0; k < i - 1; k++) {
			for (int j = k + 1;j < i; j++) {
				if (words[k].compareTo(words[j]) > 0) {
					String temp = words[k];
					words[k] = words[j];
					words[j] = temp;
				}	
			}
		}
	}

	static boolean isInArray(String[] words, String word) {
		for (int k = 0; k < i && words[k] != null; k++) {
			if(words[k].equals(word)) {
				return true;
			}
		}
		return false;
	}
}
