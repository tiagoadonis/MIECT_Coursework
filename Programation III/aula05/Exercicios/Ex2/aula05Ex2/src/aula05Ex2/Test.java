package aula05Ex2;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// Criação de Objetos
		Automovel a1 = new Automovel(Color.Preto, 1990, "34-32-CD", 1500, 170, 90, Combustivel.Diesel, false);
		Automovel a2 = new Automovel(Color.Branco, 2005, "76-CA-01", 1900, 200, 120, Combustivel.Gasolina, true);
		Automovel a3 = new Automovel(Color.Azul, 2000, "04-DE-04", 1300, 140, 80, Combustivel.GPL, true);
		
		Bicicleta b1 = new Bicicleta(Color.Amarelo, 2010, true);
		Bicicleta b2 = new Bicicleta(Color.Laranja, 2015, false);
		
		Moto m1 = new Moto(Color.Verde, 2015, "AA-32-21", 1500, 200, 100, Combustivel.Gasolina, true);
		Moto m2 = new Moto(Color.Roxo, 2018, "12-BC-23", 1900, 250, 140, Combustivel.Gasolina, false);
		
		CarroPolicia cp1 = new CarroPolicia(Color.Branco, 2010, "23-GH-90", 1900, 220, 140, Combustivel.Gasolina, false, Servico.PSP);
		CarroPolicia cp2 = new CarroPolicia(Color.Verde, 2008, "93-KH-40", 1700, 200, 120, Combustivel.Gasolina, false, Servico.GNR);
		CarroPolicia cp3 = new CarroPolicia(Color.Vermelho, 2007, "78-BV-98", 1900, 260, 110, Combustivel.Gasolina, true, Servico.Bombeiros);
		
		BicicletaPolicia bp1 = new BicicletaPolicia(Color.Verde, 2010, false, Servico.PJ);
		
		MotoPolicia mp1 = new MotoPolicia(Color.Amarelo, 2017, "90-AB-98", 2000, 280, 160, Combustivel.Gasolina, false, Servico.INEM);
		
		// Criar lista e passar veiculos
		ArrayList<Veiculo> listaVeiculo = new ArrayList<Veiculo>();
		listaVeiculo.add(a1);
		listaVeiculo.add(a2);
		listaVeiculo.add(a3);
		listaVeiculo.add(b1);
		listaVeiculo.add(b2);
		listaVeiculo.add(m1);
		listaVeiculo.add(m2);
		listaVeiculo.add(cp1);
		listaVeiculo.add(cp2);
		listaVeiculo.add(cp3);
		listaVeiculo.add(bp1);
		listaVeiculo.add(mp1);
		
		// Print dos Veiculos
		for (Veiculo v : listaVeiculo) {
			System.out.println(""+v.toString());
		}
		System.out.println("");
		
		// Testes
		System.out.println("Potência do automóvel 1: "+a1.getPotencia());
		System.out.println("Potência do automóvel 2: "+a2.getPotencia());
		System.out.println("Potência da Mota 1: "+a1.getPotencia());
		System.out.println("");
		
		m1.dadosComsumo(600, 30);
		m2.dadosComsumo(500, 45);
		
		System.out.println("Consumo da mota 1: "+m1.getConsumo());
		System.out.println("Consumo da mota 2: "+m2.getConsumo());
		System.out.println("");
		
		System.out.println("Combustivel do automvel 1: "+a1.getCombustivel());
		System.out.println("Combustivel do automvel 2: "+a2.getCombustivel());
		System.out.println("Combustivel do automvel 3: "+a3.getCombustivel());
		System.out.println("Combustivel do Carro Polícia 1: "+cp1.getCombustivel());
		System.out.println("Combustivel do Carro Polícia 2: "+cp2.getCombustivel());
		System.out.println("Combustivel do Carro Polícia 3: "+cp3.getCombustivel());
		System.out.println("");
		
		System.out.println("Serviço de Emergência do Carro Polícia 1 (id: "+cp1.getID()+"): "+cp1.getTipo());
		System.out.println("Serviço de Emergência do Carro Polícia 2 (id: "+cp2.getID()+"): "+cp2.getTipo());
		System.out.println("Serviço de Emergência do Carro Polícia 3 (id: "+cp3.getID()+"): "+cp3.getTipo());
		System.out.println("Serviço de Emergência da Bicileta Polícia 1 (id: "+bp1.getID()+"): "+bp1.getTipo());
		System.out.println("Serviço de Emergência do Mota Polícia 1 (id: "+mp1.getID()+"): "+mp1.getTipo());
		System.out.println("");
		
		// Ordenação da lista
		
		Veiculo[] arrayVeiculos = new Veiculo[12];
		UtilCompare.sortArray(listaVeiculo.toArray(arrayVeiculos));
		System.out.println("Veiculos ordenados por ano:");
		for(Veiculo v : arrayVeiculos) {
			System.out.println(v);
		}
	}

}
