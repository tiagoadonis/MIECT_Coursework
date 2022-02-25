import static java.lang.System.*;
import java.io.*;

public class ListRec {
	public static void main (String[] args) {
		File folder;
		if (args.length > 1){
			err.print("Uso: java ListRec [<ficheiro>]");
			exit(1);
		}
		if(args.length == 1){
			folder = new File(args[0]);
			verifyDir(folder);
		}
		else{
			folder = new File(".");
		}
		output(arrayFolder(folder));
	}
	
	public static File[] arrayFolder(File folder){
		return folder.listFiles();
	}
	
	public static void output(File[] folder){
		for (int i = 0; i<folder.length; i++) {
			if(folder[i].isDirectory()){ 
				output(arrayFolder(folder[i])); 
			}
			out.println(folder[i].getPath());
		}
	}
	
	public static void verifyDir(File dir){
		if(!dir.exists()){
			out.println("Error: directory doesn't exist");
			exit(1);
		}
		if(!dir.isDirectory()){
			out.println("Error: file is not a directory");
			exit(2);
		}
		if(!dir.canRead()){
			out.println("Error: cant read from directory");
			exit(3);
		}
	}
}

