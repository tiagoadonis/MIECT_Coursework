/*
 * JAM, 4-dez-17
 */
import java.util.Scanner;
import java.io.*;

public class Ordenar1 {
    public static void main(String[] args) throws IOException{
        Scanner kb = new Scanner(System.in);
        // le números inteiros de um ficheiro
        String name = new String();
        System.out.print("Nome ficheiro: ");
        name = kb.nextLine();
        // verifica quantos números tem o ficheiro
        int n = fileSize(name);

        System.out.println("O ficheiro tem " + n + " números");
        // cria array e le numeros do ficheiro
        int a[] = new int[n];
        readArrayFromFile(a, name);
        printArray(a);
        // ordena de forma crescente
        bubbleSort(a);
        System.out.println("Ordem crescente: ");
        printArray(a);
        // ordena de forma decrescente
        selectSort(a);
        System.out.println("Ordem decrescente: ");
        printArray(a);
        // procura valor no array


    }

    // ordena por ordem decrescente
    public static void selectSort(int a[]) {
        for(int i = 0 ; i < a.length -1 ; i++) {
            for(int j = i+1 ; j < a.length ; j++) {
                if(a[i] < a[j]) {   // < ordem decrescente
                    swap(a, i, j);
                }
            }
        }
    }
    // ordena por ordem crescente
    public static void bubbleSort(int a[]) {
        boolean troca;
        int n = 0; // número de valores da lista ordenada
        do {
            troca = false;
            for(int i = 0 ; i <= a.length - 2 - n; i++) {
                if(a[i] > a[i+1]) {
                    swap(a, i, i+1);
                    troca=true;
                }
            }
            n++;  // +1 valor ordenado, que fica no fim da lista
        } while(troca);
    }

    public static void swap(int a[], int i, int j) {
        int tmp;
        tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void printArray(int a[]) {
        for(int i = 0 ; i < a.length ; i++) {
            System.out.printf("%d\n", a[i]);
        }
    }

    public static void readArrayFromFile(int a[], String name)throws IOException{
        File f = new File(name);
        Scanner sc = new Scanner(f);
        for(int i = 0 ; i < a.length ; i++) {
            a[i] = sc.nextInt();
        }
    }

    public static int fileSize(String name)throws IOException{

        File f = new File(name);
        Scanner sc = new Scanner(f);
        int n = 0;
        while(sc.hasNextInt()) {
            n++;
            sc.nextInt();
        }
        sc.close();

        return n;
    }
}
