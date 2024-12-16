import java.util.*;
class ArrayFeqCount
{
	int a[];
	void setArray(int arr[])
	{
		a=arr;
	}
	void showresult()
	{
		int count=1,i,j,temp;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for( i=0;i<a.length;i++)
		{
			//if(i==a.length-1)
			//{
			//	System.out.println(a[i]+"----------"+count+" time");
			//}
			if(i!=a.length-1&&a[i]==a[i+1])
			{
				count++;
				break;
			}
			else
			{
				System.out.println(a[i]+"----------"+count+" time");
				count=1;
			}
		}

	}
}
public class ArrayFeqCountApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int [10];

		System.out.println("Enter the element in array ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		ArrayFeqCount afc = new ArrayFeqCount();
		afc.setArray(a);
		afc.showresult();
	}
}