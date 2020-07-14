import static java.lang.System.*;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.io.File;
import java.io.IOException;
//import p2utils.HashTable;
//import p2utils.LinkedList;
import java.util.*;

public class ListGroups{
	
	static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		if (args.length!=1) {
			err.printf("Usage: java -ea CheckGroups Group-File\n");
			exit(1);
		}
		
		File fin = new File(args[0]);
		LinkedList<String> lista = new LinkedList();
		Hashtable<String, lista> hash = new Hashtable();
		
		Scanner scf = new Scanner(fin);
		
		while(scf.hasNextLine()){
			String[] line = scf.nextLine().split("\t");
			// key -> pc (pc == line[1])
			String[] keys = hash.keys();
			if(keys.length > 1){
				for(int i = 0; i < keys.length; i++){
					if(keys[i] == line[1]){
						hash.get(line[1]).addLast(line[0]);
					}else{
						hash.set(line[1], lista.addLast(line[0]));
					}
				}
			}else{
				hash.set(line[1], lista.addLast(line[0]));
			}
		}
		String[] array = hash.keys();
		for(String str : array){
			out.print(""+str+": "+hash.get(str).toString()+"\n");
		}
	}
}

