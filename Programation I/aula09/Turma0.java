/*
 *  JAM, 20-nov-2017
 *
 * Ler/gerar notas de 0 a 20  das várias avaliações de um aluno
 * 	e calcular media final
 *  dados para cada aluno: id aluno, teste 1,teste 2
*/
import java.util.Scanner;
public class Turma0 {
    // Scanner para leitura de dados do teclado
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        final int NALUNOS = 3;
        // define ARRAY de 2 DIMENSOES (linhas = alunos; colunas = dados de um aluno)
        int[][] turma= new int[NALUNOS][3];
        int id, soma=0, num=0;
        float media;

        //~ num = lerTurma(turma);
        turma = gerarTurma(10);
        num=turma.length;
        imprimirTurma(turma,num);
        // teste classe Aluno

    }
    static int lerTurma(int[][] t) {
        int nalunos=0;
        System.out.println("Introduza as notas dos alunos (ID = 0 termina):");
        System.out.printf("ID do aluno: ");
        int id = ler.nextInt();
        while (id > 0 && nalunos <t.length) {
            t[nalunos][0]=id;
            System.out.printf("Nota T1:");
            t[nalunos][1] = ler.nextInt();
            System.out.printf("Nota T2:");
            t[nalunos][2] = ler.nextInt();

            nalunos++;
            System.out.printf("ID do aluno: ");
            id = ler.nextInt();
        }
        return nalunos;
    }
    static int[][] gerarTurma(int nalunos) {
        int[][] t = new int[nalunos][3];
        int n=0;

        while (n <t.length) {
            t[n][0]= 10000 + (int)(Math.random()*100);
            t[n][1] = (int)(Math.random()*21);
            t[n][2] = (int)(Math.random()*21);
            n++;
        }
        return t;
    }
    static void imprimirTurma(int[][] t, int n) {
        if (n <= 0 || n > t[0].length)n = t[0].length;	//Testa limites array
        System.out.println("   ID   T1   T2 Final");
        for (int a=0; a <n; a++) {
            for (int c=0; c<t[a].length; c++)System.out.printf("%5d",t[a][c]);
            System.out.printf("%6.2f\n",(t[a][1]+t[a][2])/2.0);
        }
        System.out.printf("\nmed     %4.1f %4.1f \n",media(t,1,n), media(t,2,n));
    }
    static float media (int[][] tabela, int c, int nl) {
        if (nl <= 0 || nl > tabela[0].length)nl = tabela[0].length;//Testa limites array
        int soma=0;
        for (int n=0; n<nl; n++) {
            soma = soma + tabela[n][c];
        }
        return (float)soma/nl;
    }
    //classes

}


