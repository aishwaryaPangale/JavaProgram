import java.util.*;
class SortArr
{
	int a[];
	public void setArr(int a[])
	{
		this.a=a;
	}
	public int[] getSortedArr()
	{
		int i,j,temp;
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
		return a;
	}

}

public class PracticeSortArr
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];

		int i;
		System.out.println("Enter the Array element ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		SortArr s = new SortArr();
		s.setArr(a);

		a=s.getSortedArr();
		System.out.println("Display Sorted Array ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}
}