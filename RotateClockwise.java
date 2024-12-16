import java.util.*;
public class RotateClockwise
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[6];
		int i;

		System.out.println("Enter the array element ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}


         for(int j=0;j<a.length;j++)
         {
			int temp=a[a.length-1];
			for(i=a.length-1;i>0;i--)
			{

				a[i]=a[i-1];
			}
			a[0]=temp;

			System.out.println("Rotate array");
			for(i=0;i<a.length;i++)
			{
				System.out.print(a[i]+"\t");
			}
			System.out.println();
		}

	}
}
