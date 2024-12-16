import java.util.*;
public class TestPattern
{
	public static void main(String x[])
	{
		int i,j;
		char c;
		for(i=0;i<5;i++)
		{
			char ch='A';
			for(j=0;j<9;j++)
			{
				if(j<=i)
				{
					System.out.print(ch++);
				}
				else if(i>=1&&j<=i+i)
				{
					c=--ch;
					System.out.print(--c);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

