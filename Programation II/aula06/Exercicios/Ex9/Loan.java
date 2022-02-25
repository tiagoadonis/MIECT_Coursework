import static java.lang.System.*;

public class Loan {
	
	public static void main (String[] args) {
		if (args.length != 4){
			err.println("USO: java -ea Loan n M T P");
			exit(1);
		}
		int n = Integer.parseInt(args[0]);
		double M = Double.parseDouble(args[1]);
		double T = Double.parseDouble(args[2]);
		double P = Double.parseDouble(args[3]);
		out.println("(iterativo) d("+n+") = "+iterLoan(n,M,T*0.01,P));
		out.println("(recursivo) d("+n+") = "+recLoan(n,M,T*0.01,P));
	}
	
	public static double iterLoan(int n, double M, double T, double P){
		double loan = M;
		for(int i = 0; i < n ; i++){
			loan = loan + loan*T - P;
		}
		return loan;
	}
	
	public static double recLoan(int n, double M, double T, double P){
		double loan = M;
		if (n > 0){
			loan = recLoan(n-1, M, T, P);
			return (loan + loan*T - P);
		}
		return M;
	}
}

