package aula05Ex3;
import java.io.*;

public interface AgendaInterface {
	public Pessoa[] readFromFile(String filename) throws IOException;
	public void writeToFile(String filename, Pessoa[] pessoas) throws IOException;
}
