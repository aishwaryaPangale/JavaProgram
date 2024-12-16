
public class ArrayMinMax
{
    public static void main(String args[])
    {
        int a[] = new int[]{10,20,30,40,5,2};
		int i;
        System.out.println("Display Array ");
        {
            for(i=0;i<a.length;i++)
            {
                System.out.printf("%d\t",a[i]);
            }
        }
		int max=a[0];
		int min=a[0];
		for(i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			else
			{
				min=a[i];
			}
		}
		System.out.printf("\nMaximum number in array is : %d",max);
		System.out.printf("\nMinimum number in array is : %d",min);
    }
}