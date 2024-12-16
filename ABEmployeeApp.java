import java.util.*;
class Employee
{
	private int id;
	private String name;
	private int sal;
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
	public void setsal(int sal)
	{
		this.sal=sal;
	}
	public int getsal()
	{
		return sal;
	}

}
public class ABEmployeeApp
{
	public static void main(String x[])
	{
		Employee emp[]=new Employee[5];    //Array of reference
		for(int i=0;i<emp.length;i++)
		{
			Scanner sc = new Scanner(System.in);
			emp[i]=new Employee();
			System.out.println("Enter id,name,salary ");
			int id=sc.nextInt();
			String name=sc.next();
			int sal=sc.nextInt();

			emp[i].setid(id);
			emp[i].setname(name);
			emp[i].setsal(sal);
		}
		System.out.println("id\tname\tsalary");
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i].getid()+"\t"+emp[i].getname()+"\t"+emp[i].getsal());
		}
	}
}


