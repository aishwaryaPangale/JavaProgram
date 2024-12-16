import java.util.*;
class Union
{
	int a[],b[],c[],i,j,k=0;
	void setArray(int arr1[],int arr2[],int arr3[])
	{
		a=arr1;
		b=arr2;
		c=arr3;
	}
	void FindUnion()
	{
		for(i=0;i<a.length;i++)
		{
			c[k]=a[i];
			k++;
		}
		for(i=0;i<b.length;i++)
		{
			boolean f=false;
			for(j=0;j<a.length;j++)
			{
				if(b[i]==c[j])
				{
					f=true;
				}
			}
			if(f==false)
			{
				c[k]=b[i];
				k++;
			}
		}
		System.out.println("Union Array ");
		for(i=0;i<k;i++)
		{
			System.out.print("\t"+c[i]);
		}
		System.out.println();
	}
}
public class UnionApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[10];
		int i;
		System.out.println("Enter the First Array Element ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the second Array Element ");
		for(i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		Union u=new Union();
		u.setArray(a,b,c);
		u.FindUnion();
	}
}