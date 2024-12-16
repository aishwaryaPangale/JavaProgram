import java.util.*;
interface StringTemplate
{
	void setString(String str);
	void getResult();
}
class FindVowel implements StringTemplate
{
    private String str;
	public void setString(String str)
	{
		this.str=str;
	}
	public void getResult()
	{
		int i,count=0;
		for(i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if((ch=='a'||ch=='e'||ch=='i'||ch =='o'||ch=='u')||(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
			{
				System.out.print(ch+"\t");
				count++;
			}

		}
		System.out.println("Count of vowel :"+count);
	}


}

class ExtraDigits implements StringTemplate
{
	private String str;
	public void setString(String str)
	{
		this.str=str;
	}
	public void getResult()
	{
		int i,sum=0;
		for(i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				sum=sum+(ch-'0');
			}

		}
		System.out.println("Sum of extra digit :"+sum);
	}
}
class StringOperation
{
	void performOperation( StringTemplate st)
	{
		st.getResult();
	}
}
public class Question11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();

        StringOperation so = new StringOperation();

		FindVowel fw = new FindVowel();
		fw.setString(str);
	   so.performOperation(fw);

		ExtraDigits ed = new ExtraDigits();
		ed.setString(str);
		so.performOperation(ed);
	}
}