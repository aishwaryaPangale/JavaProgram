import java.util.*;
interface CharOperation
{
	void setCharArr(char ch[]);

	abstract char[] getArrResult();
}
class ConvertToUpper implements CharOperation
{
	char ch[];
    public void setCharArr(char ch[])
    {
		this.ch=ch;
	}
	public char[] getArrResult()
	{
		int i;
		for(i=0;i<ch.length;i++)
		{
			ch[i] = (char)((int)ch[i]-32);
		}
		return ch;
	}
}
class ChangeAlterNateChar implements CharOperation
{
	char ch[];
	public void setCharArr(char ch[])
	{
		this.ch=ch;
	}
	public char[] getArrResult()
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
public class PracticeInheritance8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		char ch[] = new char[5];
		System.out.println("Enter the String ");
		int i;
		for(i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}

		System.out.println("1.Convert To Upper 2.ChangeAlterNateChar");
		System.out.println("Enter choice ");
		int choice = sc.nextInt();

		switch(choice)
		{
			case 1: CharOperation co = new ConvertToUpper();
			        co.setCharArr(ch);
			        ch=co.getArrResult();
                    System.out.println("Convert String ");
			        System.out.println(String.valueOf(ch));
			        break;
			case 2:CharOperation cp = new ChangeAlterNateChar();
			       cp.setCharArr(ch);
			       ch=cp.getArrResult();
			        System.out.println("Alternate String ");
			       System.out.println(String.valueOf(ch));
			       break;
		}
	}
}