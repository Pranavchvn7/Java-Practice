package Other;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str="Hello World";
		
		//Approach 1
		//Split string into words array
//		String[] words=str.split("\\s"); 
//		String rev_word="";
//		//iterate through words array to reverse each word 
//		for(String w:words) {
//			StringBuilder sb=new StringBuilder(w);
//			sb.reverse();
//			rev_word=rev_word+sb.toString()+" ";
//		}
//		System.out.println(rev_word);
		
		//Approach 2
		//Split the string into words based on spaces between them
		String[] words=str.split(" ");
		String rev_word= " ";
		
		//Iterate through array to reverse each word 
		for(String w:words) {
			String rev= "";
			for(int i=w.length()-1;i>=0;i--) {
				rev=rev+w.charAt(i);
			}
			rev_word=rev_word+rev+" ";
		}
		System.out.println(rev_word);
	}

}
