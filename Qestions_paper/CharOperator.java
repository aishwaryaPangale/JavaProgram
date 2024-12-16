import java.util.*;
interface CharOperator
{
	void setCharArr(char ch[]);
	char [] getArrResult();
}
class ConvertToUpper implements CharOperator
{
	char ch[];
	void setCharArr(char ch[])
	{
		this.ch=ch;
	}
	char[] getArrResult()
	{
		int i;
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]=>'a'&&ch<='z')
			{
				ch[i]=(char)((int)ch[i]-32);
			}
		}
		return ch;
	}
}
class ChangeAlternateChar implements CharOperator
{
	char ch[];
	void setCharArr(char ch[])
	{
		this.ch=ch;
	}
	char[] getArrResult()
	{
		int i;
		for(i=0;i<ch.length;i++)
		{
			if(i%2==0)
			{
				ch[i]=(char)((int)ch[i]-32);
			}
		}
		return ch;
	}
}
public class Sample
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		char ch[] = new char[10];
		System.out.println("Enter the character ");
		int i;
		for(i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		System.out.println("1.Converte to upper \n 2.Change Alternate char");
		System.out.println("Enter your choice ");
		int choice = sc.nextInt();

		switch(choice)
		{
			case 1: ConvertToUpper cu = new ConvertToUpper();
			         cu.setCharArr(ch);
			         char c = cu.getArrResult();
			         System.out.println("String :"+string.valueOf(ch));
			          break;

			case 2:  ChangeAlternateChar cac = new ChangeAlternateChar();
			         cac.setCharArr(ch);
			         c=cac.getArrResult();
			          System.out.println("String :"+string.valueOf(ch));
			          break;
		}
	}
}


