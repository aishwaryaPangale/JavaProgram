import java.util.*;
abstract class Palindrom
{
	abstract void setString(String str);
	abstract void IsPalindrom();
}
class CheckPalindrom extends Palindrom
{
	String str;
	char ch [];
	int end;
	int i;
	boolean flag=false;
	public void setString(String str)
	{
		this.str=str;
	}
	public void IsPalindrom()
	{
		ch=str.toCharArray();
		end=ch.length-1;
		for(i=0;i<ch.length/2;i++,end--)
		{
			if(ch[i]!=ch[end])
			{
				flag=true;
				break;
			}
		}

		if(flag==false)
		{
			System.out.println("String is Palindrom ");
		}
		else
		{
			System.out.println("String is not palindrom ");
		}
	}


}

public class PalindromApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.next();

		CheckPalindrom cp = new CheckPalindrom();
		cp.setString(str);
		cp.IsPalindrom();
	}
}

