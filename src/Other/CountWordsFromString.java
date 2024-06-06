package Other;

public class CountWordsFromString {

	public static void main(String[] args) {
		String str="Hello world I am Pranav";
		
//		String[] words=str.split(" ");
//		int count=0;
//		for(String w:words) {
//			count++;
//		}
//		System.out.println("Number of words in String are: "+count);
		
		
		//Approach 2
		int count=1;
		for(int i=0;i<str.length()-1;i++) {
			if( (str.charAt(i)==' ') && (str.charAt(i+1)!=' ') ) {
				count++;
			}
		}
		System.out.println("Number of words in String are: "+count);
	}

}
