import java.util.*;
class PersonalInfo
{
	String name,middlename,lastname;
	PersonalInfo(String name,String middlename,String lastname)
	{
		this.name=name;
		this.middlename=middlename;
		this.lastname=lastname;
	}

}
class ProfessionalInfo extends PersonalInfo
{
	int id,salary;
	String des,skill;
	ProfessionalInfo(int id,String des,int salary,String skill,String name,String middlename,String lastname)
	{
		super(name,middlename,lastname);
		this.id=id;
		this.des=des;
		this.salary=salary;
		this.skill=skill;
	}
	void show()
	{
		System.out.println("Id : "+id );
		System.out.println("Name : "+name );
		System.out.println("Middlename : "+middlename );
		System.out.println("Last name : "+lastname );
		System.out.println("Designation : "+des );
		System.out.println("Salary : "+salary );
		System.out.println("Skill Set : "+skill);
	}
}
public class PracticeInheritance4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name , middlename , lastname,id,designation,salary,skill ");
		String name=sc.next();
		String middlename =sc.next();
		String lastname=sc.next();
		int id = sc.nextInt();
		String des=sc.next();
		int sal = sc.nextInt();
		String skill=sc.next();

		ProfessionalInfo pi = new ProfessionalInfo(id,des,sal,skill,name,middlename,lastname);
		pi.show();

	}
}