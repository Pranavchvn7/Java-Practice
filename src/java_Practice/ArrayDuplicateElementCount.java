package java_Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayDuplicateElementCount {

	public static void main(String[] args) {
		String names[] = {"Java", "JavaScript", "Ruby", "C", "Python", "Java"};
		
		//Using normal for loop----->Worst solution
		for(int i=0;i<names.length-1;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate element is: "+names[i]);
				}
			}
		}
		
		//Using HashSet----->it stores unique values only
		Set hs=new HashSet();
		//Normal for loop
//		for(int i=0;i<=names.length-1;i++) {
//			if(hs.add(names[i])==false) {
//				System.out.println("Duplicate element is: "+names[i]);
//			}
//		}
		//Advanced for loop, forEach
		for(String s:names) {
			if(hs.add(s)==false) {
				System.out.println("Duplicate element is: "+s);
			}
		}
		
		//Using HashMap to count array element occurence
		Map<String, Integer> hm=new HashMap<String, Integer>();
		for(String st:names) {
			Integer count=hm.get(st);
			if(count==null) {
				hm.put(st, 1);
			}
			else {
				count++;
				hm.put(st, count);
			}
		}
		
		//Print HasMap contents using Map.Entry
		System.out.println("HashMap contents: ");
		for(Map.Entry<String, Integer> e: hm.entrySet()) {
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
	}
}
