
import java.util.Scanner;
/*
 * Created by jam on 19-out-2015
 * Ler notas de 0 a 20 (terminar com valor negativo) e calcular media
 * e nº notas > média
 */

public class NotasMaioresMed {
    public static void main(String[] args) {
        // Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);
        int notas[] = new int[5];
        int nota, soma=0, num=0, maiorMedia=0;
        float media;
        System.out.println("Introduza as notas dos alunos (<0 termina):");
        System.out.printf("Nota aluno %3d: ",num+1);
        nota = ler.nextInt();
        while (nota >= 0) {
            soma = soma + nota;
            notas[num]=nota;
            num = num +1;
            System.out.printf("Nota aluno %3d: ",num+1);
            nota = ler.nextInt();
        }
        media = (float)soma/num;
        System.out.printf("Soma = %3d\nNum = %3d\nMedia = %4.1f\n",soma,num,media);
        for (int n=0; n <num; n++) {
            if (notas[n] > media) maiorMedia++;
        }
        for (int m : notas) {
            if (m > media) System.out.printf("nota > media: %d\n",m);
        }
        System.out.printf("Notas acima da media: %d\n",maiorMedia);

    }
}
