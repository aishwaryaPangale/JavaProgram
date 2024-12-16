import java.util.*;
public class InserteApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		int i,index,value;

		System.out.println("\nEnter the five value in array ");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("\nDisplay Array ");
		for(i=0;i<5;i++)
		{
			System.out.println("\t"+a[i]);
		}

		System.out.println("\nEnter the index and value ");
		index=sc.nextInt();
		value=sc.nextInt();

		for(i=5;i>index;i--)
		{
			a[i]=a[i-1];
		}
		a[index] = value;
		System.out.println("\nDisplay Insert value in array ");
		for(i=0;i<6;i++)
		{
			System.out.println("\t"+a[i]);
		}
	}
}

