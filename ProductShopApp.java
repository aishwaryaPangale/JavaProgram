import java.util.*;
class Product
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
class Shop
{
	private Product p;
	void addData(Product prod)
	{
		p=prod;
	}
	void showData()
	{
		System.out.print(p.getid()+"\t"+p.getname()+"\t"+p.getprice());
	}
}
public class ProductShopApp
{
	public static void main(String x[])
	{
          Scanner sc = new Scanner(System.in);
		   	System.out.println("Enter the id ,name and proice of product ");
		   	int id=sc.nextInt();
		   	sc.nextLine();
		   	String name=sc.nextLine();

		    int price=sc.nextInt();

		Product p = new Product();
		Shop s = new Shop();
		p.setid(id);
		p.setname(name);
		p.setprice(price);

		s.addData(p);
		s.showData();
	}
}
