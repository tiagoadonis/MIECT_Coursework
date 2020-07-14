package aula02Ex2;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Game {
	private char[][] grid;
	private List<String> dict;
	private List<String> result;
	private final int N;
	
	public Game (String fileName) {
		this.grid = new char [80] [80];
		Scanner scf = null;
		try {
			scf = new Scanner(new File(fileName));
		}catch (FileNotFoundException e) {
			out.println("File \""+fileName+"\" does not exist!!");
			exit(1);
		}
		
		String firstLine = scf.nextLine();
		int y = 0;
		N = firstLine.length();
		for(int x = 0; x < N; x++) {
			grid[y] [x] = firstLine.charAt(x);
		}
		y++;
		dict = new ArrayList<>(N);
		
		while(scf.hasNextLine()) {
			String line = scf.nextLine();
			if(!line.contains(",")) {
				for (int x = 0; x < N; x++) {
					grid[y] [x] = line.charAt(x);
				}
				y++;
			}else {
				for (String s : line.split(", ")) {
					dict.add(s.toUpperCase());
				}
			}
		}
		result = new LinkedList<>();
	}
	
	public void printOutput() {
		for (String r : result) {
			out.println(r);
		}
	}
	
	public void play() {
		for (int y = 0; y < N; y++) {
			for (int x = 0; x < N; x++) {
				search(x,y);
			}
		}
	}
	
	private void search(int x, int y) {
		for (String word :dict) {
			if (grid[y][x] == word.charAt(0)) {
				Position currentPos = new Position(y,x);
				if (x + word.length()-1 < N) {
					String dir = "rigth";
					if (foundWord(word, dir, currentPos, new Position(y, x+word.length()))) {
						result.add(word+"	"+currentPos+"	"+dir);
					}
				}
				if(x-word.length()+1>=0) { 
					String dir = "left";
					if(foundWord(word, dir, currentPos,new Position(y,x-word.length()))) {
						result.add(word+"	"+currentPos+"	"+dir);
					}
				}
				
				/* Vertical search*/
				if(y+word.length()-1<N) { 
					String dir = "down";
					if(foundWord(word, dir, currentPos,new Position(y+word.length(),x))) {
						result.add(word+"	"+currentPos+"	"+dir);
					}
				}
				
				if(y-word.length()+1>=0) { 
					String dir = "up";
					if(foundWord(word, dir, currentPos,new Position(y-word.length(),x))) {
						result.add(word+"	"+currentPos+"	"+dir);
					}
				}
				
				if(y+word.length()-1<N && x+word.length()-1<N) { 
					String dir = "downright";
					if(foundWord(word, dir, currentPos,new Position(y+word.length(),x+word.length()))) {
						result.add(word+"	"+currentPos+"	"+dir);
					}
				}
				
				if(y-word.length()+1>=0 && x+word.length()-1<N) { 
					String dir = "upright";
					if(foundWord(word, dir, currentPos,new Position(y-word.length(),x+word.length()))) {
						result.add(word+"	"+currentPos+"	"+dir);
					}
				}
				
				if(y+word.length()-1<N && x-word.length()+1>=0) {
					String dir = "downleft";
					if(foundWord(word, dir, currentPos,new Position(y+word.length(),x-word.length()))) {
						result.add(word+"	"+currentPos+"	"+dir);
					}
				}
				
				if(y-word.length()+1>=0 && x-word.length()+1>=0) { 
					String dir = "upleft";
					if(foundWord(word, dir, currentPos,new Position(y-word.length(),x-word.length()))) {
						result.add(word+"	"+currentPos+"	"+dir);
					}
				}
			}
		}
	}
	
	private boolean foundWord(String word, String dir, Position lowerLimit, Position upperLimit) {
		
		int incrementX = 0;
		int incrementY = 0;
		
		int x = lowerLimit.x;
		int y = lowerLimit.y;
		
		if(dir.contains("up")) {
			incrementY = -1;
		}
		else if(dir.contains("down")) {
			incrementY = 1;
		}
		
		if(dir.contains("left")) {
			incrementX = -1;
		}
		else if(dir.contains("right")) {
			incrementX = 1;
		}
		
		String tempWord = "";
		
		for(int i = 0; i < word.length(); i++) {
			tempWord += grid[y][x];
			x += incrementX;
			y += incrementY;
		}
		
		return tempWord.equals(word);
	}
	
	class Position{
		
		private final int x;
		private final int y;
		
		private Position(int y, int x){
			this.y = y;
			this.x = x;
		}
		
		public String toString() { return (y+1) + "," + (x+1); }
		
	}
}
