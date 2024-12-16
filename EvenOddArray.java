import java.util.*;
public class EvenOddArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[10];
		int c[]=new int[10];
		int i,k=0;
		System.out.println("Enter the first Array element ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				c[k]=a[i];
				k++;
			}
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				c[k]=a[i];
				k++;
			}
		}
		System.out.println("Even Odd Array ");
		for(i=0;i<c.length;i++)
		{
			System.out.print(c[i]+"\t");
		}
	}
}
