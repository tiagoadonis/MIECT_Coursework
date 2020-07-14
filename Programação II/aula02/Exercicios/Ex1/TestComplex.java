import static java.lang.System.*;
import java.util.*;

public class TestComplex {
 
static Scanner sc = new Scanner (System.in);
 
  // Exemplo simples de utilização da class Complex
  public static void main(String[] args) {
    Complex a = new Complex(5.0, 6.0);
	
	double re = Double.parseDouble(args[0]);
	double im = Double.parseDouble(args[1]);
	Complex b = new Complex(re, im);
	
	out.print("Re: ");
	double real = sc.nextDouble();
	out.print("Im: ");
	double imaginaria = sc.nextDouble();
	Complex c = new Complex(real, imaginaria);
	 out.println("");
	 
    // Vamos usar métodos do objeto a
    out.println("Objeto A:");
    out.println("  (" + a.real() + " + " + a.imag() + "i)");
    out.println("  parte real = " + a.real());
    out.println("  parte imaginaria = " + a.imag());
    out.println("  modulo = " + a.abs());
    out.printf("  argumento =  %2.2f\n", a.arg());
    out.println("");
    
    out.println("Objeto B (lido a partir do terminal):");
    out.println("  (" + b.real() + " + " + b.imag() + "i)");
    out.println("  parte real = " + b.real());
    out.println("  parte imaginaria = " + b.imag());
    out.println("  modulo = " + b.abs());
    out.printf("  argumento =  %2.2f\n", b.arg());
    out.println("");
    
    out.println("Objeto C (lido a partir da consola):");
    out.println("  (" + c.real() + " + " + c.imag() + "i)");
    out.println("  parte real = " + c.real());
    out.println("  parte imaginaria = " + c.imag());
    out.println("  modulo = " + c.abs());
    out.printf("  argumento =  %2.2f\n", c.arg());
    out.println("");
  }

}
