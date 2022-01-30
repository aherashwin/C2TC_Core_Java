
public class Gcd              //class GCD
{
public static void main(String[] args)    //main method
{
	 //find GCD between  n1 and n2
	
	int n1=81,n2=153;        //initially set two GCD
	int gcd=1;               
	for (int i=1;i<=n1&&i<=n2;++i)
	{
		if(n1%i==0 && n2%i==0)  //if i perfectly divides both n1 and n2
		gcd=i;
		
	}
	System.out.println("GCD of "  +n1+  " and " +n2+  " is "  +gcd);
	
}
}
