package collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableEx {

	public static void main(String[] args) {
		//Hashtable t=new Hashtable(); 
		//nulls not allowed
		//all methods are synchronized, only one thread can access them at a time
		//performance is low

		Hashtable<Integer, String> t=new Hashtable<Integer, String>();
		
		t.put(101, "pranav");
		t.put(102, "pranav");
		t.put(103, "kiran");
		t.put(104, "vasim");
		
		System.out.println(t);
		
		System.out.println(t.get(102));
		
		t.remove(104);
		System.out.println(t);
		
		System.out.println(t.containsKey(101));
		System.out.println(t.containsValue("pranav"));
		
		System.out.println(t.isEmpty());
		
		System.out.println(t.size());
		
		System.out.println(t.keySet());
		for(int i:t.keySet()) {
			System.out.println(i);
		}
		for(int i:t.keySet()) {
			System.out.println(i+"		"+t.get(i));
		}
		System.out.println(t.values());
		for(String s:t.values()) {
			System.out.println(s);
		}
		
		System.out.println(t.entrySet());
		for(Map.Entry entry:t.entrySet()) {
			System.out.println(entry.getKey()+"		"+entry.getValue());
		}
		
		Set s=t.entrySet();
		Iterator ir=s.iterator();
		while(ir.hasNext()) {
			Map.Entry entry=(Entry) ir.next();
			System.out.println(entry.getKey()+"		"+entry.getValue());
		}
	}

}
