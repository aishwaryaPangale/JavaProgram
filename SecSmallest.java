import java.util.*;
public class SecSmallest
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		int i,min,sec;
		System.out.println("Enter the Array element ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		min=a[0];
		sec=a[0];
		for(i=0;i<a.length;i++)   //1  4  2  3   5
		{
			if(min>a[i])
			{
				min=a[i];
			}
			else if(a[i]>min && (min==sec||a[i]<sec))
			{
				sec=a[i];
			}
		}
		System.out.println("Smallest number : "+min);
		System.out.println("Second Smallest number :"+sec);
	}
}