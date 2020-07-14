import p2utils.*;
import java.util.Scanner;
import java.io.*;
import static java.lang.System.*;

public class CheckPasswd {
	
static Scanner sc = new Scanner(System.in);

	public static void main (String[] args) throws IOException{
		KeyValueList<String> list = new KeyValueList<>();
		File f = new File(args[0]);
		if (!f.exists()){
			err.println("ERRO: Não foi possível ler do ficheiro "+f.getName());
			exit(1);
		}
		Scanner scf = new Scanner(f);
		
		while(scf.hasNextLine()){
			String[] array = scf.nextLine().split(" ");
			list.set(array[0], array[1]);
		}
		scf.close();
		
		while(true){
			out.print("Username: ");
			String username = sc.nextLine();
			if(!list.contains(username)){
				err.println("ERRO: Username não existe na base de dados");
				exit(1);
			}
			out.print("Password: ");
			String pass = sc.nextLine();
			/*if(list.get(username).equals(pass)){
				out.println("Authentication successful");
			}else{
				out.println("Authentication failed");
			}*/
			out.println("");
			out.println(list.get(username).equals(pass)? "Authentication successful" : "Authentication failed");
		}
	}
}

