
import java.util.Scanner;
/*
 * Created by jam on 24-set-2015
 Cálculo das raízes reais de um polinómio de 2º grau. Ax^2 + Bx + C = 0
 */

public class PolinomioRaizes {

    public static void main(String[] args) {
        // Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);
        // variáveis
        double A, B, C; // coeficientes do polinómio
        double y, y0, x; //
        double delta = 0.05;
        char raiz;
        // Ler coeficientes A; B; C
        System.out.print("Introduza os coeficientes A, B, C do polinomio do 2grau:");
        A = ler.nextDouble();
        B = ler.nextDouble();
        C = ler.nextDouble();
        // cálculo 2 raizes reais usando fórmula resolvente
        x = -3.0;
        y0 = A * x * x + B * x + C;
        for (int i = 0; i < 50; i++) {
            x = x + delta;
            y = A * x * x + B * x + C;
            raiz = ' ';
            if ((y0 > 0 && y <= 0) || (y0 < 0 && y >= 0))raiz = 'R';
            // imprime resultado
            System.out.printf("x, y = %f, %f %c\n", x, y, raiz);
            y0 = y;
        }

    }
}
