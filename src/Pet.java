
public class Pet extends Animal {
	
	private String name;
	
	public Pet(String eidos, int varos, String name,int podia) {
		super(eidos,podia,varos);
		this.name=name;
	}
	
	public String getName() {return name;}

}
