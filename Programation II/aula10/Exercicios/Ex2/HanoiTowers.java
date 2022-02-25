import static java.lang.System.*;
import java.util.Scanner;
import p2utils.Stack;

public class HanoiTowers{
	private Stack<Integer> A;
	private Stack<Integer> B;
	private Stack<Integer> C;
	private int numMoves = 0;
	
	public HanoiTowers(int n){
		this.A = new Stack();
		this.B = new Stack();
		this.C = new Stack();
		for (int i = n; i > 0; i--){
			this.A.push(i);
		}
	}
	
	public void solve(){
		showTowers();
		solve(this.A.size(), this.A, this.B, this.C);
	}
	private void solve(int n, Stack<Integer> A, Stack<Integer> B, Stack<Integer> C){
		if (n > 1){
		  solve(n - 1, A, C, B);
		  moveDisk(A, B);
		  solve(n - 1, C, B, A);
		  moveDisk(B, C);
		}
		else if(n == 1){
			solve(n - 1, A, C, B);
			moveDisk(A, C);
		}
	}
	
	private void moveDisk(Stack<Integer> A, Stack<Integer> B){
		B.push(((Integer)A.top()).intValue());
		A.pop();
		this.numMoves++;
		showTowers();
	}
	
	public void showTowers(){
		out.printf("After %d moves:\n", this.numMoves);
		out.println("A: " + this.A.reverseToString());
		out.println("B: " + this.B.reverseToString());
		out.println("C: " + this.C.reverseToString());
		out.println();
	}
	
	public int numberOfMoves(){
		return numMoves;
	}
}
