public class Poly_demo2 {

	   void m()
	{
		System.out.println("No Parameters");
	}
	
	void m(int i)
	{
		System.out.println("Integer Parameters");
	}
	void m(double d)
	{
		System.out.println("Double Parameters");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Poly_Demo p=new Poly_Demo();
		p.m(5);
		p.m(5.6);
		
		
		p.m('a');
		p.m(10L);
		p.m(5.8f);
		p.m(2);
	
	}

}




