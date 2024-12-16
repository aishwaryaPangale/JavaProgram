import java.util.*;
class per
{
	int a[];
	int sum,per;
	void calper(int a[])
	{
		this.a=a;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		per=sum/6;
	}

}
class Cse extends per
{
	String name;
	int id;
	String add;
	String year;
	Cse(String name,int id,String add,String year)
	{
		this.name=name;
		this.id=id;
		this.add=add;
		this.year=year;
	}
	void showCseper()
    {
		System.out.println("\nCSE student Data ");
		System.out.println("Name = "+name+"\nid ="+id+"\naddress ="+add+"\nyear ="+year);
		System.out.println("Percentage = "+per);
	}
}
class Etc extends per
{
	String name;
	int id;
	String add;
	String year;
	Etc(String n,int i,String a,String y)
	{
		name=n;
		id=i;
		add=a;
		year=y;
	}
	void showEtcper()
    {
		System.out.println("\nCSE student Data ");
		System.out.println("Name = "+name+"\nid ="+id+"\naddress ="+add+"\nyear ="+year);
		System.out.println("Percentage = "+per);
	}
}

public class ResultApp
{
	public static void main(String x[])
	{


		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
				System.out.println("Enter the six subject marks of cse student ");
				for(int i=0;i<a.length;i++)
				{
					a[i]=sc.nextInt();
			     }
				System.out.println("Enter the name , id ,address and year of student ");
				String name = sc.next();
				int id = sc.nextInt();
				String add = sc.next();
		String year = sc.next();
		System.out.println("How you search result 1)CSE  2)ETC");
		int n=sc.nextInt();
		switch(n)
		{
		       case 1:

						Cse c = new Cse(name,id,add,year);
						c.calper(a);
						c.showCseper();
						break;
			case 2:
						Etc e = new Etc(name,id,add,year);
						e.calper(a);
						e.showEtcper();
						break;
			default:System.out.println("Invalid data");
		}

	 }
 }




