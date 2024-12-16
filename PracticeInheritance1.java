import java.util.*;
class value
{
	int a,b;
	void setValue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
}
class Add extends value
{
	int getAdd()
	{
		return a+b;
	}
}
class Sub extends value
{
	int getSub()
	{
		return a-b;
	}
}
class Mul extends value
{
	int getMul()
	{
		return a*b;
	}
}
class Div extends value
{
	int getDiv()
	{
		return a/b;
	}
}

public class PracticeInheritance1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the two number ");
		a=sc.nextInt();
		b=sc.nextInt();

		value v = new value();
		v.setValue(a,b);
		Add ad =new Add();
		int Add = ad.getAdd();
		     System.out.println("Addition : "+Add);

		  Sub s=new Sub();
		int Sub = s.getSub();
		    System.out.println("Subtraction : "+Sub);

		   Mul m=new Mul();
		int Mul = m.getMul();
		   System.out.println("Multiplication : "+Mul);

		  Div d=new Div();
		int Div = d.getDiv();
		     System.out.println("Addition : "+Div);
	}
}