package encapsulation;

public class EncapsulationTest{

	public static void main(String[] args) {
		ReadOnlyClass rd = new ReadOnlyClass();
		System.out.println(rd.getName());
		
		WriteOnlyClass wr = new WriteOnlyClass();
		wr.setName("Santosh");
		System.out.println("Name set to Prashant.");
	}

}

//Encapsulation in Java is a process of wrapping code and data together into a single unit.
//We can create a fully encapsulated class in Java by making all the data members of the class private. 
//Now we can use setter and getter methods with public modifier to set and get the data in it.