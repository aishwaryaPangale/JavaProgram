import java.util.*;
public class SumofPair
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];

		int i,j,sum,usum;
		System.out.println("\nEntre the elment in array ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("\nDisplay Array ");
		for(i=0;i<a.length;i++)
		{
			System.out.println("\t"+a[i]);
		}

		System.out.println("\nEnter the sum ");
		usum=sc.nextInt();

		for(i=0;i<a.length;i++)
		{
			sum=0;
			for(j=i+1;j<a.length;j++)
			{
				sum=a[i]+a[j];
				if(sum==usum)
				{
					//x=a[i];
					//y=a[j];
					System.out.println("Sum of pair is "+i+"  "+j);
				}
			}

		}
	}
}