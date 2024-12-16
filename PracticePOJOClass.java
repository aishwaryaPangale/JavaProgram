import java.util.*;
class Employee
{
	int id;
	String name;
	int sal;
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
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
public class PracticePOJOClass
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id , name , salary ");
		int id = sc.nextInt();
		String name = sc.next();
		int sal = sc.nextInt();

		Employee e = new Employee();
		e.setid(id);
		e.setName(name);
		e.setsal(sal);

		System.out.println("Id  = "+e.getid()+"\tName = "+e.getName()+"\tSalary = "+e.getsal());
	}
}