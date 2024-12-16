import java.util.*;
class ConvertToUpper
{
	char ch[];
	void setcharArray(char ch[])
	{
		this.ch=ch;
	}
	void convertToUpperCase()
	{
		for(int i=0;i<ch.length;i++)
		{
			ch[i]= (char)( ((int)ch[i])-32);  //good

		}
		  System.out.println(String.valueOf(ch));

	}

}
public class ConvertToUpperApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word ");
		String str =sc.next();
		char[] ch =str.toCharArray();

		ConvertToUpper c = new ConvertToUpper();
		c.setcharArray(ch);
		c.convertToUpperCase();
	}
}