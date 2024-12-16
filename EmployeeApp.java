import java.util.*;
class Employee
{
	private int id;
	private String name;
	private int sal;
	private int prog;
	private double total;
	private double tsal;
	void setpersonalInfo(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;

	}
	void setProgressPer(int prog)
	{
		this.prog=prog;

		if(prog>60)
		{
		   total=sal*0.3;
		   tsal=total+sal;
		}
	}
	void showDetails()
	{
		System.out.println("\nDetails of employee ");
		System.out.println("\nid = "+id+"\nName = "+name+"\nSalary = "+sal+"\nIncrement Salary = "+total+"\nTotal Salary = "+tsal);
	}
}
public class EmployeeApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id,name and basic salary of employee ");
		int id=sc.nextInt();
		String name = sc.next();
		int sal = sc.nextInt();

		 System.out.println("Enter the Progress Salary ");
		        int p=sc.nextInt();


		Employee e = new Employee();
		e.setpersonalInfo(id,name,sal);
		 e.setProgressPer(p);
		e.showDetails();




	}
}