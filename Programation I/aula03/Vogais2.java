
import java.util.*;
/*
 * Created by jam on 5-out-15.
 * gera aleatoriamente 100 letras
 */

public class Vogais2 {

    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int c = rand.nextInt(26) + 'a';
            System.out.print((char) c + ", " + c + ": ");
            switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");
            }
        }
    }
}
b
