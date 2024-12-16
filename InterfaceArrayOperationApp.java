import java.util.*;
interface ArrayOperationApp
{
	void setArray(int a[]);
    void Perform();
}
class Reverse implements ArrayOperationApp
{
	int a[];
	public void setArray(int a[])
	{
		this.a=a;
	}
	public void Perform()
	{
		int i,j,temp;
		for(i=0,j=a.length-1;i<a.length/2;i++,j--)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println("Reverse Array ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}
}
class SecondMax implements ArrayOperationApp
{
	int a[];
	public void setArray(int a[])
	{
		this.a=a;
	}
	public void Perform()
	{
		int i,j,max=0,sec=a[0];

		for(i=0;i<a.length;i++)
		{

			if(a[i]>max)
			{
				sec=max;
			     max=a[i];
			 }
			 else if(a[i]>sec && a[i]!=max)
			 {
				 sec=max;
				 max=a[i];
			 }
		}
		System.out.println("Maxmimun number ="+max);
		System.out.println("Second max = "+sec);
	}
}
class RotateNthPosition implements ArrayOperationApp
{
	int a[],n;
	public void setArray(int a[])
	{
		this.a=a;
	}
	public void Perform()
	{
		int i,j,n,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the nth position ");
		n=s.nextInt();

		for(i=1;i<=n;i++)
		{
			temp=a[0];
			for(j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		System.out.println("Rotate Array ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}
}

class SecMin implements ArrayOperationApp
{
	int a[];
	public void setArray(int a[])
	{
		this.a=a;
	}
	public void Perform()
	{
		int i,min=a[0],smin=a[0];
		for(i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			else if(a[i]>min && (smin==min || a[i]<smin))
			{
				smin=a[i];
			}
		}
		System.out.println("Minimum number "+min);
		System.out.println("Second min "+smin);
	}
}
public class InterfaceArrayOperationApp
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
		System.out.println("1.Reverse Array \n 2.Second Max \n 3. Rotate nth Position \n 4.Second minimum number in array ");
		System.out.println("Enter your choice ");
		int choice = sc.nextInt();

		switch (choice)
		{
		   case 1 : ArrayOperationApp ra = new Reverse();
					ra.setArray(a);
					ra.Perform();
					break;
		   case 2 : ArrayOperationApp r = new SecondMax();
		            r.setArray(a);
		            r.Perform();
		            break;
		   case 3 : ArrayOperationApp o = new RotateNthPosition();
		   			o.setArray(a);
		   			o.Perform();
		   			break;
		   case 4 : ArrayOperationApp ap = new SecMin();
		   			ap.setArray(a);
		   			ap.Perform();
		   			break;
		   default : System.out.println("Invalid Choice ");
		}
	}
}
