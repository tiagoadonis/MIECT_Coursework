// Verifica se um n� inteiro � par 
import java.util.Scanner;
public class Exemplo1b {
	static Scanner sc = new Scanner(System.in);
	public static void main (String [] args) {
		// Sequ�ncia -> saltos
	
		int num;
		boolean ePar;
		
		// ler o n�mero
		System.out.print("Introduza um n�mero inteiro: ");
		num = sc.nextInt();
		
		// Determina se o n� � par
		if (num % 2 == 0)
			ePar = true;
		else
			ePar = false;
		
		// Mostra o resultado 
		System.out.print("O n�mero � ");
		if (ePar == false)
			System.out.print("�m");
		
		System.out.println("par!");
	
	}
	
}
