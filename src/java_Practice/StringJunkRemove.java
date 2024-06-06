package java_Practice;

public class StringJunkRemove {

	public static void main(String[] args) {
		String s="*&($^()(@&(^)$*&)(*_Pranav007*&(*$_(+#(_)*)($&)(%&_%)";

		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
	}

}
