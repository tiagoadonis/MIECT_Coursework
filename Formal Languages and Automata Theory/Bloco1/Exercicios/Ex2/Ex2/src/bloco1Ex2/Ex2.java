package bloco1Ex2;
import java.util.*;

public class Ex2 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			Stack<Double> operandsStack = new Stack<>();
			Queue<String> operationsStack = new LinkedList<String>();
			System.out.print("Reverse Polish Notation Calculator: ");
			try {
				String[] in = sc.nextLine().split(" ");
				for(int i = 0; i < in.length; i++) {
					if(in[i].matches("-?\\d+(\\.\\d+)?")) {
						System.out.println( (i != 0)? "Stacks: "+operandsStack : "");
						operandsStack.push(Double.parseDouble(in[i]));
					}
					else {
						for(int j = i; j < in.length; j++) {
							operationsStack.add(in[j]);
						}
						break;
					}
				}
				while(!operationsStack.isEmpty()) {
					System.out.println("Stack: "+operandsStack);
					String operator = operationsStack.remove();
					switch (operator) {
						case "+":
							operandsStack.push(operandsStack.pop() + operandsStack.pop());
							System.out.println("Stack: "+operandsStack);
							break;
						case "-":
							operandsStack.push(operandsStack.pop() - operandsStack.pop());
							System.out.println("Stack: "+operandsStack);
							break;
						case "/":
							operandsStack.push(operandsStack.pop() / operandsStack.pop());
							System.out.println("Stack: "+operandsStack);
							break;
						case "*":
							operandsStack.push(operandsStack.pop() * operandsStack.pop());
							System.out.println("Stack: "+operandsStack);
							break;
						default:
							System.err.println("ERROR!! Unsupported Operation!");
					}
				}
				System.out.println("");
			}
			catch(Exception e) {
				System.err.println("ERROR!! Unsupported Format!");
			}
		}

	}
}

