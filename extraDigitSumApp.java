import java.util.*;
class extraDigitSum
{
	char [] c;
    void setvalue(char [] ch)
    {
		c=ch;
	}
	int getsum()
	{
		int sum=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='0'&&c[i]<='9')
			{
				sum=sum+ Integer.parseInt(String.valueOf(c[i]));
			}
		}
		return sum;
	}

}
public class extraDigitSumApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the string ");

		String str = sc.nextLine();
		char[] ch = str.toCharArray();

		extraDigitSum d = new extraDigitSum();
		d.setvalue(ch);
		int sum = d.getsum();

		System.out.println("Sum of Digit = "+sum);
	}
}
