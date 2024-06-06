package multipleInheritance;

public interface InterfaceTwo {
	default void method() {
		System.out.println("Method from Interface two.");
	}
}
