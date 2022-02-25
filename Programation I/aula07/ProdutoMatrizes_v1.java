/* Este programa calcula o produto de duas matrizes. Os valores das
 * matrizes são gerados aleatoriamente. Nesta versão, as matrizes são 
 * criadas nas funções. 
*/
import java.util.Scanner;
public class ProdutoMatrizes_v1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args) {
		int linA, linB, colA, colB;
		int [] [] A, B, C; 
		// ler dimensoes das matrizes A e B
		System.out.println("Matriz A:");
		linA = lerInteiro("Linhas : ", 1, 9);
		colA = lerInteiro("Colunas: ", 1, 9);
		
		System.out.println("Matriz B:");
		linB = colA;
		System.out.println("Linhas : " + linB);
		colB = lerInteiro("Colunas: ", 1, 9);
		
		// gerar valores das matrizes A e B
		A = gerarMatriz(linA, colA);
		B = gerarMatriz(linB, colB);
		
		// multiplicar matrizes
		C = multiplicar(A, B);

		// imprimir matrizes
		imprimir("Matriz A", A);
		imprimir("Matriz B", B);
		imprimir("Matriz C", C);
	}
	
	static int lerInteiro(String msg, int inf, int sup) {
		int n;
		do {
			System.out.print(msg);
			n = sc.nextInt();
		} while(n < inf || n > sup);
		return n;
	}
	
	static int [][] gerarMatriz(int lin, int col) {
		int [][] M = new int [lin][col];
		for(int i = 0; i < lin; i++)				// para cada linha
			for(int j = 0; j < col; j++)			// para cada coluna numa linha
				M[i][j] = (int)(Math.random()*6);
		return M;
	}
	
	static int [][] multiplicar(int [][] A, int [][] B) {
		int [][] C = new int[A.length][B[0].length];
		for(int i = 0; i < C.length; i++)			// para cada linha em C		
			for(int j = 0; j < C[i].length; j++) {	// para cada coluna em C
				// percorre os elementos numa linha de A e num coluna de B
				int soma = 0;
				for(int l = 0; l < A[i].length; l++)	 
					soma += A[i][l] * B[l][j];
				C[i][j] = soma;
			}
		return C;
	}
	
	static void imprimir(String titulo, int [][] M) {
		System.out.println(titulo);
		for(int i = 0; i < M.length; i++) {		
			for(int j = 0; j < M[i].length; j++)
				System.out.printf("%4d", M[i][j]);
			System.out.println();
		}
		System.out.println();
	}
}
