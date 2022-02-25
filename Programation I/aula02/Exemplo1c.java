// Verifica se um nº inteiro é par 
import java.util.Scanner;
public class Exemplo1c {
	static Scanner sc = new Scanner(System.in);
	public static void main (String [] args) {
	
		int num;
		String resultado;
		
		// ler o número
		System.out.print("Introduza um número inteiro: ");
		num = sc.nextInt();
		
		// Determina se o nº é par
		resultado = (num % 2 == 0) ? "par" : "ímpar";
		
		// Mostra o resultado 
		System.out.println("O número é " + resultado + "!");
	}
	
}
