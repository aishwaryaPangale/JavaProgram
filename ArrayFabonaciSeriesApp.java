import java.util.*;
public class ArrayFabonaciSeriesApp
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i;

		a[0]=0;
		a[1]=1;

		for(i=2;i<a.length;i++)
		{
			a[i]=a[i-1]+a[i-2];
		}
		System.out.println("\nFibonacii Series ");
		for(i=0;i<a.length;i++)
		{
			System.out.println("\t"+a[i]);
		}
	}
}
