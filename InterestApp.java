import java.util.*;
class Interest
{
	int pamt;
	int irate;
	int dur;
	void setPRD(int pamt,int irate,int dur)
	{
		this.pamt=pamt;
		this.irate=irate;
		this.dur=dur;
	}

}
class CalculateInterest extends Interest
{
	int si;
	void calInterest()
	{
		si=pamt*irate*dur/100;
		System.out.println("Interest ="+si);
	}
}
class InterestApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pamount , rate and duration");
		int pamt=sc.nextInt();
		int irate=sc.nextInt();
		int dur=sc.nextInt();

		CalculateInterest ci = new CalculateInterest();
		ci.setPRD(pamt,irate,dur);
		ci.calInterest();
	}

}