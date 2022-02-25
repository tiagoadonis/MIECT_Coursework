package aula08Ex1;

public class GameEngine {
	public final char JOGADOR1;
	public final char JOGADOR2;
	private  static char[][] tabuleiro;
	private char ultimoJogador;
	private int numJogadas;
	private int ultimaLinha, ultimaColuna;
	
	public GameEngine(char j1, char j2) {
		assert j1 != j2;
		assert j1 != '\0' && j2 != '\0';
		
		tabuleiro = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tabuleiro[i][j] = '\0';
			}
		}
		
		JOGADOR1 = j1;
		JOGADOR2 = j2;
		ultimoJogador = '\0';
		numJogadas = 0;
		ultimaLinha = ultimaColuna = -1;
	}
	
	public char ultimoJogador() { 
		  return ultimoJogador; 
	}
	
	public static boolean coordValidas(int linha, int coluna) { 
	    return (1 <= linha && linha <= 3) && (1 <= coluna && coluna <= 3);
	}
	
	public static boolean posicaoVazia(int linha, int coluna) {
		assert coordValidas(linha, coluna);
		return tabuleiro[linha-1][coluna-1] == '\0'; 
	}
	
	public boolean terminado() {
	    return (ultimoJogador != '\0') && (ultimoJogadorGanhou() || numJogadas >= 9); 
	}
	
	public boolean jogadaValida(int linha, int coluna){
		return coordValidas(linha, coluna) && posicaoVazia(linha, coluna) && !terminado();
	}
	
	public boolean ultimoJogadorGanhou() {
		assert ultimoJogador() != '\0';
		
		boolean result;
		
		result = contaIgual(ultimaLinha, ultimaColuna, -1, 0) + 1 + contaIgual(ultimaLinha, ultimaColuna, +1, 0) == 3;
		if (!result)
			result = contaIgual(ultimaLinha, ultimaColuna, 0, -1) + 1 + contaIgual(ultimaLinha, ultimaColuna, 0, +1) == 3;
		if(!result)
			result = contaIgual(ultimaLinha, ultimaColuna, -1, -1) + 1 + contaIgual(ultimaLinha, ultimaColuna, +1, +1) == 3;
		if (!result)
			result = contaIgual(ultimaLinha, ultimaColuna, -1, +1) + 1 + contaIgual(ultimaLinha, ultimaColuna, +1, -1) == 3;
		
		return result;
	}
	
	public void jogada(int linha, int coluna) {
		assert jogadaValida(linha, coluna);
		
		ultimoJogador = (ultimoJogador != JOGADOR1) ? JOGADOR1 : JOGADOR2;
		ultimaLinha = linha-1;
		ultimaColuna = coluna-1;
		tabuleiro[ultimaLinha][ultimaColuna] = ultimoJogador;
		numJogadas++;
	}
	
	private int contaIgual(int linha, int coluna, int dlinha, int dcoluna) {
	    int result = 0;
	    int l = linha + dlinha;
	    int c = coluna + dcoluna;
		if(l >= 0 && l < 3 && c >= 0 && c < 3 && tabuleiro[l][c] == ultimoJogador) result = 1 + contaIgual(l, c, dlinha, dcoluna);
	    return result;
	}
	
	public int numJogadas(){
		return numJogadas;
	}
}
