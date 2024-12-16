class Add
{
	int a,b;
	void SetValue(int x,int y)
	{
		a=x;
		b=y;
	}
	void showAdd()
	{
		System.out.println("Addition = "+(a+b));
	}
}
public class AddApp
{
	public static void main(String args[])
	{
		Add ad = new Add();
		ad.SetValue(10,20);
		ad.showAdd();
	}
}
