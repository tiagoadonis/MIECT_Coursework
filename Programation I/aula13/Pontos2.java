import java.util.*;
public class Pontos2 {
    static Scanner sc = new Scanner(System.in);
    public static void main (String args[]) {
        Ponto2 p1, p2;
        // Uso dos construtores
        p1 = new Ponto2(1.0,1.0);
        p2 = new Ponto2();
        p2 = lerPonto();
        // Teste dos métodos
        System.out.printf("Distancia entre p1 e p2 = %.2f; %.2f\n",distancia(p1, p2), p2.dist(p1) );
        p1.printP();
        System.out.println(p2.toString());
        System.out.printf("Distancia de p2 para origem = %f\n",p2.dist(0.0,0.0));
         System.out.println(p2.getX());
    }
    public static Ponto2 lerPonto() {
        Ponto2 p = new Ponto2();
        System.out.print("x: ");
        p.x = sc.nextDouble();
        System.out.print("y: ");
        p.y = sc.nextDouble();
        return p;
    }
    public static double distancia(Ponto2 a, Ponto2 b) {
        return Math.sqrt(Math.pow(b.x-a.x, 2) + Math.pow(b.y-a.y, 2));
    }

}

