import java.util.*;
class PrimeFactor
{
	int a[],b[];
	void setArray(int arr[])
	{
		a=arr;
	}
	void AllPrimeFactors();
	{
		for(int i=0;i<a.length;i++)
		{
			temp=a[i];

			for(int j=2;j<=temp;j++)
			{
				while(temp%j==0)
				{
					System.out.println(j);
					b[j]=j;
					temp=temp/10;
				}
			}
			for(int k=0;k<b.length;k++)
			{
				System.out.println(a[i]+"------"+b[k]);
			}
	}
}

public class Tprimeno
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int [5];
		int i,temp,j;

		System.out.println("Enter the Element ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

       PrimeFactor p = new PrimeFactor();
       p.setArray(a);
       p.AllPrimeFactors();

	}

}

