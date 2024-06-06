package multipleInheritance;

public class Inherit implements InterfaceOne, InterfaceTwo{

	public void method() {
		InterfaceOne.super.method();
		InterfaceTwo.super.method();
	}//Here we have override the default 'method' from interface and specified parent interface  
	//using 'super' to fetch the inherited method and achieve multiple inheritance.
	public static void main(String[] args) {
		Inherit i = new Inherit();
		i.method();
	}
}
