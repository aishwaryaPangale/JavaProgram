import java.util.*;
class Book
{
	private int id;
	private String name;
	private int price;
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void setprice(int price)
	{
		this.price=price;
	}
	public int getprice()
	{
		return price;
	}
}
public class AOFBookApp
{
	public static void main(String x[])
	{
		Book b[]=new Book[5];
		Book temp;
		for(int i=0;i<b.length;i++)
		{
			Scanner sc = new Scanner(System.in);
			b[i]=new Book();
			System.out.println("Enter the id,name and price of Book");
			int id=sc.nextInt();
			String name=sc.next();
			int price=sc.nextInt();

			b[i].setid(id);
			b[i].setname(name);
			b[i].setprice(price);
		}

		System.out.println("Book Store in Desending order ");
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i].getprice()<b[j].getprice())
				{
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i].getid()+"\t"+b[i].getname()+"\t"+b[i].getprice());
		}

	}
}