import java.util.*;
public class NthPositionRotateArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[10];

		int i,n,k,temp;
		System.out.println("\nEnter the element in array ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("\nDisplay Array ");
		for(i=0;i<a.length;i++)
		{
			System.out.println("\t"+a[i]);
		}

		System.out.println("\nEnter the nth value ");
		n=sc.nextInt();

		for(k=1;k<=n;k++)
		{
			temp=a[0];
			for(i=0;i<a.length-1;i++)
			{
				a[i]=a[i+1];
			}
			a[9]=temp;
		}
		System.out.println("\nRotate Array ");
		for(i=0;i<a.length;i++)
		{
			System.out.println("\t"+a[i]);
		}

	}
}