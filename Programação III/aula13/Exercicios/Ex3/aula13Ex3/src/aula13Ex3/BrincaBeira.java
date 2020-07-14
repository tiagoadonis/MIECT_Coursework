package aula13Ex3;
import java.util.*;

public class BrincaBeira {
	private int numFunc;
	private ArrayList<String> func;
	private HashMap<String, String> toys;
	
	public BrincaBeira(int numFuncionarios) {
		this.numFunc = numFuncionarios;
		this.func = new ArrayList<>(numFuncionarios);
		this.toys = new HashMap<>();
	}
	
	public void addFunc(String nome, String apelido) {
		if(func.size() <= this.numFunc) {
			this.func.add(nome+" "+apelido);
		}
		else {
			System.err.println("ERROR!! N�mero m�ximo de funcion�rios atingido!!");
			System.exit(1);
		}
	}
	
	public void listarFunc() {
		for(int i = 0; i < func.size(); i++) {
			System.out.println(i+1+") "+func.get(i));
		}
	}
	
	public void darBrinquedo(String brinquedo) {
		int num = (int) (this.func.size() * Math.random());
		if(!toys.containsKey(func.get(num))) {
			toys.put(func.get(num), brinquedo);
			System.out.println(func.get(num)+" -> "+brinquedo);
		}else {
			do {
				num = (int) (this.func.size() * Math.random());
			}while(toys.containsKey(func.get(num)));
			toys.put(func.get(num), brinquedo);
			System.out.println(func.get(num)+" -> "+brinquedo);
		}
	}
	
	public ArrayList<String> primeirosNomes() {
		ArrayList<String> tmp = new ArrayList<>();
		for(int i = 0; i < func.size(); i++) {
			String[] nomes = func.get(i).split(" ");
			if (!tmp.contains(nomes[0])) {
				tmp.add(nomes[0]);
			}
		}
		return tmp;
	}
	
	public HashMap<String, Integer> freqPrimeirosNomes() {
		HashMap<String, Integer> tmp = new HashMap<>();
		for(int i = 0; i < func.size(); i++) {
			String[] nomes = func.get(i).split(" ");
			if (!tmp.containsKey(nomes[0])) {
				tmp.put(nomes[0], 1);
			}
			else {
				tmp.put(nomes[0], tmp.get(nomes[0])+1);
			}
		}
		return tmp;
	}
	
	public void ingressosFutebol() {
		String[] tmp = new String[func.size()];
		func.toArray(tmp);
		for (int i = 0; i < func.size(); i++) {
			System.out.println(i+1 + "� jornada: "+tmp[i]);
		}
	}
}
