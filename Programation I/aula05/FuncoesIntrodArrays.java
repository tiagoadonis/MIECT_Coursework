
import java.util.Scanner;
/*
 * Created by jam on 12-out-2015
 * Programação modular
 */

public class FuncoesIntrodArrays{

    public static void main(String[] args) {
        // Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);
        int valor, resultado;
        char minusc[]; //= new char[2];
        char maiuscula = 'M';
        System.out.print("Factorial de: ");
        valor = ler.nextInt();
        resultado = factorial(valor);
        System.out.printf("%d\n", resultado);
        // letra minúscula
        minusc = minuscula(maiuscula);
        System.out.printf("%c --> %c %c\n", maiuscula, minusc[0],minusc[1] );
        // potencia x^n
        System.out.printf("%f Math = %f\n", potencia(2.5, 4), Math.pow(2.5, 4.0));
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
// Testa se parâmetro é uma letra maiuscula
// devolve um array de chars com o resultado: 
//		Na 1ª posição '-' se houver erro, '+' se correto
//		na 2ª posição a letra minuscula
  

    public static char[] minuscula(char letra) {
		char m[] = new char[2];
        m[0] = '-'; // erro na conversão
        int distancia = (byte) 'c' - (byte) 'C';
        if (letra >= 'A' && letra <= 'Z') {
            m[1] = (char) ((byte) letra + distancia); // resultado
            m[0] = '+'; // conversão correta
        }
        return m;
    }
// função que calcula a potência 

    public static double potencia(double x, int n) {
        double res = x;
        for (int i = 1; i <= n - 1; i++) {
            res = res * x;
        }
        return res;
    }
}
