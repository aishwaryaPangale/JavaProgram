import java.util.*;
class FindMax
{
	int a[];
	public void setArray(int a[])
	{
		this.a=a;
	}
	public 	int getmax()
	{
		int i;
		int max=a[0];
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
}
public class PracticeFindMax
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];

		System.out.println("Enter the Array element ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		FindMax f = new FindMax();
		f.setArray(a);
		int result = f.getmax();
		System.out.println("Maximum = "+result);
	}
}