import java.util.*;
import java.io.*;
public class v
{      static Scanner kb = new Scanner(System.in);
 public static void main(String[] args) throws IOException
 { String nameIn;
   // leitura do nome do ficheiro de entrada
  System.out.print("Ficheiro de entrada: ");
  nameIn = kb.nextLine(); 
  // Associaacao do nome do ficheiro de entrada ao programa
  File fin = new File(nameIn);
  // verificacoes do ficheiro de entrada
  if (!fin.exists())                 {
      System.out.println("ERROR: input file " + nameIn + " does not exist!");
      System.exit(2);             }
  if (fin.isDirectory())         {
      System.out.println("ERROR: input file " + nameIn + " is a directory!");
      System.exit(3);            }
  if (!fin.canRead())          {
   System.out.println("ERROR: cannot read from input file " + nameIn+ "!");
   System.exit(4);             }     }     }
