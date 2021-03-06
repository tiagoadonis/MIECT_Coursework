package aula02Ex1;
import java.util.*;
import static java.lang.System.*;

@SuppressWarnings("all")
public class Video {
	private static int currentID = 0;
	private int ID;
	private String title;
	private String category;
	private String age;
	private static final String[] CATEGORY_VALUES = {"A��o", "Com�dia", "Infantil", "Drama"}; 
	private static final String[] AGE_VALUES = {"ALL", "M6", "M12", "M16", "M18"};
	private boolean disponibilidade;
	private List<Cliente> usersPerVideo; 
	private static int ratingTotal = 0;
	private double ratingMedio;
	
	public Video (String titulo, String categoria, String idade) {
		this.ID = this.currentID++;
		this.title = titulo;
		
		for (String str : CATEGORY_VALUES) {
			if (str.equals(categoria)) {
				this.category = categoria;
			}
			else{
				out.print("ERROR!! Invalid film category!!");
			}
		}
		
		for (String str : AGE_VALUES) {
			if (idade.equals(str)) {
				this.age = idade;
			}
			else {
				out.print("ERROR!! Invalid film age!!");
			}
		}
		this.disponibilidade = true;
		this.usersPerVideo = new ArrayList<>();
	}
	
	public boolean getDisponibilidade() {
		return this.disponibilidade;
	}
	
	public int getID() {
		return this.ID;
	}
	
	public String getAge() {
		return this.age;
	}
	
	public List<Cliente> getUsersPerVideo(){
		return this.usersPerVideo;
	}
	
	public void setDisponiblidade(boolean disp) {
		this.disponibilidade = disp;
	}
	
	public void setRatingTotal(int rate) {
		this.ratingTotal = this.ratingTotal + rate;
	}
	
	public double getRatingMedio() {
		this.ratingMedio = (double)(this.ratingTotal / this.usersPerVideo.size());
		return this.ratingMedio;
	}
	
	@Override
	public String toString() {
		return this.ID+") \""+this.title+"\" - "+this.category+" - "+this.age+
				" Rating Total: "+this.ratingTotal+" Rating Medio: "+this.ratingMedio;
	}
}
