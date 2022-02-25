import java.util.*;

public class Functions5_2 {
 
  static Scanner sc = new Scanner(System.in);

 public static double sqr(double x) {
  double y; // variavel para resultado
  y = x*x; // calculo do resultado a partir dos dados
  return y; // devolver o resultado
 }
 
 public static double f (int n) {
   double y;
   y = 1/(1+sqr(n));
   return y;
 }
 
 public static double max(double a, double b){
   if(a >= b){
	return a;}
   else{
	return b;}
 }
 
 public static int max(int a, int b){
   if(a >= b){
	return a;}
   else{
	return b;}
 }
 
 public static double poly3 (double a, double b, double c, double d, double x) {
   double px = a*Math.pow(x,3)+b*Math.pow(x,2)+c*x+d;
   return px;
 }
 
 public static int fact (int v) {
   int f=1;
   for  (int n=1;n<=v;n++) {
     f*=n;}
   return f;  
 }

 public static int getIntPos(String msg){
  int n;
  do{
	System.out.print(msg);
	n = sc.nextInt();
  }while(n < 0);
  return n;
 }
 
 public static int getIntRange(int linf, int lsup, String msg){
  int n;
  do{
	System.out.print(msg);
	n = sc.nextInt();
  }while(n < linf  || n > lsup);
  return n;
 }

 public static void printNtimes(int n, String msg){
  for(int i = 0 ; i < n ; i++){
   System.out.print(msg);}
 }

}
