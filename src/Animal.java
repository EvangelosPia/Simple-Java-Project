
public abstract class Animal {
	private String eidos;
	private int podia;
	protected int varos;

	public Animal(String eidos,int podia, int varos) {
		this.eidos=eidos;
		this.podia=podia;
		this.varos=varos;
	}
	public String getEidos() {return eidos;}
	public int getPodia() {return podia;}
	public int getVaros() {return varos;}
	
	public void setVaros(int varos) {this.varos=varos;}
	
	public void makeSound() {System.out.println("Animal Sound");}
}
