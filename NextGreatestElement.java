
import java.util.*;
public class NextGretestElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[7];

		int i,k=0,j;
		System.out.println("Enter the Array Element ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("-------------------------------");

		for(i=0;i<a.length;i++)
		{
			int max=a[i];
			if(i==a.length-1)
			{
				System.out.println(-1);
			}
			for(j=i+1;j<a.length;j++)
			{
			   if(max<a[j])
			   {
				   System.out.println(a[j]+"\t");
					break;
			   }

		   }
	   }

   }
}