import java.util.*;
public class ArraySum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System .in);
		int a[]= new int[5];
		int i,sum=0;
		System.out.println("\nEnter the five element in array ");
		for(i=0;i<5;i++)
		{
			a[i]= xyz.nextInt();
	    }

	    System.out.println("\nDisplay array ");
	    for(i=0;i<5;i++)
	    {
			System.out.println("\t"+a[i]);
	    }

	    for(i=0;i<5;i++)
	    {
			sum=sum+a[i];
		}
		System.out.println("\nSum of array is : "+sum);
	}
}