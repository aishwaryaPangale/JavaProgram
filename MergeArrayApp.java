import java.util.*;
class mergeArray
{
	int arr1[],arr2[],arr3[];
	int i,j=0;
	void setArray(int a[],int b[],int c[])
	{
		arr1=a;
		arr2=b;
		arr3=c;
	}
	void showArray()
	{
		for(i=0;i<5;i++)
		{
			arr3[j]=arr1[i];
			j++;
		}
		for(i=0;i<5;i++)
		{
			arr3[j]=arr2[i];
			j++;
		}
		System.out.println("Merge Array ");
		for(i=0;i<j;i++)
		{
			System.out.print("\t"+arr3[i]);
		}
	}
}
public class MergeArrayApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[10];
		int i;

		System.out.println("Enter the first array element ");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("Enter the second array element ");
		for(i=0;i<5;i++)
		{
			b[i]=sc.nextInt();
		}

		mergeArray m = new mergeArray();
		m.setArray(a,b,c);
		m.showArray();
	}
}