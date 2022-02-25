import static java.lang.System.*;

public class Ex4 {
	
	public static void main (String[] args) {
		for (int i = 0; i < args.length; i++){
			out.println("\""+args[i]+"\" -> \""+reverseString(args[i])+"\"");    
		}
	}
	
	public static String reverseString (String str){
		String a = "";
		if (str.length() > 0){
			a = reverseString(str.substring(1)) + str.charAt(0);
		}
		return a;
	}
}
