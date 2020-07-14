
import java.util.*;
/*
 * Created by jam on 19-out-15.
 Exercicio 6.6
 Escreva um programa que leia uma frase e imprima no monitor quais as letras do alfabeto
 que apareceram nessa frase.
 */

public class f6e6 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int letras[] = new int[26]; // array corresponde às letras minúsculas
        char[] t;	// = new char[100];

        // t = "aveiro tem moliceiros".toCharArray();
        System.out.print("Introduza a frase:");
        t = ler.nextLine().toCharArray(); // converte frase para um array de carateres
        // coloca em letras[0] a contagem dos 'a', em letras[1] dos 'b', etc...
        for (char c : t) {
            if (c >= 'a' && c <= 'z') {
                letras[(byte) c - (byte) 'a']++;
            }
        }
        // imprime só as letras e respetiva contagem que aparecem na frase
        for (int i = 0; i < 26; i++) {
            if (letras[i] != 0) {
                System.out.printf("%c: %d\n", (char) ((byte) 'a' + i), letras[i]);
            }
        }
    }
}
