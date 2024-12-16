import java.util.*;
class MissingElement
{
	private int a[];
	public void setArray(int arr[])
	{
		a=arr;
	}
	public void Showmissingelement()
	{
		System.out.println("Missing Element in array ");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i];j<a[i+1]-1;)
			{
				System.out.print("\t"+(++j));
			}
		}
		System.out.println();
	}
}
public class FindMissingElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter the element in array ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		MissingElement me = new MissingElement();

		me.setArray(a);
		me.Showmissingelement();
	}
}