import java.io.*;
import static java.lang.System.*;
import java.util.*;

public class SortInts {
	
	public static void main (String[] args) throws IOException{
		if(args.length != 1){
			err.println("Usage: java -ea SortInts file1");
			exit(1);
		}
		
		File f = new File(args[0]);
		Scanner scf = new Scanner(f);
		
		SortedListInt lista = new SortedListInt();
		
		while(scf.hasNextLine()){
			try{
				String [] arr = scf.nextLine().trim().split("\\s+");
				int[] a = new int[arr.length];
				for (int i = 0; i < arr.length; i++){
					a[i] = Integer.parseInt(arr[i]);
					lista.insert(a[i]);
				}
			}catch(NumberFormatException e){
				out.print("");  
			}
		}
		
		assert lista.isSorted();
		
		while(!lista.isEmpty()){
			out.println(lista.first()+"");
			lista.removeFirst();
		}
	}
}
