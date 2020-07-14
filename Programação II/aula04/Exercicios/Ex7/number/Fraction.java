package number;

/**
 * Tipo de dados representando uma fracção.
 * Nesta versão pretende-se garantir um invariante (interno) mais forte:
 * as frações armazenadas devem ter sempre denominador positivo.
 * Isto permite simplificar alguns métodos.
 *
 * AVISO: Vários métodos podem dar erros devidos a overflow.
 * (Não deve haver problemas com numeradores e denominadores até 46430.)
 *
 * @author João Manuel Rodrigues
 * 2007--2018
 */

public class Fraction implements Comparable<Fraction>{
	private int num;
	private int den;
	
	/** Cria uma nova fracção a partir de um par (numerador, denominador).
	*  @param num numerador da nova fracção.
	*  @param den denominador da nova fracção.
	*  <b>Exige (pré-condição):</b> den != 0.
	*/
	public static final Fraction ZERO = new Fraction(0,1);
	public static final Fraction ONE = new Fraction(1,1);
	
	public Fraction(int num, int den) {
		assert den != 0; // check precondition
		this.num = num;
		this.den = den;
		if (this.den<0){
			this.num = this.num * (-1);
			this.den = this.den * (-1);
		}
		this.irredutivel(this);
		assert invariant(); // check object invariant
	}

	/* Testa o invariante do objeto.
	* Ou seja, a propriedade que define a validade de uma fração.
	* É para testar em asserções nos métodos.
	*/
	public boolean invariant() {
		if (den > 0) return true;   // O denominador não pode ser nulo!
		return false;
	}

	/** Converte uma string numa fracção.
	*  @param str String no formato {@code "inteiro/inteiro"}
	*             representando uma fracção válida.
	*  @return fracção correspondente a {@code str}.
	*/
	public static Fraction parseFraction(String str) {
		String[] p = str.split("/", 2);  // divide a string em até 2 partes
		int n = Integer.parseInt(p[0]);  // extrai numerador
		int d = (p.length==2)? Integer.parseInt(p[1]) : 1;
			// se tem 2 partes, extrai denominador, senão fica d=1
		return new Fraction(n, d);
	}

	/** Converte a fracção numa string.
	*  @return string com a representação desta fracção.
	*/
	public String toString() {
		// Com um invariante mais forte, podemos simplificar este método!
		assert invariant();
		String s;
		return s = num + "/" + den;
	}

	/** Devolve o numerador da fracção.
	*  @return numerador desta fração.
	*/
	public int num() { return num; }

	/** Devolve o denominador da fracção.
	*  @return denominador desta fração.
	*/
	public int den() { return den; }

	/** Multiplica esta fracção por outra (this * b).
	*  @param b multiplicando.
	*  @return fracção produto de this * b.
	*/
	public Fraction multiply(Fraction b) {
		int n = num*b.num;
		int d = den*b.den;
		Fraction p = new Fraction(n, d); // product
		return p;
	}

	/** Adiciona esta fracção com outra (this + b).
	*  @param b fracção a adicionar a esta.
	*  @return fracção soma de this + b.
	*/
	public Fraction add(Fraction b) {
		int n = num*b.den + den*b.num;
		int d = den*b.den;
		Fraction s = new Fraction(n, d); // sum
		return s;
	}

	public Fraction divide(Fraction b) {
		assert b.invariant() : "Error! Division by zero!";
		int n = num * b.den;
		int d = den * b.num;
		Fraction a = new Fraction(n, d);
		return a;
	}

	public Fraction subtract(Fraction b) {
		int n = num*b.den - b.num*den;
		int d = den * b.den;
		Fraction c = new Fraction(n, d);
		return c;
	}

	public boolean equals(Fraction b) {
		return (num/den) == (b.num/b.den);
	}

	public int compareTo(Fraction b) {
		if(num/den > b.num/b.den){
			return 1;
		}
		else if (num/den < b.num/b.den){
			return -1;
		}
		else{
			return 0;
		}
	}
	
	public Fraction irredutivel(Fraction r){
    for (int i=2; i<r.num || i<r.den; i++) {
      while(r.num%i==0 && r.den%i==0){
        r.num = r.num/i;
        r.den = r.den/i;
      }
    }
    return r;    
  }
}
