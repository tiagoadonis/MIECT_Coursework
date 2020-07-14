import static java.lang.System.*;

public class DatasPassadas {

  public static void main(String[] args) {
    Data atual = new Data();
    Data natal = new Data(25, 12, 2018);
    out.printf("%s\n",natal.extenso());
    		
    do{
		natal.seguinte();
		out.printf("%s\n",natal.extenso());	
	}while((natal.ano() != atual.ano()) || (natal.mes() != atual.mes()) || (natal.dia() != atual.dia()));
  }

}

