import java.util.*;
public class AsciiValue
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int i;
		char ch;

		for(i=1;i<=255;i++)
		{
			System.out.printf("\t%d-----%c",i,i);
		}
	}
}