import static java.lang.System.*;
import java.util.*;

public class GuessGame {

	private int secretNumber, lastAttempt = -1 ; // to hold the secret
	private int min, max, numTent = 0;

	public GuessGame(int min, int max) {
		assert (min >= 0) && (max != 0) : "Min and max can't be null!!";
		this.secretNumber = ((int) (Math.random()*((max+1)-min))) + min;
		this.min = min;
		this.max = max;
	}

	public int min() {
		return this.min;
	}

	public int max() {
		return this.max;
	}

	public boolean validAttempt(int n) {
		return (n <= this.max) && (this.min <= n);
	}

	public boolean finished() {
		return this.secretNumber == this.lastAttempt;
	}

	public boolean attemptIsHigher() {
		return this.lastAttempt > this.secretNumber;
	}

	public boolean attemptIsLower() {
		return this.lastAttempt < this.secretNumber;
	}

	public void play(int n) {
		assert !finished() : "The game is already solved...";
		if (validAttempt(n)){
			this.numTent++;
			this.lastAttempt = n;
			if (attemptIsHigher()){
				System.out.print(""+lastAttempt+" is too high!");
			}
			if (attemptIsLower()){
				System.out.print(""+lastAttempt+" is too low!");
			}
		}
		else{
			System.out.print("ERROR: "+n+" is invalid");
		}
	}

	public int numAttempts() {
		return this.numTent;
	}

	/**
	* Simple tests of the GuessGame class.
	* This method tests the functionality of the GuessGame class.
	* It should be used by the programmer to test and debug the class.
	* It is not meant to be called in client programs.
	*
	* To run from the command line, use:
	*   java -ea GuessGame
	*/
	public static void main(String[] args) {
		requireEA();
		out.println("Starting tests.");
		GuessGame game = new GuessGame(1, 10);
		// initial tests:
		assert !game.finished() : "game should not be finished yet";
		assert game.min() == 1;
		assert game.max() == 10;
		assert game.numAttempts() == 0 : "there should be no attempts yet";
		for(int i = -10; i <= 20; i++) {
			assert game.validAttempt(i) == (i >= 1 && i <= 10);
		}
		// trying all wrong answers:
		int nplay = 0; // how may times play was called
		for(int n = 1; n <= 10; n++) {
			if (n != game.secretNumber) {
				game.play(n); // make a wrong guess
				nplay++;
				assert game.numAttempts() == nplay;
				assert !game.finished() : "game should not be finished yet";
				assert (n < game.secretNumber) == game.attemptIsLower();
				assert (n > game.secretNumber) == game.attemptIsHigher();
			}
		}
		// make the right guess:
		game.play(game.secretNumber);
		nplay++;
		assert game.finished() : "game should be finished now";
		assert game.numAttempts() == nplay;
		out.println("No error detected!");
	}

	/** Check if program is being run with -ea, exit if not. */
	static void requireEA() {
		boolean ea = false;
		assert ea = true; // assert with a side-effect, on purpose!
		if (!ea) {
			err.println("This program must be run with -ea!");
			exit(1);
		}
	}

}

