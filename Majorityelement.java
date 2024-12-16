import java.util.*;
public class Majorityelement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[10];
		int i,j,temp,count,flag;

		System.out.println("\nEnter the element in array ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("\nDisplay Record ");
		for(i=0;i<a.length;i++)
		{
			System.out.println("\t"+a[i]);
		}

		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nSorted array ");
		for(i=0;i<a.length;i++)
		{
			System.out.println("\t"+a[i]);
		}

		flag=0;
		count=1;

		for(i=0;i<a.length;i++)
		{
			if(i!=9&&a[i]==a[i+1])
			{
				count++;
			}
			else
			{
				if(count>5)
				{
					flag=1;
					System.out.println(a[i]+" is majority element ");
					break;
				}
				count=1;
			}
		}
		if(flag==0)
		{
			System.out.println("not majority element ");
		}
	}
}