
import java.util.Scanner;
/*
 * Created by jam on 5-out-2015
 * calcular factorial de n!
 */

public class Factorial {

    public static void main(String[] args) {
        // Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);

        int n, fact=1;

        System.out.print("Factorial de: ");
        n = ler.nextInt();
        for (int i = 1; i<= n; i++) {
            fact = fact * i;
        }
        System.out.printf(" =%d\n",fact);


    }
}

