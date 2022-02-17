import java.util.*;
class yp_fiboseries
{
  public static void main(String arg[])
  {
    int f=1,s=1,t,i,range;

	  System.out.println("\n Enter a range");
	  Scanner scan=new Scanner(System.in);
	  range=scan.nextInt();
	  Sys
	  System.out.println("\n"  +f );
	  System.out.println("\n" +s);
	  for(i=1;i<=range;i++)
	  {
	    t=f+s;
		System.out.println("\n"  +t);
		f=s;
		s=t;
	   }
	}
}	
		