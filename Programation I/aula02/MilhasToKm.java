import java.util.Scanner;
public class MilhasToKm {
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args)  {
		double milhas;  // variavel entrada
		double km; 		// variavel de saida
		
		// leitura de uma dist�ncia em milhas
		do {
			System.out.print("Distancia em milhas? ");
			milhas = sc.nextDouble();
		} while(milhas < 0);
		
		// calcular a dist�ncia em km
		km = 1.609 * milhas;
		
		// Mostrar a dist�ncia em km no ecr�
		System.out.println("Distancia em km = " + km);
	}
}
