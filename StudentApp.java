import java.util.*;
class Student
{
	private int id;
	private String name;
	private int marks[];
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
	public void setmarks(int arr[])
	{
		marks=arr;
	}
	public int[] getmarks()
	{
		return marks;
	}
}
class Findper
{
	private Student s;
	int m[];
	private float per;
	void setstudent(Student student)
	{
		s=student;
	}
	void showStudent()
	{
		m=s.getmarks();
		System.out.print(s.getid()+"\t"+s.getname()+"\t");
		for(int i=0;i<6;i++)
		{
			System.out.print(m[i]+"\t");
		}

	}
	void getper()
	{
         int sum=0;
         for(int i=0;i<6;i++)
         {
			 sum=sum+m[i];
		 }
		 System.out.println("\nSum of marks : "+sum);
		 per=(float)sum/6;
		 System.out.println("percentage : "+per);
	}
	void checkGrade()
	{
		if(per>75&&per<=100)
		{
			System.out.println("Destination");
		}
		else if(per>60 && per<=75)
		{
			System.out.println("First Devision ");
		}
		else if(per>=50 && per<=60)
		{
			System.out.println("Second Devision");
		}
		else if(per>40 && per<=50)
		{
			System.out.println("Third Devision");
		}
		else{
			System.out.println("Fail");
		}
	}
 }

public class StudentApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter the id and name ");
		int id=sc.nextInt();
		String name=sc.next();

		System.out.println("Enter the six subject marks of student ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		Student s = new Student();
	    Findper fp = new Findper();

	    s.setid(id);
	    s.setname(name);
	    s.setmarks(a);

	    fp.setstudent(s);
	    fp.showStudent();
	    fp.getper();
	    fp.checkGrade();
	}
}

