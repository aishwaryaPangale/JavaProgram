import java.util.*;
public class DeleteElement
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[]=new int[5];
		int i,p,temp,j;

		System.out.println("\nEnter the element in array ");
		for(i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}

		System.out.println("\nDisplay Array ");
		for(i=0;i<a.length;i++)
		{
			System.out.println(i+"\t"+a[i]);
		}

		System.out.println("\nEnter the position for you delete the element ");
		p=xyz.nextInt();

		for(i=0;i<a.length;i++)
		{
			if(i==p)
			{
				for(j=i;j<a.length-1;j++)
				{
					a[j]=a[j+1];
				}
			}


		}
		System.out.println("\nDisplay record ");
		for(i=0;i<a.length-1;i++)
		{
			System.out.println(i+"\t"+a[i]);
		}
	}
}