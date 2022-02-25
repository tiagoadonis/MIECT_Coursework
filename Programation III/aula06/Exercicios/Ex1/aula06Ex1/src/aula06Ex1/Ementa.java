package aula06Ex1;
import java.util.*;

public class Ementa {
	private String nome;
	private String local;
	private final HashMap<DiaSemana, LinkedList<Prato>> listaPratos = new HashMap<>();
	
	public Ementa(String nome, String local) {
		this.nome = nome;
		this.local = local;
	}
	
	public void addPrato(Prato prato, DiaSemana dia) {
		if (listaPratos.containsKey(dia)) { 	
			listaPratos.get(dia).add(prato);
		}
		else {
			LinkedList<Prato> tmp = new LinkedList<>();
			tmp.add(prato);
			listaPratos.put(dia, tmp);
		}
	}
	
	public void removePrato(Prato prato) {
		DiaSemana[] dias = new DiaSemana[listaPratos.keySet().size()];
		listaPratos.keySet().toArray(dias);
		for(DiaSemana a : dias) {
			LinkedList<Prato> tmp = listaPratos.get(a);
			Iterator<Prato> iterator = tmp.iterator();
			while(iterator.hasNext()) {
				Prato p = iterator.next();
				if (p.equals(prato)) {
					tmp.remove(p);
				}
			}
			listaPratos.put(a,tmp);
		}
	}
	
	public Prato selecPrato(Prato prato) {
		Prato tmpPrato = null;
		DiaSemana[] dias = new DiaSemana[listaPratos.keySet().size()];
		listaPratos.keySet().toArray(dias);
		for(DiaSemana a : dias) {
			LinkedList<Prato> tmp = listaPratos.get(a);
			Iterator<Prato> iterator = tmp.iterator();
			while(iterator.hasNext()) {
				Prato p = iterator.next();
				if (p.equals(prato)) {
					tmpPrato = p;
				}
			}
		}
		return tmpPrato;
	}
	
	public void addIngrediente(Alimento alim, Prato prato) {
		Prato tmpPrato = selecPrato(prato);
		if(tmpPrato.addIngrediente(alim)) {
			System.out.println("Ingrediente adicionado com sucesso!");
		}
		else {
			System.out.println("ERROR!! Não foi possível adicionar o ingrediente!");
		}
	}
	
	public void removeIngrediente(Alimento alim, Prato prato) {
		Prato tmpPrato = selecPrato(prato);
		if(tmpPrato.removeIngrediente(alim)) {
			System.out.println("Ingrediente removido com sucesso!");
		}
		else {
			System.out.println("ERROR!! Não foi possível remover o ingrediente!");
		}
	}
	
	@Override
	public String toString() {
		String s = "";
		DiaSemana[] sorted = listaPratos.keySet().toArray(new DiaSemana[0]);
		Arrays.sort(sorted);
		for(DiaSemana dia : sorted) {
			LinkedList<Prato> list = listaPratos.get(dia);
			for(Prato p : list.toArray(new Prato[0])) {
				s += p.toString()+", dia "+dia+"\n";
			}
		}
		return s;
	}
}
