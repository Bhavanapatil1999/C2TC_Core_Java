import java.util.Scanner;
public class UserDefinedExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;
		System.out.println("Enter the age=");
		Scanner s=new Scanner(System.in);
		age=s.nextInt();
		
		if(age<18)
		{
			throw new CantVote("You cannot cast your vote....");
			
		}
		else
		{
			System.out.println("You can happily vote....");
			
		}
	}

}
class CantVote extends RuntimeException
    {
    	CantVote(String msg)
    	{
    		super(msg);
    	}
    }

