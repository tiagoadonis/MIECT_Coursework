package aula08Ex1;

public class GameHandler {
	char jogador1 = 'X';
	char jogador2 = 'O';
	GameEngine jogo = new GameEngine(jogador1, jogador2);
	
	public void efetuarJogada(int coluna, int linha) {
		if (jogo.jogadaValida(linha, coluna)) {
			jogo.jogada(linha, coluna);
		}else {
			System.out.println("ERRO: Jogada Invalida!!!");
		}
	}
	
	public String ultimoJogador() {
		return String.valueOf(jogo.ultimoJogador());
	}
	
	public boolean terminado() {
		return jogo.terminado();
	}
	
	public boolean ultimoJogadorGanhou() {
		return jogo.ultimoJogadorGanhou();
	}
}
