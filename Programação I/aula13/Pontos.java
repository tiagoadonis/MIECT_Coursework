public class Pontos {
    public static void main (String args[]) {
        Ponto p1 = new Ponto(1.0,1.0);
        Ponto p2 = new Ponto();
        System.out.printf("p1(%.1f,%.1f)\np2(%.1f,%.1f)\n",
			p1.x,p1.y,p2.x,p2.y);
    }
}
