package Other;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		String str="Hello   World ";
		
		str=str.replaceAll("\\s", "");
		
		System.out.println("After removing white Spaces: "+str);

	}

}
