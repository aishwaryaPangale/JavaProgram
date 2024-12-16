import java.util.*;
public class IntergerNums
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		int i,j;
		System.out.println("Enter the element in array ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the sum ");
		int sum = sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				int sum1=a[i]+a[j];
				if(sum==sum1)
				{
					System.out.println("["+i+","+j+"]");
				}
			}
		}
	}
}