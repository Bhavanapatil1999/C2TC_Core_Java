
public class Simplestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         char c[] = {'J','a','v','a'};
         
         String s1 = new String(c);
         String s2 = new String(s1);
         
         System.out.println(s1);
         System.out.println(s2);
         String longstr = "This could have been " +
                           "a very long line that would have " +         
	                       "wrapped around. But string concatenation " +
                           "prevents this.";
         System.out.println(longstr);
	}

}
