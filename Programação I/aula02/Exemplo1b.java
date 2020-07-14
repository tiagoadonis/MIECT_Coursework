// Verifica se um nº inteiro é par 
import java.util.Scanner;
public class Exemplo1b {
	static Scanner sc = new Scanner(System.in);
	public static void main (String [] args) {
		// Sequência -> saltos
	
		int num;
		boolean ePar;
		
		// ler o número
		System.out.print("Introduza um número inteiro: ");
		num = sc.nextInt();
		
		// Determina se o nº é par
		if (num % 2 == 0)
			ePar = true;
		else
			ePar = false;
		
		// Mostra o resultado 
		System.out.print("O número é ");
		if (ePar == false)
			System.out.print("ím");
		
		System.out.println("par!");
	
	}
	
}
