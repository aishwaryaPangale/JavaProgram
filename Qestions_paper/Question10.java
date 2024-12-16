import java.util.*;
class FindSecondHighest
{
	private String str;
	void setString(String str)
	{
		this.str=str;
	}
	void  getSecondHighestWord()
	{
		int i;
		String str1[] = str.split(" ");
		int max=str1[0].length();
		int sec = str1[0].length();
		String str2="",str3="";
		for(i=0;i<str1.length;i++)
		{
			int len = str1[i].length();
			System.out.println(str1[i]+"-------"+len);
             if(max<len)
             {
				 max=len;
				 str2=str1[i];
			 }
			 else if(len<max && (max==sec||len>sec))
			 {
				 sec=len;
				 str3=str1[i];
			 }


		}
			System.out.println("\n\n\nhighest :"+str2+"---------"+max);
			System.out.println("second highest :"+str3+"--------"+sec);
	}
}
public class Question10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();

		FindSecondHighest fh = new FindSecondHighest();
		fh.setString(str);
		fh.getSecondHighestWord();
		//String str1 = fh.getSecondHighestWord();
		//System.out.println("Second highest string  :"+str1);
	}
}