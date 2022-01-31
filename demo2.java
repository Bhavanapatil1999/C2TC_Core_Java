
public class demo2 {

    int roll;
	String name;
	static String college="Mumbai University";
	
	demo2(int r,String n){
		roll = r;
		name = n;
	}
	static void change()
	{
		college="Allahabad University";
	}
	void display()
	{
		System.out.println(roll+" "+name+" "+college);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 demo2.change();
		
		demo2 s1=new demo2(1,"Alisha");
		demo2 s2=new demo2(2,"Anusha");
		s1.display();
		s2.display();
	}

}


