import java.util.*;
class Area
{
	float r;
	int len;
	int width;
	Area(float r)
	{
		this.r=r;
		float a = 3.14f*r*r;
		System.out.println("Area of circle = "+a);
	}
	Area(int len,int width)
	{
		this.len=len;
		this.width=width;
		int a = len*width;
		System.out.println("Area of Rectangle = "+a);
	}
}

public class PracticeArea
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius ");
		float r = sc.nextFloat();
		Area a = new Area(r);

		System.out.println("Enter the length and width ");
		int len = sc.nextInt();
		int width = sc.nextInt();
		Area a1 = new Area(len,width);
	}
}