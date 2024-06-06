package java_Practice;

public class StringCharOccurence {

	public static void main(String[] args) {
		String s= "Java is java again java again";
		char c='a';
		
		int count=s.length()-s.replace("a", "").length();
		System.out.println("Number of occurence of character "+c+" in given String is: "+count);

	}

}
