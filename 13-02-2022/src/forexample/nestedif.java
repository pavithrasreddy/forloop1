package forexample;
import java.util.Scanner;

public class nestedif 
{
  public static void main(String[] args )
	 { 
	    //default and wrong program
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		if(num<100)
		{
		  System.out.println("the entered number is negative");
		}
		if(num>100)
		{
			System.out.println("the entered number is positive");
		}
	    else
	    {
		  System.out.println("the number is even or odd");
        }
	 }
}
