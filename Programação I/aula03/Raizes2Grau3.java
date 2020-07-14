
import java.util.Scanner;
/*
 Created by jam on 24-set-2015
 Cálculo das raízes reais e imaginárias de um polinómio de 2º grau. Ax^2 + Bx + C = 0
 */

public class Raizes2Grau3 {

    public static void main(String[] args) {
        // Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);
        // variáveis
        double A, B, C; // coeficientes do polinómio
        double raiz1, raiz2;    // raizes - parte real
        double im1, im2;        // raizes - parte imaginária
        double delta;
        // Ler coeficientes A; B; C
        System.out.print("Introduza os coeficientes A, B, C do polinomio do 2grau:");
        A = ler.nextDouble();
        if (A != 0.0) {
            B = ler.nextDouble();
            C = ler.nextDouble();
            // cálculo 2 raizes usando fórmula resolvente
            delta = B * B - 4.0 * A * C;
            // testa se são raizes reais
            if (delta >= 0) {
                raiz1 = (-B + Math.sqrt(delta)) / 2.0 * A;
                raiz2 = (-B - Math.sqrt(delta)) / 2.0 * A;
                // imprime resultado
                System.out.printf("coeficientes = %f, %f, %f\nraizes reais = %f, %f\n", A, B, C, raiz1, raiz2);
            } else {
                raiz1 = (-B) / 2.0 * A;
                raiz2 = (-B) / 2.0 * A;
                im1 = Math.sqrt(-delta) / 2.0 * A;
                im2 = -Math.sqrt(-delta) / 2.0 * A;
                System.out.printf("raizes imaginárias\n%f i%f\n%f i%f\n", raiz1, im1, raiz2, im2);
            }
        } else {
            System.out.printf("Não é do 2 Grau!!!\n");
        }
    }
}
