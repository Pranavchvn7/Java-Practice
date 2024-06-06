package abstractPractice;

public class ImplimentationClass implements InterfacePractice{

	@Override
	public void methodA() {
		System.out.println("This is Abstract method from Interface.");
		
	}//Its by default an abstract and public method in Interface.

	public static void main(String[] args) {
		//InterfacePractice.a=20;//Interface data members are final by default, so can't be changed.
		ImplimentationClass i = new ImplimentationClass();
		i.methodA();
		System.out.println(InterfacePractice.a);
		InterfacePractice.methodS();
		i.method();
		i.methodD();
	}
}
