import java.util.*;
class CheckDuck
{
	int no;
	CheckDuck(int no)
	{
		this.no=no;
	}
     boolean DuckNumber()
     {
		 boolean f = false;
		 int rem;
		 while(no!=0)
		 {
			 rem=no%10;
			 if(rem==0)
			 {
				 f=true;
			 }
			 no=no/10;
		 }
		 if(f==true)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }

}
public class PracticeConstructorDuck
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int no = sc.nextInt();
		CheckDuck cd = new CheckDuck(no);
	    boolean result = cd.DuckNumber();
	    System.out.println("   "+result);
	}
}