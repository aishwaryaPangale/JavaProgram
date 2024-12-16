import java.util.*;
class Student
{
	private int id;
	private String name;
	private float per;
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
	public void setper(float per)
	{
		this.per=per;
	}
	public float getper()
	{
		return per;
	}
}
public class AOFStudentApp
{
	public static void main(String x[])
	{
		Student s[]=new Student[5];
		for(int i=0;i<s.length;i++)
		{
			Scanner sc = new Scanner(System.in);
			s[i]=new Student();
			System.out.println("Enter id,name and percentage of student ");
			int id=sc.nextInt();
			String name=sc.next();
			float per=sc.nextFloat();

			s[i].setid(id);
			s[i].setname(name);
			s[i].setper(per);

		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id by you found ");
		int sid=sc.nextInt();

		boolean f=false;
		for(int i=0;i<s.length;i++)
		{
			if(sid==s[i].getid())
			{
				System.out.println("id ="+s[i].getid()+"\tname ="+s[i].getname()+"\tpercentage ="+s[i].getper());
				f=true;
				break;
			}
		}
		if(f==true)
		{

			System.out.println("Student is found ");
		}

		else
		{
			System.out.println("Student is not found ");
		}


	}
}