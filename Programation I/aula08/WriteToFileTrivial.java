import java.util.*;
import java.io.*;

public class WriteToFileTrivial{      

static Scanner ler = new Scanner(System.in);

 public static void main(String[] args) throws IOException{   
		
	String name_of_file,line_of_text;
	 
	System.out.print("Nome do ficheiro: ");
	name_of_file = ler.nextLine();
     
	File my_file = new File(name_of_file);
	PrintWriter pw = new PrintWriter(my_file);
     
	for(;;) 
	{	 
		System.out.print("Linha para escrever: ");
		line_of_text = ler.nextLine();
		
		if (line_of_text.compareToIgnoreCase("End") == 0)  
		{
			break;
		}
	}
       pw.close();
   }
} 



//~ import java.util.*;
//~ import java.io.*;
//~ public class ReadFromFileTrivial
//~ {      static Scanner kb = new Scanner(System.in);
 //~ public static void main(String[] args) throws IOException
 //~ {   String name_of_file;
     //~ System.out.print("Nome do ficheiro: ");
     //~ name_of_file = kb.nextLine(); 
//~ 
     //~ File my_file = new File(name_of_file);
//~ 
     //~ Scanner read_from_file = new  Scanner(my_file);
     //~ 
    //~ while(read_from_file.hasNextLine())
          //~ System.out.println(read_from_file.nextLine());
     //~ 
    //~ read_from_file.close();
   //~ 
    //~ }
//~ }
