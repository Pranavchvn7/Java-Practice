package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		//key is integer, value is String type

		//HashMap hm=new HashMap();
		
		hm.put(101, "pranav");
		hm.put(102, "sagar");
		hm.put(103, "nitin");
		hm.put(104, "vaibhav");
		
		System.out.println(hm);
		
		System.out.println(hm.get(102));
		
		hm.remove(104);
		System.out.println(hm);
		
		System.out.println(hm.containsKey(102));
		
		System.out.println(hm.containsValue("pranav"));
		
		System.out.println(hm.isEmpty());
		
		System.out.println(hm.size());
		
		
		System.out.println(hm.keySet());	
		
		for(Object o:hm.keySet()) {
			System.out.println(o);
		}
		
		System.out.println(hm.values());
		for(Object o:hm.values()) {
			System.out.println(o);
		}
		
		//Entry operations
//		System.out.println(hm.entrySet());
//		for(Map.Entry entry:hm.entrySet()) {
//			System.out.println(entry.getKey()+"		"+entry.getValue());
//		}
		
		//Iterator
		
		Set s=hm.entrySet();
		Iterator ir=s.iterator();
		while(ir.hasNext()) {
			Map.Entry entry=(Entry) ir.next();
			System.out.println(entry.getKey()+"		"+entry.getValue());
		}
		
	}

}
