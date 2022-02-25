
import java.util.Scanner;
/*
 * Created by jam on 5-out-2015
 * Adivinhar um numero entre 0 e 100
 */

public class AltoBaixo {

    public static void main(String[] args) {
        // Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);

        int tentativas=0, valor;
        int secret = (int)(100.0*Math.random()) + 1;
        do {
            System.out.print("Adivinhar valor entre 0 e 100:");
            valor = ler.nextInt();
            if (valor > secret)System.out.println("Maior");
            if (valor < secret)System.out.println("Menor");
            tentativas = tentativas + 1;
        } while(valor != secret);

        System.out.printf("Numero = %3d\nTentativas = %3d\n",valor,tentativas);
    }
}
