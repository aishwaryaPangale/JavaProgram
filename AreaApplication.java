import java.util.*;
abstract class Area
{
	abstract void showArea();

}

class Circle extends Area
{
	float radius;
	void setRadius(float radius)
	{
		this.radius=radius;
	}
	void showArea()
	{
		double Area = 3.14*radius*radius;
		System.out.println("Area of Circle = "+Area);
	}
}
class Rectangle extends Area
{
	int len;
	int wid;
	void setLengthWidth(int len ,int wid)
	{
		this.len=len;
		this.wid=wid;
	}
	void showArea()
	{
		int Area=len*wid;
		System.out.println("Area of Rectangle ="+Area);
	}
}
class AreaApplication
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1)Area of circle 2)Area of rectangle ");
		System.out.println("Enter your choice ");
		int n=sc.nextInt();

		switch(n)
		{
			case 1: System.out.println("Enter the radius ");
			        float r =sc.nextFloat();
			        Circle c =new Circle();
			        c.setRadius(r);
			        c.showArea();
			        break;
		   case 2: System.out.println("Enter the length and width ");
			        int l =sc.nextInt();
			        int w =sc.nextInt();
			        Rectangle ra =new Rectangle();
			        ra.setLengthWidth(l,w);
			        ra.showArea();
			        break;
		  default :System.out.println("Enter correct choice ");
	  }
  }



}
