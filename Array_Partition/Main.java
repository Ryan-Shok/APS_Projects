import java.util.*;
public class Main
{
    static long[] arr;
    static int parts;
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        parts = scanner.nextInt();
        arr = new long[count];

        long sum = 0;
        for (int i = 0; i < count; i++)
        {
            long curr = scanner.nextLong();
            arr[i] = curr;
            sum += curr;
        }

        long max = sum;
        long min = 0;
        long mid = 0;
        while (min < max)
        {
            mid = (max + min)/2;
            if (partition(mid))
            {
                max = mid;
            }
            else
            {
                min = mid + 1;
            }
        }
        mid = (max + min)/2;
        System.out.println(mid);
    }

    public static boolean partition(long value)
    {
        int tempParts = 1;
        long currSum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > value)
            {
                return false;
            }
            if (currSum + arr[i] > value)
            {
                tempParts++;
                currSum = 0;
                currSum += arr[i];
            }
            else
            {
                currSum += arr[i];
            }    
        }
        if (tempParts > parts)
        {
            return false;
        }
        else
        {
            return true;
        }
    } 
}
