import java.util.*;

public class a5e3 {
 
 public static void main (String args[]) {
  
 // dados de entrada 
 int ano = Functions5_2.getIntPos("Introduza o ano: ");
 int mes = Functions5_2.getIntRange(1,12,"Introduza o mês: ");
 
 // invocando funções definidas nesta classe
 int dias = NumDias(mes,ano);
 
 // saída
 System.out.printf("O mês %2d do ano %4d tem %2d dias.\n",mes,ano,dias);
 }
 
 public static boolean bissexto (int a) {
  boolean bs;
  if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)){
        bs = true;}
  else{
        bs = false;}
  return bs;
 }
 
 public static int NumDias (int m, int a) {
  int d;
  switch (m){
	case 2:
		d=28;
		if (bissexto(a)) d=29;
		break;
	case 4: case 6: case 9: case 11:
		d = 30;
		break;
	default: // restantes meses, 31 dias
		d = 31;
 }
  return d;
 } 
}
