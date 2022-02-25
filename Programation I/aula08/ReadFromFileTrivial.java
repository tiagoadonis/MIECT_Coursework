import java.util.*;
import java.io.*;

public class ReadFromFileTrivial{      

static Scanner ler = new Scanner(System.in);

public static void main(String[] args) throws IOException{   
	
	String name_of_file;
	
	System.out.print("Nome do ficheiro: ");
	name_of_file = ler.nextLine(); 

	File my_file = new File(name_of_file);
	Scanner read_from_file = new  Scanner(my_file);
     
    while(read_from_file.hasNextLine())
    {
          System.out.println(read_from_file.nextLine());
    }
     
    read_from_file.close();
   
    }
}
