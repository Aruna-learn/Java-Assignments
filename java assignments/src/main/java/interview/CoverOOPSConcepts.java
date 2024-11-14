package interview;

//interfcae
interface car{
	void printName();
}


//inheritance
class Vehicle{
	private String Name;//encapsulation
	protected String getName() {
	return Name;
	
}
	public void setName(String newName) {

        Name = newName;

  }

}
//method overriding
class Bike extends Vehicle implements car{

	@Override
	public void printName() {
		System.out.println("method overriding"+super.getName());
		
	}
	

    public void printName(String string) {

          System.out.println("Overloaded Method Print " + string);

    }

}
	











public class CoverOOPSConcepts {

	public static void main(String[] args) {
		
		Bike b=new Bike();
		
		b.setName("SplendorPlus");
		b.printName();
		b.printName("Aruna ");
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
