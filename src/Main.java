
public class Main {

	public static void main(String[] args) {
		WildAnimal a=new WildAnimal("Amfibio",4,2,"Europe");
		
		Pet b=new Pet("Ptino",4,"Tweety",1);
		Dog d =new Dog("Kynoeides",4,"Robby",7,1);
		Lion l=new Lion("Ailouroeides",4,70,"Africa",Lion.M);
		
		a.makeSound();
		b.makeSound();
		d.makeSound();
		l.makeSound();
		
		
		System.out.println(d.getName());
		
		l.eatACow(100);
		System.out.println(l.getVaros());

	}

}