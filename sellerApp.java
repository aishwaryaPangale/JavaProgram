import java.util.*;
class Seller
{
	int sp,cp;
	void acceptSellingCostPrice(int sp ,int cp)
	{
		this.sp=sp;
		this.cp=cp;
	}
	void showresult()
	{
		if(sp>cp)
		{
			System.out.println("Profit ");
		}
		else
		{
			System.out.println("Loss ");
		}
	}
}
public class sellerApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Selling and Cost price ");
		int sp = sc.nextInt();
		int cp = sc.nextInt();

		Seller s = new Seller();
		s.acceptSellingCostPrice(sp,cp);
		s.showresult();
	}


}