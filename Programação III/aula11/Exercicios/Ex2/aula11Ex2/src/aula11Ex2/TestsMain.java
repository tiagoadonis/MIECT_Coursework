package aula11Ex2;
import java.util.*;

public class TestsMain{
	public static void main(String[] args) {
		List<Figura> list = new ArrayList<>();
		list.add(new Circulo(2));
		list.add(new Circulo(4));
		list.add(new Quadrado(2));
		list.add(new Rectangulo(2,3));
		list.add(new Rectangulo(3,4));
		
		System.out.println("Maior figura: "+maiorFiguraJ7(list));
		System.out.println("Maior perimetro: "+maiorPerimetroJ7(list));
		System.out.println("Area total das figuras: "+areaTotalJ8(list));
		System.out.println("Area total dos rectangulos: "+areaTotalJ8(list, "Rectangulo"));
	}
	
	private static Figura maiorFiguraJ7(List<Figura> figs){
		return figs.stream().max( new Comparator<Figura>() {
			@Override
			public int compare(Figura fig1, Figura fig2) {
				return fig1.compareTo(fig2);
			}
		}).get();
	}
	
	private static Figura maiorPerimetroJ7(List<Figura> figs) {
		return figs.stream().max(new Comparator<Figura>() {
			@Override
			public int compare(Figura fig1, Figura fig2) {
				double dif = fig1.perimetro() - fig2.perimetro();
				if (dif > 0) {
					return 1;
				}
				else if (dif < 0) {
					return -1;
				}
				else {
					return 0;
				}
			}
		}).get();
	}
	
	private static double areaTotalJ8(List<Figura> figs) {
		return figs.stream().mapToDouble(fig -> fig.area()).sum();
	}
	
	private static double areaTotalJ8(List<Figura> figs, String subtipoNome){
		return figs.stream()
				.filter(fig -> fig.getClass().getSimpleName().equals(subtipoNome))
				.mapToDouble(fig -> fig.area()).sum();
	}

}
