import java.util.*;
class Cube
{
	int x;
	public void setValue(int x)
	{
		this.x=x;
	}
	public int getCube()
	{
		int cube;
		cube=x*x*x;
		return cube;
	}
}
public class PracticeCube
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int no= sc.nextInt();

		Cube c = new Cube();
		c.setValue(no);
		int result = c.getCube();
		System.out.println("Cube = "+result);
	}
}