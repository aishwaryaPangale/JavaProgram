import java.util.*;
class Inserte
{
	int a[];
	int index,value;
	void setArray(int arr[],int index,int value)
	{
		a=arr;
		this.index=index;
		this.value=value;
	}
	void insertValueOnIndex()
	{
		for(int i=a.length-1;i>index;i--)
		{
			a[i]=a[i-1];
		}
		a[index]=value;
		System.out.println("Inserte Array ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("\t"+a[i]);
		}
	}
}
public class ArrayInserteApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[6];
		int index,value;
		System.out.println("Enter the five element in array ");
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("Enter the index and value ");
		index=sc.nextInt();
		value=sc.nextInt();

		Inserte i = new Inserte();
		i.setArray(a,index,value);
		i.insertValueOnIndex();
	}
}