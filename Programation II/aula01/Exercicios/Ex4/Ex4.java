import java.util.*;

public class Ex4 {
	
static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		
		System.out.print("Insira uma frase (em minúsculas): ");
		String line = sc.nextLine();
		
		String str1 = line.replace('r', '\0');
		String str2 = str1.replace('l', 'u');
		String str3 = str2.replace('L', 'U');
		String str4 = str3.replace('R', '\0');
		
		System.out.print(""+str4); 
			
	}
}

