/*
 * jam, out-2017
 * Ler notas de 0 a 20, calcular media
 *  e imprimir notas > média
 */
import java.util.Scanner;

public class Notas4a {

    public static void main(String[] args) {
        // Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);

        float media;

        int[] notas = {11,5,12,15,7,13,11,10}; // int notas[]
        //~ notas = new int[4];
        //~ gerarNotas(notas);
        notas = gerarNotas2(12);
        media = media(notas);
        for (int i=0;i<notas.length;i++){
            if (notas[i] > media)System.out.printf("Nota %d > média %n",i+1);
        }
        System.out.printf("Media = %4.1f%n",media);

        System.out.printf("%s %n",aToString(notas)); //para exibir as notas no ecrã
         System.out.println(notaExtenso(2));
    }
    static float media(int[] n){
        int soma =0;
        for (int i=0; i < n.length; i++ ) {
            soma = soma + n[i];
        }
        //~ n[0]=99;
        return (float)soma/n.length;
    }
    // f array to string
    static String aToString(int[] a){
        String s = "";
        for (int i=0;i<a.length;i++)s = s + a[i] + " ";
        return s;
    }
    // gerar array de n notas entre 0 e 20;
    static void gerarNotas(int[] a){
        for (int i=0;i<a.length;i++)a[i]=(int)(Math.random()*21);

    }
    static int[] gerarNotas2(int n){
        int[] a = new int[n];
        for (int i=0;i<a.length;i++)a[i]=(int)(Math.random()*21);
        return a;
    }
    // f devolve nota inteira por extenso
    static String notaExtenso(int v){
        String[] s = {"zero","um","dois","tres"};
        return s[v];
    }
    // f histograma
    // arrays 2d
}
