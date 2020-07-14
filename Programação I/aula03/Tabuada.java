
import java.util.Scanner;
/*
 * Created by jam on 5-out-2015
 * Imprimir tabuada do 5
 */

public class Tabuada {
// Scanner para leitura de dados do teclado
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        for (int n =1; n<10; n=n+2) {
            System.out.printf("Tabuada do %3d\n",n);
            for (int i = 0; i <= 9; i++) {
                System.out.printf( " %3d x %2d = %d\n",n,i,n*i);
            }
        }
    }
}
