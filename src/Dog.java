
public class Dog extends Pet{
	
	private int tailSize;
	
	public Dog(String eidos, int varos, String name, int podia,int tailSize) {
		super(eidos,podia,name,varos);
		this.tailSize=tailSize;

	}
	
	public int getTailSize() {return tailSize;}
	public void makeSound() {System.out.println("Bark, Bark");}


}
