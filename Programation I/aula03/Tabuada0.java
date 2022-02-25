import java.util.Scanner;
/*
 * Created by jam on 10-out-2016
 * Imprimir tabuada do 6
 */

public class Tabuada0 {

    public static void main(String[] args) {
        // Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);
        int n =6;
        n = ler.nextInt();
        // 6 x 0 = 0
        // 6 x 1 = 6
        // ...
        System.out.printf("Tabuada do %3d\n",n);
        for (int i=0; i <10; i=i+1) {
            System.out.printf( " %3d x %2d = %d\n",n,i,6*i);
        }
    }
}
