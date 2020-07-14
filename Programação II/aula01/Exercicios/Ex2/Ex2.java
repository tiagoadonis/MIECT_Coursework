import java.util.*;

public class Ex2 {
	
static Scanner sc = new Scanner(System.in);

	public static void main (String[] args) {
		
		System.out.print("Nota AP1: ");
		double AP1 = sc.nextDouble();
		assert (0<=AP1) && (AP1<=20) : "Nota Inválida!!";
		
		System.out.print("Nota AP2: ");
		double AP2 = sc.nextDouble();
		assert (0<=AP2) && (AP2<=20) : "Nota Inválida!!";
		
		System.out.println("");
		double CP = (AP1 + AP2) / 2;
		
		if (CP < 6.5){
			System.out.print("O Aluno está reprovado por nota mínima á componente prática!!\n");
		}
		
		System.out.println("");
		System.out.print("Nota ATP1: ");
		double ATP1 = sc.nextDouble();
		assert (0<=ATP1) && (ATP1<=20) : "Nota Inválida!!";
		
		System.out.print("Nota ATP2: ");
		double ATP2 = sc.nextDouble();
		assert (0<=ATP2) && (ATP2<=20) : "Nota Inválida!!";
		
		System.out.print("Nota ATP3: ");
		double ATP3 = sc.nextDouble();
		assert (0<=ATP3) && (ATP3<=20) : "Nota Inválida!!";
		System.out.println("");
		
		double CTP = (ATP1 + ATP2 + ATP3) / 3;
		
		if (CTP < 6.5){
			System.out.print("O Aluno está reprovado por nota mínima á componente teórica!!\n");
		}
		
		System.out.println("");
		double NF = (0.3 * CTP) + (0.7 * CP);
		System.out.println("Nota Final: "+NF);
		if (NF < 9.5){
			System.out.print("Reprovado!!");
		}
		else{
			System.out.print("Aprovado!!");
		}
	}
}

