import java.util.*;
class str_pallindrome
{
   public static void main(String args[])
   {
    int i;
	String s1;
	String s2="  ";
	System.out.println("enter a string");
	Scanner scan=new Scanner(System.in);
	s1=scan.next();
	System.out.println("\n string length is :"+s1.length());
	for(i=s1.length()-1;i>=0;i--)
	{
	   s2=s2+s1.charAt(i);
	 }
	 System.out.println("\n string reverce is :" +s2);
	 if(s1.equals(s2))
		{
	   System.out.println("\n string is pallindrome");
		}
	  else
		 {
	    System.out.println("\n string is not pallindrome");
		 }
	}
}	
