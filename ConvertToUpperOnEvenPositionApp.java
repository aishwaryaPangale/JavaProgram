import java.util.*;
class ConvertToUpperOnEvenPosition
{
	char ch[],str;
	int i;
	ConvertToUpperOnEvenPosition(char c[])
	{
		ch=c;
	}
	void convert()
	{
		for(i=0;i<ch.length;i++)
		{
			if(i%2==0)
			{
				ch[i] = (char)((int)ch[i]-32);
				System.out.println(i+"\t"+ch[i]);
			}
		}
	}
	char [] getConvertedArray()
	{
		return ch;
    }

}
public class ConvertToUpperOnEvenPositionApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter the string ");
		String str = sc.next();
		char ch[] = str.toCharArray();

		ConvertToUpperOnEvenPosition c = new ConvertToUpperOnEvenPosition(ch);
		c.convert();
        System.out.println("After conversion of array ");
        char [] result = c.getConvertedArray();
        System.out.println(result);
	}
}
