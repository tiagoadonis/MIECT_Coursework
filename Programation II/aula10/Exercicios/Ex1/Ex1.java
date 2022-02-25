import static java.lang.System.*;
import java.util.Scanner;
import p2utils.*;

public class Ex1 {
	
static Scanner sc = new Scanner(System.in); 
	
	public static void main (String[] args) {
		out.print("Input: ");
		String input = sc.nextLine();
		input = input.toLowerCase().replaceAll("\\s", "");
		int mid = input.length() / 2;
		if (input.length()%2 != 0){
			input = input.substring(0, mid) + input.substring(mid + 1);
		}
		
		Stack<Character> first = new Stack<>();
		Queue<Character> second = new Queue<>();
		
		for (int i = 0; i < mid; i++){
			first.push(input.charAt(i));
			second.in(input.charAt(mid + i));
		}
		
		if (palindromo (first, second, mid)){
			out.println("É um palindromo!");
		}else{
			out.println("Não é um palindromo!");
		}
	}
	
	public static boolean palindromo(Stack<Character> first, Queue<Character> second, int mid){
		boolean bool = false;
		String str1 = "";
		String str2 = "";
		for (int i = 0; i < mid; i++){
			if(first.top().equals(second.peek())) {
				bool = true;
				first.pop();
				second.out();
			}
			else{
				return false;
			}
		}
		return bool;
	}
}

