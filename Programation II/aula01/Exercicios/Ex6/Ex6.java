import java.util.*;

public class Ex6 {
	
static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		
		int num = (int) (Math.random()*101);
		int tent = 0, certo = 0;
		
		do{
			System.out.print("Tente adivinhar o número: ");
			int x = sc.nextInt();
			if(x > num){
				System.out.println("O número secreto é inferior!");
				tent++;
			}
			else if(x < num){
				System.out.println("O número secreto é superior!");
				tent++;
			}
			else if(x == num){
				certo++;
				tent++;
			}
			System.out.println("");
		}while(certo != 1);
		
		System.out.println("Acertou!! O número secreto é: "+num);
		System.out.print("Usou "+tent+" tentativas");
		
	}
}

