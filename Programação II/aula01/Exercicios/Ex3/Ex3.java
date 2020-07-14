import java.util.*;

public class Ex3 {
	
static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		int n;
		
		while (true) {
			System.out.print("N? ");
			n = sc.nextInt();
			if (n > 0) break;
			System.err.println("ERROR: invalid number!");
		}

		String verb = isPrime(n)? "is" : "is not";
		System.out.printf("Number %d %s prime\n", n, verb);
	}
	
	public static boolean isPrime(int n) {
		int cont = 0;
		for(int i = 1; i <=n; i++){
			if (n % i == 0){
				cont++;
			}
		}
		if (cont==2){
			return true;
		}
		
		return false;
	}
}

