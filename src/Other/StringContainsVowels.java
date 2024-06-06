package Other;

public class StringContainsVowels {

	public static void main(String[] args) {
		System.out.println(stringConatinsVowels("Hello"));
		System.out.println(stringConatinsVowels("TV"));
	}
	
	public static boolean stringConatinsVowels(String in) {
		return in.toLowerCase().matches(".*[aeiou].*");
	}

}
