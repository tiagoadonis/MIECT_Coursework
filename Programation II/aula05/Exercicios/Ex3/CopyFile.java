import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class CopyFile {
	
static Scanner sc = new Scanner(System.in);

	public static void main (String[] args) throws IOException {
		requireEA();
		if (args.length != 2) {
		  err.println("Usage: java -ea CopyFile <source-file> <destination-file>");
		  exit(1);
		}
		
		File fin = new File(args[0]);
		checkFileIn(fin);
		
		String fileOutName = args[1];
		boolean check = checkFileOut(fileOutName);
		
		if (check == true){
			File fout = new File(fileOutName);
			writeToFile(fin, fout);
		}
	}
	
	public static void checkFileIn(File fin){
		if(!fin.exists()){
			err.println("ERROR: input file \""+fin.getName()+"\" does not exist!");	
			exit(1);
		}
		if (!fin.isFile()){
			err.println("ERROR: \""+fin.getName()+"\" is a directory!");	
			exit(1);
		}		
		if (!fin.canRead()){
			err.println("ERROR: input file \""+fin.getName()+"\" can not be read!");	
			exit(1);
		}
	}
	
	public static boolean checkFileOut(String name){
		File fout = new File(name);
		boolean check = false;
		if (fout.exists()){
			if (!fout.canWrite()){
				err.println("ERROR: output file \""+fout.getName()+"\" can not be write!");	
				exit(1);			
			}
			if (!fout.isFile()){
				err.println("ERROR: \""+fout.getName()+"\" is a directory!");	
				exit(1);
			}
			// If Destination File already exixts
			out.print("WARNING: \""+fout.getName()+"\" already exists! Dou you want to override it? (Y/N) ");
			String opt;				
			do{
				opt = sc.nextLine();
				if (opt.equalsIgnoreCase("y")){
					check = true;
				}if(opt.equalsIgnoreCase("n")){
					exit(1);
				}
			}while( !(opt.equalsIgnoreCase("y") || opt.equalsIgnoreCase("n")) );
		}else{
			// Check write permisson on parent directory	
			
			/*if (!fout.getParentFile().canWrite()){
				err.println("ERROR: \""+fout.getParent()+"\" can not be write!");	
				exit(1);
			}*/
			
			//  Create the Destination File
			check = true;
		}
		return check;
	}
	
	public static void writeToFile(File fileIn, File fileOut) throws IOException{
		Scanner scf = new Scanner(fileIn);
		PrintWriter pw = new PrintWriter(fileOut);
		do{
			String line = scf.nextLine();
			pw.println(line);
		}while(scf.hasNextLine());
		pw.close();
		scf.close();
	}
	
	static void requireEA() {
		boolean ea = false;
		assert ea = true;
		if (!ea) {
			err.println("Usage: java -ea CopyFile <source-file> <destination-file>");
			exit(1);
		}
	}
}
