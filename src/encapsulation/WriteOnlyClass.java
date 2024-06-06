package encapsulation;

public class WriteOnlyClass {

	private String name;
	//private data member can't be accessible directly.

	public void setName(String nm) {
		name=nm;
	}
	//public member function/method so that it can accessed to write the data through method only.
}
