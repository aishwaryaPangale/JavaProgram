import java.util.*;

public class TestIsogramArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		 int i,j;
		 System.out.println("Enter the Array elements ");
		 for(i=0;i<a.length;i++)
		 {
			 a[i]=sc.nextInt();
		 }

		 boolean f = false;
		 for(i=0;i<a.length;i++)
		 {
			 for(j=i+1;j<a.length;j++)
			 {
				 if(a[i]==a[j])
				 {
					 f=true;
				 }
			 }
		 }
		 if(f==false)
		 {
			 System.out.println("Array is Isogram Array ");
		 }
		 else
		 {
			 System.out.println("Array is not Isogram Array ");
		 }


	}
}