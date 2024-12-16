import java.util.*;
class StudentDis
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
	private StudentDis s;
	public void setstudent(StudentDis student)
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
public class AOFStudentDiscountApp
{
	public static void main(String x[])
	{
		StudentDis s[]=new StudentDis[5];
		DisCountFees df[] = new DisCountFees[5];
		for(int i=0;i<s.length;i++)
		{
			Scanner sc = new Scanner(System.in);
			s[i]=new StudentDis();
			df[i]=new DisCountFees();
			System.out.println("\nEnter the id,name,percentage and total fees of student ");
			int id=sc.nextInt();
			String name=sc.next();
			int per=sc.nextInt();
			int tfees=sc.nextInt();

			s[i].setid(id);
			s[i].setname(name);
			s[i].setpercentage(per);
			s[i].setTotalFees(tfees);

         df[i].setstudent(s[i]);
		 df[i].checkDiscountEligilibility(per);
	     df[i].showDetails();
	   }
   }
}