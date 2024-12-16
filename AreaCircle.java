class Circle
{
	float r,area;
	void setRadius(float a)
	{
		r=a;
	}
	void calCircle()
	{
		area=3.14f*r*r;
		System.out.println("Area of circle = "+area);
	}
}
public class AreaCircle
{
	public static void main(String args[])
	{
		Circle c = new Circle();
		c.setRadius(5f);
		c.calCircle();
	}
}