import java.util.*;
public class ArrayEvenOdd
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int even[]=new int[5];
		int odd[]=new int[5];

		int i,k=0,c=0,count=0,count1=0;
		System.out.println("\nEnter the element in array ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("\nDisplay Array ");
		for(i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}

		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even[k]=a[i];
				k++;
				count++;
			}
			else
			{
				odd[c]=a[i];
				c++;
				count1++;
			}
		}
		System.out.println("\nEven number ");
		for(i=0;i<count;i++)
		{
			System.out.print("\t"+even[i]);
		}

		System.out.println("\nOdd number ");
		for(i=0;i<count1;i++)
		{
			System.out.print("\t"+odd[i]);
		}
		System.out.println("\n");
	}
}