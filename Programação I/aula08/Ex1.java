import java.io.*;
public class Ex1
{   
 public static void main(String[] args) throws IOException
 {   int 	a = 555,	b = 54321, c =97;
      
     File my_file = new File("aluno.txt");

     PrintWriter pw = new PrintWriter(my_file);

	 pw.printf("a = %d\nb = %d\nc = %d\n",a,b,c);

     pw.close();
   }
} 
