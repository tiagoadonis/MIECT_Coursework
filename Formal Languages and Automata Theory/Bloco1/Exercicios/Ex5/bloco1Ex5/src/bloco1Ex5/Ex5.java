package bloco1Ex5;
import java.util.*;

public class Ex5 {

private static Scanner sc;
private static HashMap<String, Double> var;
private static List<String> operations;

	static {
		operations = new LinkedList<>();
		operations.add("+");
		operations.add("-");
		operations.add("*");
		operations.add("/");
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		var = new HashMap<>();
		
		while(sc.hasNextLine()) {
			System.out.println("Resultado: "+processLine(sc.nextLine()));
		}
	}
	
	public static double processLine(String line) {
		Stack<Double> operands = new Stack<>();
		
		// split pelos espaços em branco com uma ou mais ocorrências
		String[] elems = line.split("\\s+");
		
		for (int i = 0; i < elems.length; i++) {
			String elem = elems[i];
			// se for um número
			if (elem.matches("\\d+")) {
				operands.push(Double.parseDouble(elem));
			}
			// se for uma operação
			else if(operations.contains(elem)) {
				if (operands.size() < 1)  {
					System.err.println("ERROR: Two operands missing!");
					System.exit(1);
				}
				double operand1 = processLine(elems[i + 1]);
				double operand2 = operands.pop();
				
				try {
					operands.push(calculator(operand2, operand1, elem));
					return operands.peek();
				} catch (IllegalArgumentException e) {
					System.err.println("ERROR!");
					System.exit(1);
				}
			}
			// variaveis
			else {
				// atribuição
				if (i < elems.length - 1 && elems[i+1].contains("=")) {
					var.put(elem, processLine(line.substring(i+1)));
					i = elems.length;
					return var.get(elem);
				}
				// ler valor
				else if(var.containsKey(elem)) {
					operands.push(var.get(elem));
				}
				// error
				else if(!elem.equals("=")) {
					System.err.println(elem + " is invalid Expression");
				}
			}
		}
		return operands.peek();
	}
	
	public static double calculator (double operand1, double operand2, String op) {
		double result = 0;

		switch(op) {
			case "+":
				result = operand1 + operand2;
				break;
			case "-":
				result = operand1 - operand2;
				break;
			case "*":
				result = operand1 * operand2;
				break;
			case "/":
				if (operand2 == 0) {
					throw new IllegalArgumentException("ERROR: Divide by zero!");
				}
				result = operand1 / operand2; 
				break;
			default:
				throw new IllegalArgumentException("ERROR: invalid operator!");
		}

		return result;
	}

}
