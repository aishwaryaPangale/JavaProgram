import java.util.*;
class InsertValueOnIndex
{
	int a[];
	int index;
	InsertValueOnIndex(int a[],int index)
	{
		this.a=a;
		this.index=index;
	}
	public void InsertValueOnIndex()
	{
		int i;
		for(i=a.length-1;i>index;i--)
		{
			a[i]=a[i-1];
		}
		a[index]=100;

	}
	public int[] getResultArray()
	{
          return a;
	}
}

public class Question12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array element ");
		int a[] = new int[7];
		int b[]=new int[7];
		int i,index,value;
		for(i=0;i<a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("Enter index and value ");
		index=sc.nextInt();

		InsertValueOnIndex ivi = new InsertValueOnIndex(a,index);
		ivi.InsertValueOnIndex();
		b=ivi.getResultArray();
		System.out.println("After insertion Array ");
		for( i=0;i<a.length;i++)
		{
		   System.out.print(a[i]+"\t");
		}

	}
}
