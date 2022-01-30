

import java.util.Scanner;
class Assignment1{
    public static void main(String[] args)
    { boolean exit=false;
            
                 Scanner sc= new Scanner(System.in);
                    
                     System.out.println("Enter 2 no for Operation");
                    double num1=sc.nextDouble();
                    double num2=sc.nextDouble();   
            while(!exit)
            {   
                System.out.println("\nEnter Your choice \n 1. Add 2.sub");
                    int choice = sc.nextInt();
                              
                switch(choice)
                {   
                    case 1:System.out.printf("Sum is"+(num1+num2));
                            break;
                    case 2:System.out.printf("Sub is"+(num1-num2));
                            break;
                    case 3: exit=true;
				    default: System.out.print("Invalid choice");
                }
            }        
        sc.close();
    }
}