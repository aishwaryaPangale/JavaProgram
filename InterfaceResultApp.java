import java.util.*;
interface Percentage
{
	void setValue(String name,int id);
	void Per(int a[]);
}
class CSE implements Percentage
{
	String name;
	int id;
	int a[];
	public void setValue(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public void Per(int a[])
	{

		this.a=a;aa
		int sum=0,i,per;
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		per=sum/a.length;
		System.out.println("Name = "+name+"\n Id = "+id+"\nPercentage ="+per);
	}
}

class ETC implements Percentage
{
	String name;
	int id;
	int a[];
	public void setValue(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public void Per(int a[])
	{

		this.a=a;
		int sum=0,i,per;
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		per=sum/a.length;
		System.out.println("Name = "+name+"\n Id = "+id+"\nPercentage ="+per);
	}
}

class ME implements Percentage
{
	String name;
	int id;
	int a[];
	public void setValue(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public void Per(int a[])
	{

		this.a=a;
		int sum=0,i,per;
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		per=sum/a.length;
		System.out.println("Name = "+name+"\n Id = "+id+"\nPercentage ="+per);
	}
}

public class InterfaceResultApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name id ");
		String name = sc.next();
		int id = sc.nextInt();

		int a[] =new int[6];
		System.out.println("Enter the marks of six subject ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

         System.out.println("1.Computer Branch \n2.Electrical Branch\n3.Mechanical Branch ");
         System.out.println("Enter the choice ");
         int choice = sc.nextInt();

         switch(choice)
         {
			 case 1 : Percentage p = new CSE();
					  p.setValue(name,id);
					  p.Per(a);
					  break;
			case 2 : Percentage p = new ETC();
					  p.setValue(name,id);
					  p.Per(a);
					  break;
		    case 3 : Percentage p = new ME();
					  p.setValue(name,id);
					  p.Per(a);
		   default : System.out.println("Enter valid choice ");
	   }

	}
}