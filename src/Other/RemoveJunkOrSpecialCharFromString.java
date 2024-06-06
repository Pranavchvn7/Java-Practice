package Other;

public class RemoveJunkOrSpecialCharFromString {

	public static void main(String[] args) {
		String str=" $%&#*#&^&^&@&^% Hello World &*(^ 12315";
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("String after removing Junk/Special characters: "+str);
	}

}
