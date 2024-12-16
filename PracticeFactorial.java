import java.util.*;
class Factorial
{
	int no;
	public void setValue(int no)
	{
		this.no=no;
	}
	public int getFactorial()
	{
		int f=1;
		for(int i=1;i<=no;i++)
		{
			 f=f*i;

		  }
		  return f;
	  }
}
public class PracticeFactorial
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int no = sc.nextInt();

		Factorial f = new Factorial();
		f.setValue(no);
		int result = f.getFactorial();
		System.out.println("Factorial number "+result);
	}
}