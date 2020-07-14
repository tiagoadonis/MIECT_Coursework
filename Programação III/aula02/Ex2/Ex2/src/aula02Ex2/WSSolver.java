package aula02Ex2;
import java.util.*;
import static java.lang.System.*;

public class WSSolver {

static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args){
		out.print("Introduzar o nome do ficheiro a ler: ");
		String str = sc.nextLine();
		Game game = new Game(str);
		game.play();
		out.println("");
		game.printOutput();
	}

}
