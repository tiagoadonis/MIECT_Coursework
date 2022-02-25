import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class ListDir {
	
Scanner sc = new Scanner(System.in);

	public static void main (String[] args) throws IOException {
		requireEA();
		File folder;
		if (args.length > 1){
			err.print("Usage: java -ea ListDir <directory-path>");
			exit(1);
		}
		if(args.length == 1){
			folder = new File(args[0]);
			verifyDir(folder);
		}
		else{
			folder = new File(".");
		}
		File[] listOfFiles = folder.listFiles();
		printList(folder, listOfFiles);
	}
	
	public static void verifyDir(File dir){
		if(!dir.exists()){
			err.println("ERROR: input directory \""+dir.getName()+"\" does not exist!");
			exit(1);
		}
		if(!dir.isDirectory()){
			err.println("ERROR: input \""+dir.getName()+"\" is not directory!");
			exit(1);
		}
		if (!dir.canRead()){
			err.println("ERROR: cannot read from input directory \""+dir.getName()+"\"!");
			exit(1);
		}
	}
	
	public static void printList(File folder, File[] files){
		for (int i = 0; i<files.length; i++){
			out.print( files[i].isDirectory()? "D" : "F");
			out.print( files[i].canRead()? "R" : "-");
			out.print( files[i].canWrite()? "W" : "-");
			out.print("  "+files[i]+"\n");
		}
	}
	
	static void requireEA() {
		boolean ea = false;
		assert ea = true;
		if (!ea) {
			err.println("Usage: java -ea ListDir <directory-path>");
			exit(1);
		}
	}
}

