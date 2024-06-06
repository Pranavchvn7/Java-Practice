package multipleInheritance;

public interface InterfaceOne {
	default void method() {
		System.out.println("Method from Interface one.");
	}
}
