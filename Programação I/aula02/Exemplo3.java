import java.util.Scanner;
public class Exemplo3 {
	static Scanner kb = new Scanner(System.in);
	public static void main(String [] args) {
		int a, b, r = 0;
		char op;
		boolean ok = true;
		
		// ler dados da opera��o
		System.out.print("Opera��o: ");
		op = kb.nextLine().charAt(0);
		System.out.print("Operando 1: ");
		a = kb.nextInt();
		System.out.print("Operando 2: ");
		b = kb.nextInt();
		
		// calcular resultado
		switch(op){
			case '+':
				r = a + b;
				break;
			case '-':
				r = a - b;
				break;
			case '*':
				r = a * b;
				break;
			case '/':   // CHAMAR A ATEN��O PARA O 'break' EM FALTA
				if(b != 0) {
					r = a / b;
					break;
				}
			default:
				ok = false;
				System.out.println("Opera��o invalida");
		}
		if(ok){
			System.out.printf("%d %c %d = %d",a, op, b, r);
		}
	}
}
