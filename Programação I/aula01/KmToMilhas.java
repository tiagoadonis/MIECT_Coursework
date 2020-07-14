import java.util.Scanner;
public class KmToMilhas
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    final double conversao = 1.609; // constante para conversao
    double km;    // definicao da variavel de entrada
    double milhas; // definicao da variavel de saida
/* comentários - outra forma
   varias linhas de comentários
*/
    // 1) Ler os dados
    System.out.print("Distancia em milhas: ");
    milhas = sc.nextDouble();
    //milhas = 11.1;
    // 2) Calcular
    km = conversao * milhas; // calculo

    // 3) Escrever os resultados
    System.out.println("(1) A distancia em km e " + km );    // escrita
    System.out.printf("(2) A distancia em km e %6.1f\n", km); // escrita formatada
  }
}
