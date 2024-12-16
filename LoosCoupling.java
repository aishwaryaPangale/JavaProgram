import java.util.*;
abstract class Value
{
	int a,b;
	void setValue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	abstract void PerformCalculation();
}
class Add extends Value
{
	void PerformCalculation()
	{
		System.out.println("Addition is : "+(a+b));
	}
}
class Sub extends Value
{
	void PerformCalculation()
	{
		System.out.println("Subtraction is :"+(a-b));
	}
}
class Mul extends Value
{
	void PerformCalculation()
	{
		System.out.println("Multiplication is :"+(a*b));
	}
}
class Div extends Value
{
	void PerformCalculation()
	{
		System.out.println("Division is :"+(a/b));
	}
}
class Calculator
{
	void PerformOperation(Value v)
	{
		v.PerformCalculation();
	}
}
public class LoosCoupling
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Two number ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		System.out.println("Enter your choice ");
		int choice = sc.nextInt();

		Calculator c = new Calculator();
		switch(choice)
		{
			case 1 : Add ad = new Add();
			         ad.setValue(a,b);
			         c.PerformOperation(ad);
					 break;

			case 2 : Sub s = new Sub();
					s.setValue(a,b);
					c.PerformOperation(s);
					break;

			case 3 : Mul m = new Mul();
					m.setValue(a,b);
					c.PerformOperation(m);
					break;

			case 4 :Div d = new Div();
					d.setValue(a,b);
					c.PerformOperation(d);
					break;

			default : System.out.println("Enter valid choice ");
		}
	}
}
