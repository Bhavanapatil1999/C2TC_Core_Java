
public class Abstract_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scooty Activa=new Scooty();
		Activa.NoOfWheels();
	}

}
abstract class Vehicle
{
	public abstract void NoOfWheels();
	
}

class Scooty extends Vehicle
{
	public void NoOfWheels()
	{
		System.out.println(2);
	}
}
