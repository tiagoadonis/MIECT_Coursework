import static java.lang.System.*;

public class MDC {
	
	public static void main (String[] args) {
		if(args.length!=2){
			err.println("USO: java -ea MDC <a> <b>");
			exit(1);
		}
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		out.println("mdc("+a+", "+b+") = "+algEuclides(a, b));
	}
	
	public static int algEuclides(int a, int b){
		int mdc;
		if ( b == 0){
			mdc = a;
		}else{
			mdc = algEuclides(b, a % b);
		}
		return mdc;
	}
}

