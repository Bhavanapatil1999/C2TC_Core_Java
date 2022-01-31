
public class Static_Block2 {
	static int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Executing the main block");
        System.out.println(a);
        
	}
	static void m()
	{
		System.out.println("I am static block()");
		
	}
  static
  {
		System.out.println("India is best");
		Static_Block2.m();
  }
  
  static
  {
		System.out.println("Vande Mataram");
  }
  static
  {
		System.out.println("Jay Hind");
     }

}
