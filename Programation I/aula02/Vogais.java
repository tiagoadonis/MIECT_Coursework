
import java.util.Scanner;
/*
 * Created by jam on 29-set-2015
 * determinar se um caracter é vogal
 */

public class Vogais {

    public static void main(String[] args) {
        // Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);

        char letra;
        System.out.println("Introduza uma letra:");
        letra = ler.nextLine().charAt(0);
        switch (letra) {
            case 'a':

				System.out.printf("Codigo do %c = %d\n", letra,(byte)letra);
            //break;
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.printf("Vogal %c\n", letra);
                break;
            default:
                System.out.printf("Codigo do %c = %d\n", letra,(byte)letra);
                break;
        }

    }
}
