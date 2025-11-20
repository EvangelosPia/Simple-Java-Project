
public class WildAnimal extends Animal {
	private String location;
	
	public WildAnimal(String eidos, int podia, int varos, String location) {
		super(eidos,podia,varos);
		this.location=location;
	}
	public String getLocation() {return location;}
}