package aula1;
import java.util.*;

public class Ex1 {

static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		System.out.println("Introduza uma frase: ");
		String str = sc.nextLine();
		String arr[] = str.split(" ");
		String arr2[] = new String[arr.length];
		int countNums = 0;
		int countLower = 0, countLower2 = 0;
		int countUpper = 0, countUpper2 = 0;
		String newStr = "";
		
		for (int i = 0; i < arr.length; i++) {
			//System.out.println(""+arr[i]);
			for (int j = 0; j < arr[i].length(); j++) {
				if( Character.isDigit(arr[i].charAt(j)) ) {
					countNums++;
				}
				if ( Character.isLowerCase(arr[i].charAt(j)) ) {
					countLower++;
				}
				if ( Character.isUpperCase(arr[i].charAt(j)) ) {
					countUpper++;
				}
				
				if (j == arr[i].length()-1) {
					if (countLower == arr[i].length()) {
						countLower2++;
					}
				}
				if (j == arr[i].length()-1) {
					if (countUpper == arr[i].length()) {
						countUpper2++;
					}
				}
			}
			
			if ( arr[i].length() % 2== 0 ) {
				for (int j = 0; j < arr[i].length(); j = j +2) {
					newStr = newStr + arr[i].charAt(j+1) + arr[i].charAt(j);
				}
				arr2[i] = newStr;
				newStr = "";
			}
			else {
				for (int j = 0; j < arr[i].length() - 1; j = j + 2) {
					newStr = newStr + arr[i].charAt(j+1) + arr[i].charAt(j);
				}
				newStr = newStr + arr[i].charAt(arr[i].length()-1);
				arr2[i] = newStr;
				newStr = "";
			}
		}
		
		System.out.println("Caracteres N�mericos: "+countNums);
		
		if (countLower2 == arr.length) {
			System.out.println("A frase � s� composta por letras min�sculas!");
		}
		if (countUpper2 == arr.length) {
			System.out.println("A frase � s� composta por letras mai�sculas!");
		}
		
		System.out.println("Total de palavras lidas: "+arr.length);
		for (int i = 0; i < arr.length; i++) {
			int k = i+1;
			System.out.println(k+") "+arr[i]+" -> "+arr2[i]);
		}
		
	}

}