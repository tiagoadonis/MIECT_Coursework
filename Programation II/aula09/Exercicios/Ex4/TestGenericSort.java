import static java.lang.System.*;
import java.util.Arrays;
import p2utils.Sorting;

public class TestGenericSort{
	public static void main(String[] args){
		Sorting.mergeSort(args, 0, args.length);
		out.println(Arrays.toString(args));
	}
}
