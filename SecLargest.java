import java.util.*;
public class SecLargest
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int i,j,temp,sec,max,k=0;

		System.out.println("\nEnter the element in array ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("\nDispaly Array ");
		for(i=0;i<a.length;i++)
		{
			System.out.println("\t"+a[i]);
		}

		//Sorting logic

		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nSorted Array ");
		for(i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
		  System.out.println();
		max=0;
		sec=0;
		for(i=0;i<a.length;i++)  // 1 2 3 4 5   5 4 3 2 1
		{

	     	if(max<a[i]) // 1<2
			{
				max=a[i]; // 1 2 3

			}
			  else  if(a[i]>sec)  //
			{
						//System.out.println("******");

				sec=a[i]; //4;
				//k=a[i];

			}
		}
		System.out.println("\nLargest number"+max);
		System.out.println("\nSecond Largest = "+sec);
				//System.out.println("\nSecond Largest = "+k);

	}
}