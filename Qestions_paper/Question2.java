import java.util.*;
public class Question2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.nextLine();
		char ch[]=str.toCharArray();
		int num=0,sum=0;

		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0'&&ch[i]<='9')
			{
				num=num*10+(ch[i]-'0');
			}
			else
			{
				sum=sum+num;
				num=0;
			}
		}
		sum=sum+num;
		System.out.println("Number of sum : "+sum);
	}
}
