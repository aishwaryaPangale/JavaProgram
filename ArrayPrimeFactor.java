import java.util.*;
class PrimeFactor
{
	int a[],i,j,m=0,temp=0;
	void setArray(int arr[])
	{
		a=arr;
	}
	void AllPrimeFactors()
	{
		for(i=0;i<a.length;i++)
		{
			m=a[i];
			System.out.print("Prime Factor of "+a[i]+"----- [" );
			for(j=2;j<=m;j++)
			{
				while(m%j==0)
				{
					System.out.print(j+",");
					m=m/j;
				}

			}
			System.out.print("]");

			System.out.println();
		}
	}

}
public class ArrayPrimeFactor
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];

		int i;
		System.out.println("Enter the Array element ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		PrimeFactor pf = new PrimeFactor();
		pf.setArray(a);
		pf.AllPrimeFactors();
	}
}
