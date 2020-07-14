package aula13Ex2;
import java.util.*;
import java.io.*;

public class CountWordsPairs {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException{
		HashMap<String, ArrayList<String>> dict = new HashMap<>();
		ArrayList<String> tmp = new ArrayList<>();
		
		System.out.print("File: ");
		String fileName = sc.nextLine();
		
		File f = new File(fileName);
		Scanner scf = new Scanner (f);
		System.out.println();
		
		while(scf.hasNext()) {
			String line = scf.nextLine();
			String[] words = line.split("[\",?\\t\n.:\';!\\-*{}=+&/() ]");
			
			for (int i = 0; i < words.length; i++) {
				if (words[i].length() > 2) {
					tmp.add(words[i].toLowerCase());
				}
			}
		}
		scf.close();
		
		if(tmp.size() % 2 == 0) {
			for(int i = 0; i < tmp.size(); i = i+2) {
				if(!dict.containsKey(tmp.get(i))) {
					ArrayList<String> list = new ArrayList<>();
					list.add(tmp.get(i+1));
					dict.put(tmp.get(i), list);
				}
				else {
					ArrayList<String> list = dict.get(tmp.get(i));
					list.add(tmp.get(i+1));
					dict.put(tmp.get(i), list);
				}
			}
		}
		else {
			for(int i = 0; i < tmp.size() - 1; i++) {
				if(!dict.containsKey(tmp.get(i))) {
					ArrayList<String> list = new ArrayList<>();
					list.add(tmp.get(i+1));
					dict.put(tmp.get(i), list);
				}
				else {
					ArrayList<String> list = dict.get(tmp.get(i));
					list.add(tmp.get(i+1));
					dict.put(tmp.get(i), list);
				}
			}
			if(!dict.containsKey(tmp.get(tmp.size()-1))) {
				ArrayList<String> list = new ArrayList<>();
				dict.put(tmp.get(tmp.size()-1), list);
			}
		}
		
		String[] keys = new String[dict.size()];
		dict.keySet().toArray(keys);
		
		for(String str : keys) {
			System.out.print(str+" = {");
			ArrayList<String> lista = dict.get(str);
			
			for (int i = 0; i < lista.size(); i++) {
				if (i == (lista.size()-1) ) {
					System.out.print(lista.get(i));
				}
				else {
					System.out.print(lista.get(i)+", ");
				}
			}
			System.out.println("}");
		}
	}
}
