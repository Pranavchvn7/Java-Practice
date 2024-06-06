package abstractPractice;

public abstract class AbstractClass{
	
	AbstractClass(){
		System.out.println("This is Abrstract class constructor.");
	}
	
	public abstract void methodA();
	
	public void method(){
		System.out.println("This is non static method from Abrstract class.");
	}
	
	public static void methodS() {
		System.out.println("This is Static method from Abrstract class.");
	}
	
	final void methodF() {
		System.out.println("This is Final method from Abrstract class.");
	}
}