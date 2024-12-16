import java.util.*;
public class ArrayAscending
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		int i,j,temp;

		System.out.println("\nEnter the five element in array ");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("\nDisplay array ");
		for(i=0;i<5;i++)
		{
			System.out.println("\t"+a[i]);
	    }

	    for(i=0;i<5;i++)
	    {
			for(j=i+1;j<5;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nArray in ascending order ");
		for(i=0;i<5;i++)
		{
			System.out.println("\t"+a[i]);
		}
	}
}
