import p2utils.*;
import static java.lang.System.*;
import java.util.Scanner;

public class RPNCalculator {

static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		Stack<Double> pilha = new Stack<>();
		while(sc.hasNext()){
			if(sc.hasNextDouble()){
				pilha.push(sc.nextDouble());
				out.println("Stack: "+pilha.reverseToString());
			}else{
				double result = 0;
				String str = sc.next();
				if(pilha.isEmpty()){
					err.println("ERROR: two operands missing!");
					exit(1);
				}
				double num1 = pilha.top();
				pilha.pop();
				if(pilha.isEmpty()){
					err.println("ERROR: one operand missing!");
					exit(1);
				}
				double num2 = pilha.top();
				pilha.pop();
				if(str.equals("+")){
					result = num1 + num2;
				}
				else if (str.equals("-")){
					result = num1 - num2;
				}
				else if (str.equals("*")){
					result = num1 * num2;
				}
				else if (str.equals("/")){
					result = num1 / num2;
				}else{
					err.println("ERROR: invalid operator!");
					exit(1);
				}
				pilha.push(result);
				out.println("Stack: "+pilha.reverseToString());
			}
		}
	}
}

