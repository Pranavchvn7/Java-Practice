package Other;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		String str="Hello World";
		
		int length=str.length();
		int length_afteraremove=str.replace("o", "").length();
		
		int charaoccurence=length-length_afteraremove;
		System.out.println(charaoccurence);
	}

}
