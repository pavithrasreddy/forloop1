package forexample;

public class switchcase 
{
  public static void main(String[] args)
  {
	  //default and wrong program
	  String str="$";
	  switch(str)
	  {
	   case "1":
	   {
		  System.out.println("the given is character");
		  break;
	   }
	   case "2":
	   {
		  System.out.println("the given is special character");
		  break;
	   }
	   case "3":
	   {
		  System.out.println("the given is a number");
		  break;
	   }
	   default:
	   {
		 System.out.println("no match");
	   }
	  } 
   }
}
