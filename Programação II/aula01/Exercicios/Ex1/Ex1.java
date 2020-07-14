import java.util.*;

public class Ex1 {
	
static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		System.out.print("Insira uma operação delineada por espaços: ");
		String frase = sc.nextLine();
		String a[];
		a = frase.split(" ");
		if (a.length != 3){
			System.err.println("Erro!! Operação mal formada!!");
			System.exit(1);
		}
		switch(a[1]){
			case "+":	double resultado1 = Double.parseDouble(a[0]) + Double.parseDouble(a[2]);
						System.out.print("Resultado: "+resultado1);
						break;
						
			case "-":	double resultado2 = Double.parseDouble(a[0]) - Double.parseDouble(a[2]);
						System.out.print("Resultado: "+resultado2);
						break;
						
			case ("*"):	double resultado3 = Double.parseDouble(a[0]) * Double.parseDouble(a[2]);
						System.out.print("Resultado: "+resultado3);
						break;
						
			case ("/"):	double resultado4 = Double.parseDouble(a[0]) / Double.parseDouble(a[2]);
						System.out.print("Resultado: "+resultado4);
						break;
			
			default:	System.err.println("Erro!! Operação mal formada!!");
						System.exit(1);
						break;
		}
	}
}

