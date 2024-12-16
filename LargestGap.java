import java.util.*;
public class LargestGap
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[7];
		int i,j,sub=0,gap=1,temp;

		System.out.println("Enter the element ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

         for(i=0;i<a.length;i++)
         {
			 for(j=i+1;j<a.length;j++)
			 {
				 if(a[i]<a[j])
				 {
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
		 }
		for(i=0;i<a.length-1;i++)
		{
				sub=a[i]-a[i+1];
				if(sub>gap)
				{
					gap=sub;
				}

		}
		System.out.println("Largest Gap "+gap);
	}
}