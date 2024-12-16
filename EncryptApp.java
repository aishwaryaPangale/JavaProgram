import java.util.*;
class Encrypt
{
	String str;
	char ch[];
	Encrypt(String str)
	{
		this.str=str;
	}
	void beforEncrypt()
	{
		System.out.println("Before String : "+str);
	}
	void afterEncrypt()
	{
	    char ch []= str.toCharArray();
        char temp;
        int i,j;
        for(i=0;i<ch.length;i++)
        {
			for(j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		int count=1;
	    for( i=0;i<ch.length;i++)
	    {
			if(i==ch.length-1)
			{
				System.out.println(ch[i]+"-----"+count);
			}
			else if(ch[i]==ch[i+1])
			{
					count++;
			}
			else
			{
			    System.out.println(ch[i]+"-----"+count);
				count=1;
			}

		}
		System.out.println();



	}
}
public class EncryptApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String ");
		String str = sc.next();

		Encrypt e = new Encrypt(str);
		//e.Encrypt(str);
		e.beforEncrypt();
		e.afterEncrypt();
	}
}