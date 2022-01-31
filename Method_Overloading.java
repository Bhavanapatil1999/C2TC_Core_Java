
public class Method_Overloading {

	public void m(Object o)
	{
		System.out.println("Object Class");
		
	}
	public void m(String s)
	{
		System.out.println("String Class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Method_Overloading obj=new Method_Overloading();
		
        obj.m(new Object());
		
		obj.m("Avantika");
		
		
		obj.m(null);
	}

}
