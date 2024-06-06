package java_Practice;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		String s="Java is Great";

		String revs="";
		String w[]=s.split(" ");
		
		for(int i=0;i<w.length;i++) {
			String revw="";
			String word=w[i];
			for(int j=word.length()-1;j>=0;j--) {
				revw=revw+word.charAt(j);
			}
			revs=revs+revw+" ";
		}
		
		System.out.println(revs);
	}

}
