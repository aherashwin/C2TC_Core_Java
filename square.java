import java.util.Scanner;
public  class square {

		public static void main(String[] args)
		{
		System.out.println("Enter side of square:");
		Scanner in=new Scanner(System.in);
		double side=in.nextDouble();
		


		double  area= side*side;
			
	         System.out.println("Area of square"+area);

		}
	}