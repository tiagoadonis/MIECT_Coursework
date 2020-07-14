
import java.util.Scanner;
/*
 * Created by jam on 17-out-2016
 * calcular factorial de n!
 */

public class Factorial_f {

    public static void main(String[] args) {
        // Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);
        int m,n=-1;f;
        System.out.print("Factorial de: ");
        m = ler.nextInt();
        f = fatorial(m);
        for (int k=1; k<25; k++) {
            System.out.printf(" =%d\n",fatorial(k));

        }
        System.out.printf(" =%d\n",f);
    }
    public static int fatorial(int n) {
        int fact=1;
        if (n > 0 && n <17) {
            for (int i = 1; i<= n; i++) {
                fact = fact * i;
            }
        } else {
            fact=-1;
        }
        return fact;
    }
}

