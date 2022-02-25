package bloco1Ex1;
import java.util.*;

public class Ex1 {

static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.print("Expressão: ");
		double num1 = Double.parseDouble(sc.next());
		String op = sc.next();
		double num2 = Double.parseDouble(sc.next());
		double res = 0;
		
		switch (op) {
			case "+":
				res = num1 + num2;
				System.out.println("Resultado: "+res);
				break;
			case "-":
				res = num1 - num2;
				System.out.println("Resultado: "+res);
				break;
			case "*":
				res = num1 * num2;
				System.out.println("Resultado: "+res);
				break;
			case "/":
				res = num1 / num2;
				System.out.println("Resultado: "+res);
				break;
			default:
				System.err.println("ERROR!! Invalid operation symbol!");
		}
	}

}
