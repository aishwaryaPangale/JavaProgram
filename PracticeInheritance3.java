import java.util.*;
class ArrSum
{
	int a[];
	void setValue(int a[])
	{
		this.a=a;
	}
}
class GetSum extends ArrSum
{
	int getArrSum()
	{
		int i,sum=0;
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}
}
public class PracticeInheritance3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int i,result;
		System.out.println("Enter the element ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

         //ArrSum as = new ArrSum();
		GetSum gs = new GetSum();
		gs.setValue(a);
		result=gs.getArrSum();
		System.out.println("Sum of Array : "+result);
	}

}