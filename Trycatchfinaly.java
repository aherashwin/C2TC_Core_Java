public class Trycatchfinaly {

	public static void main(String[] args) {

		int[] arr= new int[4];
		try 
		{
			System.out.println(arr[5]);
		}
		
catch (ArrayIndexOutOfBoundsException e)	
		{
	System.out.println("Ex catch in catch block");	
		}
finally
	{ 
	System.out.println("finally block exicuted");
	}
	
	}

}