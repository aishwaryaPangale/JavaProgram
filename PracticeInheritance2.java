import java.util.*;
class Area
{
	int len,wid;
	float r;
	void setRadius(float r)
	{
		this.r=r;
	}
	void setLengthWidth(int len,int wid)
	{
		this.len=len;
		this.wid=wid;
	}
}
class Circle extends Area
{
	float getCircleArea()
	{
		float Area;
		Area = 3.14f*r*r;
		return Area;
	}
}
class Rectangle extends Area
{
	int getRectArea()
	{
		int Area;
		Area= len*wid;
		return Area;
	}
}
public class PracticeInheritance2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Area a = new Area();
		Circle c = new Circle();
		c.setRadius(3);
		float result = c.getCircleArea();
		System.out.println("Area of Circle : "+result);


		Rectangle r = new Rectangle();
		r.setLengthWidth(20,10);
		int area=r.getRectArea();
		System.out.println("Area of Rectangle : "+area);
	}
}