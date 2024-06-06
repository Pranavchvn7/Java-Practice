package polymorphism;

public class OverLoading {
	public void method() {
		System.out.println("Method without parameters.");
	}
	
	public void method(int a) {
		System.out.println("Method with one int parameter.");
	}
	
	public void method(String s) {
		System.out.println("Method with one string parameter.");
	}
	
	public void method(int a, int b) {
		System.out.println("Method with two int parameters.");
	}
	public static void main(String[] args) {
		OverLoading ol = new OverLoading();
		ol.method();
		ol.method(1);
		ol.method("Pranav");
		ol.method(1, 2);
	}

}
