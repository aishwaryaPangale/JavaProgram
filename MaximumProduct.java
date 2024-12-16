import java.util.*;
public class MaximumProduct
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		int a[] = new int[8];
		int i,mul=0,j,max=0,prod=0;

		System.out.println("Enter the Array element ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}


         int p=0;
         int q=0;
		for(i=0;i<a.length-1;i++)
		{
			for(j=i+1;j<a.length-1;j++)
			{
				prod=a[j]*a[i];

				if(prod>max)
				{
					max=prod;
					p=a[i];
					q=a[j];
				}
			}

		}
		System.out.print("{"+p+","+q+"}   Maximum product  "+max);
		System.out.println();

	}
}
