import java.util.*;
import java.io.*; 

public class Ex7 {
	
static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) throws IOException{
		
		String fileInName = args[0];
		File fileIn = new File(fileInName);
		checkFileIn(fileIn, fileInName);
		
		String fileOutName = args[1];
		checkFileOut(fileOutName);
		File fileOut = new File(fileOutName);
		
		writeToFile(fileIn, fileOut);
		System.out.println("Operação Completa!!");
	}
	
	static void checkFileIn(File file, String name){
		System.out.print("Verificando se "+name+" existe...\n");
		if (!file.exists()){
			System.out.print("ERROR!! "+name+" não existe!!\n");
			System.exit(1);
		}
		if (!file.canRead()){
			System.out.print("ERROR!! "+name+" não pode ser lido!!\n");
			System.exit(2);
		}
	}
	
	static void checkFileOut(String name){
		File file = new File(name);
		if (!file.exists()){
			System.out.print("ERROR!! "+name+" não existe!!\n");
			System.exit(1);
		}
		if (file.exists()){
			System.out.print(name+" já existe! Deseja apagá-lo? (s/n)");
			String option;
			do{
				option = sc.nextLine();
				if (option.equals("s")){
					file.delete();
					System.out.println("Ficheiro apagado!!");
					System.exit(2);
				}
				else if (option.equals("n")){
					System.out.println("O conteúdo será sobreposto...");
					continue;
				}
				else {
					System.out.println("Opção não reconhecida!!");
				}
			}while(!option.equals("s") && !option.equals("n"));
		}
	}
	
	static void writeToFile(File fileIn, File fileOut) throws IOException{
		Scanner scf = new Scanner(fileIn);
		PrintWriter pw = new PrintWriter(fileOut);
		do{
			String line = scf.nextLine();
			pw.println(line);
		}while(scf.hasNextLine());
		pw.close();
		scf.close();
	}
}

