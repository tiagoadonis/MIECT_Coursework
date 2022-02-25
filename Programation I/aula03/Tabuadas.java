
import java.util.Scanner;
/*
 * Created by jam on 6-out-2015
 * Imprimir tabuada do 5
 */

public class Tabuadas {

    public static void main(String[] args) {
        // Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);
        int x=6;

        for (x=1; x<10; x++) {
            System.out.printf("Tabuada do %d\n",x);
            for (int i=0; i <=9; i=i+2) {
                System.out.printf("%d x %d = %d\n",x,i,x*i);
            }
        }
        // factorial
        int n = 5;
        int h = 1;
        for (x=1; x<=n; x++) h=h*x;

        System.out.printf("\n%d! = %d\n",n,h);
    }
}
b
