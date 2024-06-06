package encapsulation;

public class ReadOnlyClass {
	private String name="Pranav";
	//private data member can't be accessible directly.
	
	public String getName() {
		return name;
	}
	//public member function/method so that it can accessed to read the data through method only.
}
