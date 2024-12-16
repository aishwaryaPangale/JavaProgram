import java.util.*;
class POJOSum
{
	int s=0;
	int a[];
	void setData(int ...x)
	{
		a=x;
	}
	void calSum()
	{
		for(int i=0;i<a.length;i++)
		{
		    s=s+a[i];
		}
		System.out.println("Sum :"+s);
	}
}
public class POJOApp
{
	public static void main(String x[])
	{
		POJOSum p = new POJOSum();
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the element in array ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		p.setData(a);
		p.calSum();
	}
}
