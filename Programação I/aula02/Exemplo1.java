// Verifica se um n� inteiro � par 
import java.util.Scanner;
public class Exemplo1 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String [] args) {
		// Sequ�ncia -> saltos
	
		int num;
		
		// ler o n�mero
		System.out.print("Introduza um n�mero inteiro: ");
		num = sc.nextInt();
		
		// Determina se o n� � par
		if (num %2 == 0)
			System.out.println("O n�mero � par!");
		else
			System.out.println("O n�mero � �mpar");
	
	}
	
}
