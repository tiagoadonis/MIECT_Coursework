package aula11_ex1_d;
import java.io.*;

public class TestStream {
	public static void main(String[] args) throws IOException {
		WordCounter wc = new WordCounter("text_file.txt");
		System.out.println("N�mero Total de Palavras: "+wc.totalWords);
		System.out.println("N�mero de Diferentes Palavras: "+wc.differentWords);
		System.out.println(wc.mapToString());
	}
}
