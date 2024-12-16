import java.util.*;
abstract class StringOperation
{
	String str;
	void performOperation(String str)
	{
		this.str=str;
	}
}
class ConvertToUpper extends StringOperation
{
	public void performOperation(String str)
	{
		char ch[]=str.toCharArray();
		int i;
		for(i=0;i<ch.length;i++)
		{
			ch[i]=(char)((int)ch[i]-32);
		}
		System.out.println(String.valueOf(ch));

	}
}
class MaxRepetativeChar extends StringOperation
{
	public void performOperation(String str)
	{
		int i,j,count=1;
		char temp;
		char ch[]=str.toCharArray();

		for(i=0;i<ch.length;i++)
		{
			for(j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.print(ch[i]+"\t");
				}

			}
		}

	}
}
class WordReverse extends StringOperation
{
	public void performOperation(String str)
	{
		char ch[]=str.toCharArray();
		int i,j;
		char temp;
		for(i=0,j=ch.length-1;i<ch.length/2;i++,j--)
		{
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		System.out.println(String.valueOf(ch));
	}
}
public class AbStringOperationApp
{
	public static void main(String x[])
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.next();

		System.out.println("1)Convert String \n2)Max Repetative Char \n3)Word Reverse");
		System.out.println("Enter the Choice ");
		int choice = sc.nextInt();

		switch(choice)
		{
			case 1: ConvertToUpper c = new ConvertToUpper();
					c.performOperation(str);
					break;
			case 2: MaxRepetativeChar m = new MaxRepetativeChar();
			         m.performOperation(str);
			         break;
			case 3:  WordReverse w = new WordReverse();
			         w.performOperation(str);
			         break;
			default : System.out.println("Enter Valid Choice ");
		}
	}
}





