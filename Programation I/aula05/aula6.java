/*
 * JAM 31-out-2016
 *
 *
 */


import java.util.Scanner;
public class aula6 {
    static Scanner lerT= new Scanner(System.in);
    public static void main (String[] args) {

        final int DIM = 5;
		int media=0, maiormed=0;
        //int a[] = new int[5];
        int a[]; // int[] a
        a = new int[DIM];
		// Ler notas
        for(int i = 0; i < DIM; i++) {
			System.out.printf(" Nota %d :",i+1);
            a[i] = lerT.nextInt();
            media=media + a[i];
        }
        media = media/DIM;
        maiormed = contar(a,10);
        // imprimir notas
		for(int i = 0; i < a.length; i++) {
			System.out.printf(" Nota %d = %d\n",i+1,a[i]);

        }

        System.out.printf(" Numero notas > media = %d\n",contar(a,media));


    }
	public static int contar(int[] lista, int lim){
	 int maiormed=0;
	 for(int i = 0; i < lista.length; i++) {
			if (lista[i] > lim )maiormed++;

        }
        lista[0] = -99; // como os arrays são passados por referência
						// se se alterar dentro da função altera-se o valor original
						// usando um array como parêmtro permite passar e receber valores para/ede uma função
        return maiormed;
	}
}
