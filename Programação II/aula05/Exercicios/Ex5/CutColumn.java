import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class CutColumn {
	
static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) throws IOException {
		requireEA();
		if (args.length!=2){
			err.println("Usage: java -ea CutColumn <source-file> <column-number>");
			exit(1);
		}
		
		File fileIn = new File(args[0]);
		int numColumn = Integer.parseInt(args[1]);
		assert numColumn >= 0 : "ERROR: Invalid column number!";
		Scanner scf = new Scanner(fileIn);
		
		while(scf.hasNextLine()){
			try{
				String line = scf.nextLine().trim();
				String[] lines = line.split("\\s+");
				out.print(lines[numColumn-1]+"\n");
			}catch(ArrayIndexOutOfBoundsException e){
				out.println("");
			}
		}
		scf.close();
	}
	
	static void requireEA() {
		boolean ea = false;
		assert ea = true;
		if (!ea) {
			err.println("Usage: java -ea CutColumn <source-file> <column-number>");
			exit(1);
		}
	}
}

