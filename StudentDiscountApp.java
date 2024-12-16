import java.util.*;
class Student
{
	int id;
	String name;
	int tfees;
	float per;
	int disfees;
	int actualfees;
	void setid(int id)
	{
		this.id=id;
	}
	int getid()
	{
		return id;
	}
	void setname(String name)
	{
		this.name=name;
	}
	String getname()
	{
		return name;
    }
    void setTotalFees(int tfees)
    {
		this.tfees=tfees;
	}
	int getTotalFees()
	{
		return tfees;
	}
	void setpercentage(float per)
	{
		this.per=per;
	}
	float getpercentage()
	{
		return per;
	}
	void setdisfees(int disfees)
	{
		this.disfees=disfees;
	}
	int getdisfees()
	{
		return disfees;
	}
	void setactualfees(int actualfees)
	{
		this.actualfees=actualfees;
	}
	int getactualfees()
	{
		return actualfees;
	}

}
class DisCountFees
{
	private Student s;
	public void setstudent(Student student)
	{
		s=student;
	}
	public void  checkDiscountEligilibility(float per)
	{

			if(per>60)
			{
				int disfees= (int)(s.getTotalFees()*0.3f);
				s.setdisfees(disfees);
			}

          int actualfees = s.getTotalFees()-s.getdisfees();
		s.setactualfees(actualfees);
	}
	public void showDetails()
	{
		System.out.println("id = "+s.getid());
		System.out.println("Name = "+s.getname());
		System.out.println("Percentage = "+s.getpercentage());
		System.out.println("Total Fees = "+s.getTotalFees());
		System.out.println("Discount Fees = "+s.getdisfees());
		System.out.println("Actual Fees = "+s.getactualfees());
	}

}
public class StudentDiscountApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id , name  , Total fees and percentage ");
		int id = sc.nextInt();
		String name = sc.next();
		int tfees = sc.nextInt();
		float per = sc.nextFloat();

		Student s = new Student();
		s.setid(id);
		s.setname(name);
		s.setpercentage(per);
		s.setTotalFees(tfees);

		DisCountFees df= new DisCountFees();
		df.setstudent(s);
		df.checkDiscountEligilibility(per);
		df.showDetails();

	}
}