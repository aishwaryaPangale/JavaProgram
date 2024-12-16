import java.util.*;
public class Triangle
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System .in);
		int side1,side2,side3;
		System.out.println("\nEnter three side of tringle ");
		side1=xyz.nextInt();
		side2=xyz.nextInt();
		side3=xyz.nextInt();

	String result=(side1==side2 && side2==side3 &&side1==side3)?"Triangle is Quailateral ":
		(side1!=side2 && side2!=side3 &&side1!=side3)?"Tringale is Scalen "
		:"Triangle is Isoscalen ";


		System.out.println(result);
	}
}