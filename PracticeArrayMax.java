import java.util.*;
public class PracticeArrayMax
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int i;
		System.out.println("Enter the Array element ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("Display Array ");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"\t");
		}

		int max=a[0];
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("\nMaximum number is "+max);

		int temp,j;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\n\nDisplay Ascending Order Array ");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"\t");
		}
	}
}

