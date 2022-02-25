package aula09Ex1;
import java.io.*;
import java.util.*;

public class Test {

static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException{
		ScannerAbeirense sc = null;
		
		System.out.println("1) Ler do ficheiro");
		System.out.println("2) Escrever uma string");
		System.out.print("Opt: ");
		int opt = read.nextInt();
		read.nextLine();
		
		System.out.println();
		if (opt == 1) {
			sc = new ScannerAbeirense(new File("scannerAbeirense.txt"));
		}
		else if(opt == 2) {
			System.out.print("Frase: ");
			String line = read.nextLine();
			sc = new ScannerAbeirense(line);
		}
		else {
			System.out.println("Op��o errada!!");
			System.exit(1);
		}
		
		while(sc.hasNext()) {
			System.out.print(sc.next()+" ");
		}
		sc.close();
	}

}