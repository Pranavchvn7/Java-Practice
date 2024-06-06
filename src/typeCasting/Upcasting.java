package typeCasting;

public class Upcasting {

	public static void main(String[] args) {
		/*ChildClass c = new ChildClass();
		ParentClass p = (ChildClass)c;*/ //Explicit Upcasting
		ParentClass p = new ChildClass();//Implicit Upcasting
		p.methodP(); 
		p.a=20;
		System.out.println(p.a);
	}

}
//In Upcasting child class object is Typecasted to parent class object.
//We can do Upcasting implicitly(automatic) or Explicitly(Manual.)
//In child Class, we can access all methods of Parent class.
//We use Upcasting only when we want to develop a code who deals with Parent class only.
//Also known as Generalization or widening.