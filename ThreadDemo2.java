class Hellorun implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hellorun Hr=new Hellorun();
		Thread t=new Thread(Hr);
		t.start();
		
		//m.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}

	}

}

