import java.util.*;
abstract class ArrAbs
{
	int a[];
	int b[];
	int c[];
	void setArray(int a[] ,int b[],int c[])
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	abstract int[] getResultArray();
}
class Intersection extends ArrAbs
{
	int[] getResultArray()
	{
		int i,j,k=0;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					c[k]=a[i];
					k++;
				}
			}
		}
		return c;
	}
}
class Union extends ArrAbs
{
	int [] getResultArray()
	{
		int i,j,k=0;
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
		return c;
	}


}
public class PracticeInheritance7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int[5];
		int c[] = new int[10];
		int i;
		System.out.println("Enter first Array element ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("Enter Second Array element ");
		for(i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}

		System.out.println("1.Intersection\n2.Union");
		System.out.println("Enter your choice ");
		int choice = sc.nextInt();

		switch(choice)
		{
			case 1: ArrAbs ab = new Intersection();
			        ab.setArray(a,b,c);
			        c= ab.getResultArray();
			        System.out.println("Intersection Array ");
			        for(i=0;i<c.length;i++)
			        {
						if(c[i]!=0)
						  System.out.print(c[i]+"\t");
					}
					break;
			case 2: ArrAbs arr = new Union();
			        arr.setArray(a,b,c);
			        c=arr.getResultArray();
			        System.out.println("Union Array ");
			        for(i=0;i<c.length;i++)
			        {
						if(c[i]!=0)
						  System.out.print(c[i]+"\t");
					}
					break;
				}
	}
}