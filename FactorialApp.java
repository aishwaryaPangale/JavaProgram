import java.util.*;
class Factorial
{
	int no,i,f=1;
	void setValue(int a)
	{
		no=a;
	}
	void showFactorial()
	{
		for(i=1;i<=no;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial = "+f);
	}
}
public class FactorialApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int no = sc.nextInt();

		Factorial f = new Factorial();
		f.setValue(no);
		f.showFactorial();
	}
}