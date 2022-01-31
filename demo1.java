
public class demo1 {
	
	int roll;
	String name;
	static String college="Mumbai University";
	
	demo1(int r,String n){
		roll = r;
		name = n;
	}
	static void change()
	{
		college="Mumbai University";
	}
	void display()
	{
		System.out.println(roll+" "+name+" "+college);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 demo1.change();
		
		demo1 s1=new demo1(1,"Alisha");
		demo1 s2=new demo1(2,"Anusha");
		s1.display();
		s2.display();
	}

}
