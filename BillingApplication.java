import java.util.*;
class Product
{
	private int id;
	private String name;
	private int price;
	private int qty;
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
	public void setqty(int qty)
	{
		this.qty=qty;
	}
	public int getqty()
	{
		return qty;
	}
}
class Customer
{
	private int id;
	private String name;
	private String Address;
	private String contact;
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
	public String getName()
	{
		return name;
	}
	public void setaddress(String Address)
	{
		this.Address=Address;
	}
	public String getaddress()
	{
		return Address;
	}
	public void setContact(String contact)
	{
		this.contact=contact;
	}
	public String getcontact()
	{
		return contact;
	}
}
class calculateBill
{
	private  Product p[];
	private Customer c;
	void ShowDetails(Customer cr,Product ...p)
	{
		this.p=p;
		this.c=cr;


	}
	void calBill()
	{
		int sum=0;
		int total=0;
		System.out.println("Customer Details ");
		System.out.println("------------------------------------------------");

		System.out.println("Customer id :"+c.getid()+"\t"+" Name :"+c.getName()+"\t"+"Address :"+c.getaddress()+"\t"+" Contact :"+c.getcontact());


		System.out.println("\n\nOrder Details ");
        System.out.println("id\tname\tprice\tquanty\tTotal");
		for(int i=0;i<p.length;i++)
		{
			total=p[i].getprice()*p[i].getqty();
			System.out.println(p[i].getid()+"\t"+p[i].getname()+"\t"+p[i].getprice()+"\t"+p[i].getqty()+"\t"+total);
			sum=sum+total;
		}
		System.out.println("\t\t-----------------------");
		System.out.println("\t\tTotal Bill :\t"+sum);
	}

}
public class BillingApplication
{
	public static void main(String x[])
	{
		Product p1 = new Product();
		p1.setid(1);
		p1.setname("ABC");
		p1.setprice(10);
		p1.setqty(10);

		Product p2 = new Product();
		p2.setid(2);
		p2.setname("PQR");
		p2.setprice(20);
		p2.setqty(20);

		Product p3 = new Product();
		p3.setid(3);
		p3.setname("XYZ");
		p3.setprice(10);
		p3.setqty(50);

		Customer c = new Customer();
		c.setid(1);
		c.setname("Aish");
		c.setaddress("PUNE");
		c.setContact("9552441201");


		calculateBill cb = new calculateBill();
		cb.ShowDetails(c,p1,p2,p3);
		cb.calBill();
	}
}


