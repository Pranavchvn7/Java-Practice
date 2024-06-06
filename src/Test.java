public class Test {
	
	public void m1(String s)
	{
		System.out.println("String specific method");
	}
	

	public void m1(StringBuffer s)
	{
		System.out.println("StringBuffer specific method");
	}
	
	public static void main(String[] hjhjhdsjd) {
		Test t = new Test();
		t.m1("abc");
		//t.m1(null);--> Error because null value is applicable for both String and StringBuffer specific method.
		
		
	}

}
