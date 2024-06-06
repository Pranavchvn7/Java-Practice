package abstractPractice;

public class ConcreteClass extends AbstractClass{

	@Override
	public void methodA() {
		System.out.println("This implimetation of abstract method in concrete class.");
		
	}
	public static void main(String[] args) {
		ConcreteClass c = new ConcreteClass();
		c.methodA();
		c.method();
		methodS();
		c.methodF();
	}

}
