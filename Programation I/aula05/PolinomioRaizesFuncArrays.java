
import java.util.Scanner;
/*
 * Created by jam on 19-out-2015
 * Cálculo do nº de raízes reais de um polinómio de 2º grau. Ax^2 + Bx + C = 0
 * cálculo das raízes - Arrays como parâmetros de entrada e saída
 */

public class PolinomioRaizesFuncArrays {

    public static void main(String[] args) {
        // Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);
        // variáveis
        double A1, B1, C1, Xi, Xf; // coeficientes do polinómio
        double dx = 0.1;
        double raiz[] = new double[2];
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

            nr = RaizesPol2(A1, B1, C1, Xi, Xf, dx, raiz);
            System.out.printf("Pol. tem %d raizes\nR1 = %f, R2 = %f\n", nr, raiz[0],raiz[1]);
            System.out.print("Para continuar (1) fim (0):");
            mais = ler.nextInt();
        } while (mais == 1);
    }

    b// função para cálculo das raízes de um polinómio do 2 
    // A função devolve o nº de raizes encontradas e no parâmetro r as raizes
    public static int RaizesPol2(double A, double B, double C, double xi, double xf, double delta, double r[]) {
        int npontos, nraizes = 0;
        double x, y, y0;
        npontos = (int) ((xf - xi) / delta);
        x = xi;
        y0 = A * x * x + B * x + C;
        for (int i = 0; i < npontos; i++) {
            x = x + delta;
            y = A * x * x + B * x + C;
            if ((y0 > 0 && y <= 0) || (y0 < 0 && y >= 0)) {
				r[nraizes] = x;
                nraizes = nraizes + 1;
                
            }
            y0 = y;
        }
        return nraizes;
    }
}
