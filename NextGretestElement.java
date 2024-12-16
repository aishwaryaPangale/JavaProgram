



import java.util.Scanner;

public class NextGreatestElement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[7];

        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Next Greatest Elements:");
        for (int i = 0; i < a.length; i++)
        {
            int nextGreater = -1; // Default to -1 if no greater element is found
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[j] > a[i])
                {
                    nextGreater = a[j];
                    break;
                }
            }
            System.out.println("Next greatest element for " + a[i] + " is: " + nextGreater);
        }
    }
}
