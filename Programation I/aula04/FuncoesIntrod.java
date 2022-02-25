
import java.util.Scanner;
/*
 * Created by jam on 12-out-2015
 * Programação modular
 */

public class FuncoesIntrod {

    public static void main(String[] args) {
        // Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);
        int valor, resultado;
        System.out.print("Factorial de: ");
        valor  = ler.nextInt();
        resultado = factorial (valor);
        System.out.printf("%d\n", resultado);
        // letra minúscula
        System.out.printf("%c\n", minuscula('B'));
        // potencia x^n
        System.out.printf("%f Math = %f\n", potencia(2.5, 4), Math.pow(2.5,4.0));
    }
// função para cálculo do factorial
    public static int factorial(int n) {
        int fact = 1;
      
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
// função que converte uma letra Maiúscula para minúscula    
    public static char minuscula(char letra){
        int distancia = (byte)'a' - (byte)'A';
        return (char)((byte)letra + distancia);
    }
// função que calcula a potência 
    public static double potencia(double x, int n){
        double res=x;
        for (int i=1; i<= n-1 ; i++){
            res = res * x;
        }
        return res;
    }
}
