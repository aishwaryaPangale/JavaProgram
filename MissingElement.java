import java.util.*;
public class MissingElement
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[]=new int[5];
		int i,j;

		System.out.println("\nEnter the five element in array ");
		for(i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}

		System.out.println("\nDisplay array ");
		for(i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
		System.out.println("\nMissing Element ");

		for(i=0;i<a.length-1;i++)
		{

				for(j=a[i];j<a[i+1]-1;)
				{
					System.out.print("\t"+(++j));
				}

		}
		System.out.println("\n");
	}
}
