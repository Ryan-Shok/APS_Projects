import java.util.*;
import java.lang.*;


public class Main
{

    public static void main(String args[])
    {


        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        long[] arr = new long[size];

        for (int i = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }
        long[] maxs = new long[size];
        for (int i = 0; i < size; i++)
        {
            if (i == 0)
            {
                maxs[i] = arr[i];
            }
            else
            {
                maxs[i] = Math.max(maxs[i - 1] + arr[i], arr[i]);
            }      
        }

        long max = Long.MIN_VALUE;
        for (int i = 0; i < size; i++)
        {
            if (maxs[i] > max)
            {
                max = maxs[i];
            }
        }
        System.out.println(max);

    }

}
