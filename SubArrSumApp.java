import java.util.*;
class SubArrSum
{
	int a[],sum1=0,i,j,sum,k;
	SubArrSum(int arr[] , int sum)
	{
		a=arr;
		this.sum=sum;
	}
	void findsubArray()
	{
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				sum1=a[i]+a[j];
				if(sum==sum1)
				{
					System.out.print("Index of sum is "+i+"  "+j+"\tSub Array is : {");
					for(k=i;k<=j;k++)
					{
						System.out.print(a[k]+"  ");
					}
					System.out.println("}");
				}
			}
		}
	}
}
public class SubArrSumApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[7];
		System.out.println("Enter the element in array ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the sum ");
		int sum = sc.nextInt();
		SubArrSum s = new SubArrSum(a,sum);
		s.findsubArray();
    }
}