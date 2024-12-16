import java.util.*;
abstract class Value
{
	int a,b;
	void setValue(int a , int b)
	{
		this.a=a;
		this.b=b;
	}
	abstract int getResult();
}
class Power extends Value
{
	int getResult()
	{
		int i,p=1;
		for(i=1;i<=b;i++)
		{
			p=p*a;
		}
		return p;
	}
}
class SerachDigit extends Value
{
	int getResult()
	{
		boolean f=true;
		while(a!=0)
		{
			int rem = a%10;
			if(rem==b)
			{
				f=false;
				break;
			}
			else
			{
				f=true;
			}
			a=a/10;
		}
		if(f==false)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}


public class PracticeInheritances6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

	      int a,b;
	      System.out.println("Enter two number ");
	      a=sc.nextInt();
	      b=sc.nextInt();

	    System .out.println("1.Power of number\n2.Serach Digits ");
	    System.out.println("Enter your choice ");
	    int choice = sc.nextInt();

	   switch(choice)
	   {
		   case 1:
					Value v = new Power();
					v.setValue(a,b);
					int power=  v.getResult();
					System.out.println("Power  : "+power);
					break;
		   case 2 :
		             Value l = new SerachDigit();
		             l.setValue(a,b);
		             int digit = l.getResult();
		             System.out.println("Result : "+digit);
		             break;
		   default:System.out.println("Enter valid choice");

	   }
	}
}