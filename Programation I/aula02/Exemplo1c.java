// Verifica se um n� inteiro � par 
import java.util.Scanner;
public class Exemplo1c {
	static Scanner sc = new Scanner(System.in);
	public static void main (String [] args) {
	
		int num;
		String resultado;
		
		// ler o n�mero
		System.out.print("Introduza um n�mero inteiro: ");
		num = sc.nextInt();
		
		// Determina se o n� � par
		resultado = (num % 2 == 0) ? "par" : "�mpar";
		
		// Mostra o resultado 
		System.out.println("O n�mero � " + resultado + "!");
	}
	
}
