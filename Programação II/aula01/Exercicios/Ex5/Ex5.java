import java.util.*;

public class Ex5 {
	
static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		
		int i, cont = 0, soma = 0;
		double media;
		
		do{
			System.out.print("Insira uma lista de números: ");
			String lista = sc.nextLine();
			System.out.println("");
			
			String valores[] = lista.split(" ");
			int nums[] = new int [valores.length];
			
			for (i=0; i < valores.length; i++){
				nums[i] = Integer.parseInt(valores[i]);
				if (nums[i]==0){
					cont++;
				}
			}
			
			for (i=0; i < nums.length; i++){
				soma = soma + nums[i];
			}
			
			media = (double) soma / (double) (nums.length - 1);
			
		}while(cont!=1);
		
		
		System.out.println("Soma: "+soma);
		System.out.print("Média: "+media);
	}
}

