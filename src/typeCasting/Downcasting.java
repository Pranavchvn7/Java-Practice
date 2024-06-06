package typeCasting;

public class Downcasting {

	public static void main(String[] args) {
		ParentClass p = new ChildClass();//needs Upcasting first
		ChildClass c = (ChildClass)p;//explicit downcasting=assigning Parent class object reference to child class
		
		//ChildClass c = new ParentClass(); compile time error, implicit casting not possible
		
		c.method();
		c.methodP();
		c.a=30;
		System.out.println(c.a);

	}

}
//We use Downcasting when we want to develop a code that deals with accesses behaviours of child class. 
//Implicit(automatic) downcasting is not possible.
//Methods and veriables of child and parent class can be accessed. 
//Downcasting means assigning Parent class object reference to child class, before this upcasting is needed. 
