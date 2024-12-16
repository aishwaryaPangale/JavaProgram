import java.util.*;
public class ArrayReverse
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int i,j,temp;

		System.out.println("\nEnter the five element in array ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("\nDisplay Array ");
		for(i=0;i<a.length;i++)
		{
			System.out.println("\t"+a[i]);
		}

		for(i=0,j=a.length-1;i<a.length/2;i++,j--)
		{
			 temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
		 }

		 System.out.println("\nReverse Array ");
		 for(i=0;i<a.length;i++)
		 {
			 System.out.println("\t"+a[i]);
		 }
	 }
 }
