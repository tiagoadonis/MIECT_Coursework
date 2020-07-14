package aula06Ex1;
import java.io.*;

public class Test {
	public static void main(String[] args) {
		Ementa ementa = new Ementa("Especial Caloiro", "Snack da UA");
		Prato[] pratos = new Prato[10];
		
		for (int i=0; i < pratos.length; i++){
			pratos[i] = randPrato(i);
			int cnt = 0;
			
			while (cnt <2){ 	// Adicionar 2 Ingredientes a cada Prato
				Alimento aux = randAlimento();
				if (pratos[i].addIngrediente(aux)) {
					cnt++;
				}
				else {
					System.out.println("ERRO: N�o � possivel adicionar '" +
							           aux + "' ao -> " + pratos[i]);
				}
			}
			ementa.addPrato(pratos[i], DiaSemana.rand()); // Dia Aleat�rio
		}
		System.out.println("\n" + ementa);
		
		// Serialization Test
		String path = "D:\\Universidade\\MIECT\\3� Ano\\1� Semestre\\Cadeiras\\Programa��o III\\Pr�ticas\\aula06\\Exercicios\\Ex1\\aula06Ex1\\bin\\aula06Ex1";
		exportEmenta(ementa, path);
		System.out.println("\nImported from " + path + ": \n"  + loadEmenta(path));
	}
			
	// Retorna um Alimento Aleatoriamente
	public static Alimento randAlimento() {
		switch ((int) (Math.random() * 4)) {
			default:
			case 0:
				return new Carne(Variedade.frango, 22.3, 345.3, 300);
			case 1:
				return new Peixe(Tipo.congelado, 31.3, 25.3, 200);
			case 2:
				return new Legume("Couve Flor", 21.3, 22.4, 150);
			case 3:
				return new Cereal("Milho", 19.3, 32.4, 110);
		}
	}
			
	// Retorna um Tipo de Prato Aleatoriamente
	public static Prato randPrato(int i) {
		switch ((int) (Math.random() * 3)) {
			default:
			case 0:
				return new Prato("Prato N." + i);
			case 1:
				return new PratoVegetariano("Prato N." + i + " (Vegetariano)");
			case 2:
				return new PratoDieta("Prato N." + i + " (Dieta)", 90.8);
		}
	}
	
	// carrega a ementa a partir de um ficheiro
	public static Ementa loadEmenta(String path) {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(path));
			Object obj = in.readObject();
			in.close();
			if(obj instanceof Ementa) {
				return (Ementa) obj;
			}
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void exportEmenta(Ementa m, String path) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));
			out.writeObject(m);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
