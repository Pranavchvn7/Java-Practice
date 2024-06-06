package polymorphism;

public class OverRiding extends InheritToOverRide{
	
	public void method() {
		System.out.println("This is method from Child Class after Overriding.");
	}
	
	public static void main(String[] args) {
		InheritToOverRide or = new OverRiding();
		or.method();
		InheritToOverRide ior = new InheritToOverRide();
		ior.method();
	}
}
