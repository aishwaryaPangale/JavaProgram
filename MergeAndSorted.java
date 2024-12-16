import java.util.*;
public class MergeAndSorted
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[10];

		int i,k=0,j,temp;

		System.out.println("Enter the element in first array ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("Enter the element in second array ");
		for(i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}

		//Merge Array logic

		for(i=0;i<a.length;i++)
		{
			c[k]=a[i];
			k++;
		}
		for(i=0;i<b.length;i++)
		{
			c[k]=b[i];
			k++;
		}

		System.out.println("\nMerge array ");
		for(i=0;i<c.length;i++)
		{
			System.out.print("\t"+c[i]);
		}

		//Desending order logic
		for(i=0;i<c.length;i++)
		{
			for(j=i+1;j<c.length;j++)
			{
				if(c[i]<c[j])
				{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		System.out.println("\nSorted array ");
		for(i=0;i<c.length;i++)
		{
			System.out.print("\t"+c[i]);
		}
		System.out.print("\n");
	}

 }

