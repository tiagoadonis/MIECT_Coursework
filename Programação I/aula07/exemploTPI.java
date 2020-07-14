/*
 * Implemente um programa que use um ciclo para gerar aleatoriamente 4 valores inteiros de tensão arterial,
 * para as 8h, 12h, 16h e 20h, entre 50 e 200 mmHg, imprima os valores, calcule o valor máximo e mínimo
 * e imprima as horas com as tensões máxima e mínima.
 * - Usar uma função para gerar uma tensão inteira aleatoriamente no intervalo pedido;
 * - Usar função para imprimir as horas com uma dada tensão;
 */
import java.util.Scanner;

public class exemploTPI {

    public static void main(String[] args) {
        int [] tensoes = new int[4];
		String [] horarios = {" 8h", "12", "16", "20h"};
        int max;
        
        // gerar valor das 4 tensões
		for(int i=0; i< tensoes.length; i++)
			tensoes[i] = gerarTensao();

		// imprimir valores gerados (podia ser feito no ciclo for anterior)
		for(int i=0; i<tensoes.length; i++)
			System.out.printf("Tensão às %s - %2d\n", horarios[i], tensoes[i]);
 
		// imprimir tensoes iguais à máxima
		max = maximo(tensoes);
        imprimeTensoesIguais(max, tensoes, horarios);
    }

    // imprimir horas com a mesma tensão (t)
    static void imprimeTensoesIguais(int t, int [] tensoes, String [] horarios) {
        System.out.printf("Horas com a tensão de % 2d mmHg%n",t);
        for(int i = 0; i < tensoes.length; i++)
			if(t == tensoes[i])
				System.out.printf("Tensão às %s = %2d %n",horarios[i], tensoes[i]);
				
        // if (t == t1) System.out.printf("Tensão às  8H = %2d \n",t);
        // if (t == t2) System.out.printf("Tensão às 12H = %2d \n",t);
        // if (t == t3) System.out.printf("Tensão às 16H = %2d \n",t);
        // if (t == t4) System.out.printf("Tensão às 20H = %2d \n",t);
    }
    // gerar tensão aleatoriamente entre 50 e 200 mmHg
    static int gerarTensao() {
        return (int)(Math.random()*(200-50+1)+50);
    }
    // dados um array devolve o máximo
    static int maximo(int [] t){
		if (t.length == 0)
			return -1;
		int m = t[0];
		for(int i = 0; i < t.length; i++) 
			if (t[i] > m) m = t[i];
        return m;
    }
}
