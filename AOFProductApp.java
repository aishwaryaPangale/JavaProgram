import java.util.*;
class Product
{
	int id;
	String name;
	int price;
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
public class AOFProductApp
{
	public static void main(String x[])
	{
		Product p[] = new Product[5];
		Product temp;
		for(int i=0;i<p.length;i++)
		{
			Scanner sc = new Scanner(System.in);
			p[i]=new Product();
			System.out.println("Enter id ,name and price of product ");
			int id=sc.nextInt();
			String name=sc.next();
			int price=sc.nextInt();

			p[i].setid(id);
			p[i].setname(name);
			p[i].setprice(price);
		}

		for(int i=0;i<p.length;i++)
		{
			for(int j=i+1;j<p.length;j++)
			{
				if(p[i].getprice()==p[j].getprice())
				{
					System.out.println(p[i].getid()+"\t"+p[i].getname()+"\t"+p[i].getprice());
					System.out.println(p[j].getid()+"\t"+p[j].getname()+"\t"+p[j].getprice());
				}
			}
		}
	}
}
