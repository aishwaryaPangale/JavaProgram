import java.util.*;
class CheckChar
{
	char ch;
	public void setChar(char ch)
	{
		this.ch=ch;
	}
	public boolean getCheckChar()
	{
		if(ch>='A'&&ch<='Z' || ch>='a'&&ch<='z' || ch>='0'&&ch<='9')
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
public class PracticeCheckChar
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character ");
		char ch = sc.next().charAt(0);

		CheckChar  c = new CheckChar();

		c.setChar(ch);
		boolean result = c.getCheckChar();
		System.out.println("Result  = "+result);
	}
}