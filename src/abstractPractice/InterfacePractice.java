package abstractPractice;

public interface InterfacePractice {
	
	/*InterfacePractice(){
		
	}*/ //Constructors not allowed in Interface.
	int a=10;
	public void methodA();
	
	public static void methodS() {
		
		System.out.println("This is Static method from Interface.");
	}
	
	 default void methodD() {
		System.out.println("This is default method from Interface.");
	}
	
	default void method() {
		methodP();
		methodPS();
		System.out.println("This is Non-static method from Interface.");
	}

	private void methodP() {
		System.out.println("This is Private method from Interface.");
	}
	
	private static void methodPS() {
		System.out.println("This is Private Static method from Interface.");
	}
}

//Rules For using Private Methods in Interfaces
//
//Private interface method cannot be abstract and no private and abstract modifiers together.
//Private non-static method inside interface can be used only under non-static interface methods.
//Private non-static methods cannot be used inside static methods.
//Private static method can be used under both static an non-static interface methods.
//We should use private modifier to define these methods and no lesser accessibility than private modifier.
// 
//So, from above it can be concluded that java 9 private interface methods can be static or instance. 
//In both cases, the private method is not inherited by sub-interfaces or implementations. 
//They are mainly there to improve code re-usability within interface only – thus improving encapsulation.

//public void method(){} is not allowed in interface as it will consider it as abstract method by default.

