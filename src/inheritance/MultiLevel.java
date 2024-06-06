package inheritance;

public class MultiLevel extends InheritA {

	public static void main(String[] args) {
		MultiLevel ml = new MultiLevel();
		ml.methodA();
		ml.methodB();
	}
}

//		B
//		|
//		A
//		|
// MultiLevel
