import java.util.*;
class Perfect
{
	int no,i,f=0,temp;
	void setValue(int a)
	{
		no=a;
	}
	void showResult()
	{
		for(i=1;i<no;i++)
		{
			if(no%i==0)
			{
				f=f+i;
			}
		}
		if(no==f)
		{
			System.out.println("Number is Perfect ");
		}
		else{
			System.out.println("Number is not perfect ");
		}
	}
}
public class PerfectApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int no = sc.nextInt();

		Perfect p = new Perfect();
		p.setValue(no);
		p.showResult();
	}
}