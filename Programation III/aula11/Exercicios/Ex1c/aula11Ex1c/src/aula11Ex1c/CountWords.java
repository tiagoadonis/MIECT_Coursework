package aula11Ex1c;

import java.util.*;
import java.io.*;

public class CountWords {

static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) throws IOException{
		Map<String, Integer> dict = new HashMap<>();
		System.out.print("Nome do ficheiro de texto: ");
		String fileName = sc.nextLine();
		
		File f = new File(fileName);
		Scanner scf = new Scanner(f);
		
		while(scf.hasNextLine()) {
			String line = scf.nextLine().toLowerCase();
			String[] words = line.split(" ");
			for (int i = 0; i < words.length; i++) {
				if (dict.containsKey(words[i])) {
					int value = dict.get(words[i]);
					dict.put(words[i], value+1);
				}else {
					dict.put(words[i], 1);
				}
			}
		}
		scf.close();
		
		String[] keys = new String [dict.size()];
		String[] tmp = dict.keySet().toArray(keys);
		
		for(int i = 0; i < keys.length; i++) {
			System.out.println(keys[i]+": "+dict.get(keys[i]));
		}
	}

}