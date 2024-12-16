import java.util.*;
public class CharacterCheck
{
    public static void main(String x[])
	{
	   Scanner abc = new Scanner(System .in);
	   char ch;
	   System.out.println("\nEnter the character ");
	   ch=abc.next().charAt(0);

	   String result=(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u')||(ch=='A'||ch=='I'||ch=='E'||ch=='O'||ch=='U')?"Charecter is vowel ":"Character is Console ";
	   System.out.println("\nCharacter is :"+result);
	}
}