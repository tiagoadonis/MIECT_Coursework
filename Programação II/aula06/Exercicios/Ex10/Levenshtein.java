import static java.lang.System.*;
import java.util.*;

public class Levenshtein
{
	public static void main(String[] args) {
		if (args.length != 2) {
			out.println("Uso: java -ea Levenshtein <palavra1> <palavra2>");
			exit(1);
		}

		int d = distancia(args[0], args[1]);
		out.printf("\"%s\" <-> \"%s\" = %d\n", args[0], args[1], d);
	}
	
	public static int distancia(String P1, String P2){
		int d = 0;
		if(P2.length() == 0){
			d = P1.length();
		}
		else if (P1.length() == 0){
			d = P2.length();
		}
		else if(P1.charAt(0) == P2.charAt(0)){
			d = distancia(P1.substring(1), P2.substring(1));
		}
		else{
			int a = distancia(P1.substring(1), P2);
			int b = distancia(P1, P2.substring(1));
			int c = distancia(P1.substring(1), P2.substring(1));
			int min = Math.min(a, b);
			d = 1 + Math.min(min, c);
		}
		return d;
	}
}
