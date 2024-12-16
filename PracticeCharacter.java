import java.util.*;
public class PracticeCharacter
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character ");
		char ch = sc.next().charAt(0);

		if(ch>='A'&& ch<='Z' || ch>='a'&&ch<='z')
		{
			System.out.println("Character is Alphabet ");
		}
		else
		{
			System.out.println("Character is Special Character ");
		}
	}
}
