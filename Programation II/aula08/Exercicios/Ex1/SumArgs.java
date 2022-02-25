import static java.lang.System.*;

public class SumArgs {
	
	public static void main (String[] args) {
		double [] arr = new double[args.length];
		
		for (int i = 0; i < args.length; i++){
			arr[i] = Double.parseDouble(args[i]);
		}
		
		out.println("Sum Of Arguments (Iterative): "+sumIterativa(arr, 0, arr.length));
		out.println("Sum Of Arguments (Recursive): "+sumRecursiva(arr, 0, arr.length));
	}
	
	static double sumIterativa(double[] arr, int start, int end) {
		assert 0 <= start && start <= end && end <= arr.length;
		double res = 0;
		for(int i = start; i < end; i++)
			res += arr[i];
		return res;
	}
	
	public static double sumRecursiva(double[] arr, int start, int end){
		double sum = 0;
		if(start < end){
			sum = arr[start] + sumRecursiva(arr, start+1, end);
		}
		return sum;
	}
}

