import java.util.*;
class task_transpose
{
   public static void main(String args[])
   {
     int a[][]=new int[3][3];
	 int i,j;
	 System.out.println("Enter Array Elements");
	 Scanner scan=new Scanner(System.in);
	 for(i=0;i<3;i++)
	 {
	   for(j=0;j<3;j++)
	   {
	     a[i][j]=scan.nextInt();
		}
	  }
	  System.out.println("Given Matrix is:");
	  for(i=0;i<3;i++)
	 {
	   for(j=0;j<3;j++)
	   {
	     System.out.print("   "+a[i][j]);
		}
		System.out.println(" ");
	  }
	  System.out.println("Transpose is :");
	   for(i=0;i<3;i++)
	 {
	   for(j=0;j<3;j++)
	   {
	     System.out.print("   "+a[j][i]);
		}
		System.out.println(" ");
	  }
	}
}