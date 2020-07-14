
import java.util.Scanner;
/*
 * Created by jam on 24-set-2015
 Cálculo das raízes reais de um polinómio de 2º grau. Ax^2 + Bx + C = 0
 */

public class PolinomioRaizesFunc {

    public static void main(String[] args) {
        // Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);
        // variáveis
        double A1, B1, C1, Xi, Xf; // coeficientes do polinómio
        double dx = 0.1;
        int nr, mais;
        // Ler coeficientes A; B; C e intervalo de x
        do {
            System.out.println("Introduza os coeficientes A, B, C do polinomio do 2grau:");
            do {
                A1 = ler.nextDouble();
                if (A1 == 0) {
                    System.out.println("A não pode ser 0, repita:");
                }
            } while (A1 == 0);
            B1 = ler.nextDouble();
            C1 = ler.nextDouble();
            System.out.println("Introduza o intervalo Xinicial e Xfinal:");
            Xi = ler.nextDouble();
            Xf = ler.nextDouble();

            nr = RaizesPol2(A1, B1, C1, Xi, Xf, dx);
            System.out.printf("Pol. tem %d raizes\n\n", nr);
            System.out.print("Para continuar (1) fim (0):");
            mais = ler.nextInt();
        } while (mais == 1);
    }

    // função para cálculo das raízes de um polinómio do 2 
    public static int RaizesPol2(double A, double B, double C, double xi, double xf, double delta) {
        int npontos, nraizes = 0;
        double x, y, y0;
        npontos = (int) ((xf - xi) / delta);
        x = xi;
        y0 = A * x * x + B * x + C;
        for (int i = 0; i < npontos; i++) {
            x = x + delta;
            y = A * x * x + B * x + C;
            //raiz = ' ';
            if ((y0 > 0 && y <= 0) || (y0 < 0 && y >= 0)) {
                nraizes = nraizes + 1;
            }
            // imprime resultado
            // System.out.printf("x, y = %f, %f %c\n", x, y, raiz);
            y0 = y;
        }
        return nraizes;
    }
}
