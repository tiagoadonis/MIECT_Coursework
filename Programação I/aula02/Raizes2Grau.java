import java.util.Scanner;
/*
 * Created by jam on 29-set-2015
 Cálculo das raízes reais e imaginárias de um polinómio de 2º grau. Ax^2 + Bx + C = 0
 * raizes = (-B +- raizq(B² - 4AC))/2A
 */

public class Raizes2Grau {

    public static void main(String[] args) {
        // Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);
        // variáveis
        double A,B,C; // coeficientes do polin.
        double R1, R2, I1,I2; // raizes
        double delta;
        // ler coeficientes do teclado
        System.out.print("Introduza os coeficientes do polin:");
        A = ler.nextDouble();
        if (A != 0) {
            B = ler.nextDouble();
            C = ler.nextDouble();
            delta = B*B-4*A*C;
            if (delta >= 0) {
                R1 = (-B+Math.sqrt(delta))/(2*A);
                R2 = (-B-Math.sqrt(delta))/(2*A);
                System.out.printf("Raizes: %f, %f\n",R1,R2);
            } else {
                R1 = -B/(2*A);
                I1 = +Math.sqrt(-delta)/(2*A);
                R2 = R1;
                I2 = -I1;
                System.out.printf("raizes imaginarias: \n%f i%f\n%f i%f\n",R1,I1,R2,I2);
            }

        } else {
            System.out.printf("A = 0\n");
        }


    }
}
