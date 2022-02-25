import java.util.Scanner;
public class MilhasToKm {
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args)  {
		double milhas;  // variavel entrada
		double km; 		// variavel de saida
		
		// leitura de uma distância em milhas
		do {
			System.out.print("Distancia em milhas? ");
			milhas = sc.nextDouble();
		} while(milhas < 0);
		
		// calcular a distância em km
		km = 1.609 * milhas;
		
		// Mostrar a distância em km no ecrã
		System.out.println("Distancia em km = " + km);
	}
}
