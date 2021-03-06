package aula12Ex1;
import java.lang.reflect.*;
import java.util.*;

public class Test {

static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Insira o nome da classe: ");
		String className = sc.nextLine();
		
		String classFullName = Test.class.getPackageName()+"."+className;
		
		Class<?> classe = null;
		try {
			classe = Class.forName(classFullName);
		}
		catch(ClassNotFoundException e) {
			System.out.println("ERROR!! Class Not Found!");
			System.exit(1);
		}
		
		System.out.println();
		System.out.println("A classe \""+classe.getCanonicalName()+"\" � uma interface: "+classe.isInterface());
		System.out.println("Super classes: "+classe.getSuperclass().getName());

		System.out.println();
		Constructor<?> [] construtores = classe.getConstructors();
		getConstructors(construtores);
		
		System.out.println();
		Method[] metodos = classe.getMethods();
		getMetodos(metodos, classFullName);
	}
	
	public static void getConstructors(Constructor<?>[] constructores) {
		int i = 1;
		System.out.println("Construtores:");
		ArrayList<Constructor<?>> lista = new ArrayList<>();
		
		for(Constructor<?> tmp : constructores){
			lista.add(tmp);
		}
		Iterator<Constructor<?>> it = lista.iterator();
		
		while(it.hasNext()) {
			System.out.println(i+") "+it.next().toString());
			i++;
		}
	}
	
	public static void getMetodos(Method[] metodos, String classe) {
		int i = 1;
		System.out.println("Metodos:");
		ArrayList<Method> lista = new ArrayList<>();
		
		for(Method tmp : metodos) {
			String[] str = tmp.getDeclaringClass().toString().split(" ");
			if (str[1].equals(classe)) {
				lista.add(tmp);
			}
		}
		Iterator<Method> it = lista.iterator();
		
		while(it.hasNext()) {
			System.out.println(i+") "+it.next().toString());
			i++;
		}
	}
}
