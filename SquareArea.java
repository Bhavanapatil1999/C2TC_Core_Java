import java.util.Scanner;
public class SquareArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the side of the squre =");
		 double side = scanner.nextDouble();
		 
		 double area = side*side;
		 System.out.println("Area of square ="+area);

	}

}
