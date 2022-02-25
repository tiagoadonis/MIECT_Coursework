package aula01Ex3;
import java.util.*;

public class TestEx3 {

static Scanner ler = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		System.out.println("1 - Criar um quadrado");
		System.out.println("2 - Criar um retangulo");
		System.out.println("3 - Criar um círculo");
		System.out.printf("\nOpção: ");
		int opcao = ler.nextInt();
		
		if (opcao == 1)
		{
			System.out.print("Lado: ");
			double lado = ler.nextDouble();
			
			Quadrado A = new Quadrado(lado);
			System.out.printf("\nInformação sobre a figura: \n"+A);	
		}
		else if(opcao == 2)
		{
			System.out.print("Largura: ");
			double largura = ler.nextDouble();
			
			System.out.print("Comprimento: ");
			double comprimento = ler.nextDouble();
			
			Rectangulo B = new Rectangulo(largura,comprimento);
			System.out.printf("\nInformação sobre a figura: \n"+B);	
		}
		else if(opcao == 3)
		{
			System.out.print("Raio: ");
			double raio = ler.nextDouble();
			
			System.out.print("Coordenada X do centro: ");
			int x = ler.nextInt();
			
			System.out.print("Coordenada Y do centro: ");
			int y = ler.nextInt();
			
			Circulo C = new Circulo(x,y,raio);
			System.out.printf("\nInformação sobre a figura: \n"+C);
		}
	}

}
