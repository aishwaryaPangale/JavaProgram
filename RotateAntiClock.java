import java.util.*;
public class RotateAntiClock
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[6];
		int i,j;

		System.out.println("Enter the array elements ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		for(j=0;j<a.length;j++)
		{
			int temp=a[0];
			for(i=0;i<a.length-1;i++)
			{
				a[i]=a[i+1];
			}
			a[a.length-1]=temp;

			System.out.println("\n\nRotate Array ");
			for(i=0;i<a.length;i++)
			{
				System.out.print(a[i]+"\t");
			}
		}
	}
}