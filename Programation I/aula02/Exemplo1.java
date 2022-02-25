// Verifica se um nº inteiro é par 
import java.util.Scanner;
public class Exemplo1 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String [] args) {
		// Sequência -> saltos
	
		int num;
		
		// ler o número
		System.out.print("Introduza um número inteiro: ");
		num = sc.nextInt();
		
		// Determina se o nº é par
		if (num %2 == 0)
			System.out.println("O número é par!");
		else
			System.out.println("O número é ímpar");
	
	}
	
}
