import java.util.*;
public class WrapperTemperature
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.next();

        Double f=0.0;
        try{
		 f = Double.parseDouble(str);
		 System.out.println("Fahrenheit : "+f);
	    }
	    catch(Exception e)
	    {
			System.out.println("Enter String in number ");
			System.out.println("Error :"+e);
		}


		Double c;

		c = (f-32)*5/9;

		System.out.println("Celsius "+c);
	}
}