import java.io.*;
import java.lang.Math;
import java.util.Scanner;
public class task_boperation
{
   public static void main(String args[])
   {
      int n1,n2;
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter two numbers: ");
	  n1=scan.nextInt();
	  n2=scan.nextInt();
	  System.out.println("Enter the operation (+,-,*,/,%)");
	  char op=scan.next().charAt(0);
	  double  a=0;
	  switch(op)
	  {
	     case '+': a=n1+n2;
		            break;
		 case '-':a=n1-n2;
		            break;
		 case '*':a=n1*n2;
		            break;
		 case '/':a=n1/n2;
		            break;
		 case '%': a=n1%n2;
		           break;
		default :
					System.out.println("SORRY! You enter wrong input");
					break;
	}
	System.out.println("Then Final Result is: ");
	System.out.println();
	System.out.println(n1+" "+op+ " "+n2+ " = "+a);
	}
}
		  
	