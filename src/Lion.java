
public class Lion extends WildAnimal {
	private int fylo;
	public static final int M=0; 
	public static final int F=1; 

	
	public Lion(String eidos, int podia, int varos, String location, int fylo) {
		super(eidos,podia,varos,location);
		this.fylo=fylo;
	}
	public int getFylo() {return fylo;}
	public void makeSound() {System.out.println("Roar");}
	public void eatACow(int cowWeight) {varos+=cowWeight/10;}
}
