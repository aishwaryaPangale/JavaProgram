import java.util.*;
public class SubArraySum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[8];
		int i,j;
		System.out.println("Enter the element in array ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the sum ");
		int sum=sc.nextInt();

		int sum1=0;
		for(i=0;i<a.length;i++)
		{
			sum1=a[i];
			for(j=i+1;j<a.length;j++)
			{
				sum1=sum1+a[j];
				if(sum1==sum)
				{
					System.out.print("\n["+i+"-"+j+"]\t{");
					for(int k=i;k<=j;k++)
					{
						System.out.print(a[k]+",");
					}
					System.out.print("}");
				}
			}
		}
	}
}