import java.util.*;
import java.lang.*;
public class Main
{
    public static void main(String args[])
    {
        boolean perfect = false;
        Scanner scanner = new Scanner(System.in);
        long input = Long.parseLong(scanner.nextLine());
        long sum = 0;
        if (input != 1)
        {
            for (long i = 1; i <= Math.sqrt(input); i++)
            {
                if (input % i == 0)
                {
                    sum += i;
                    sum += input/i;
                }
            }
            sum -= input;
            if (sum == input)
            {
                perfect = true;
            }
        }
        if (perfect)
        {
            System.out.println("PERFECT");
        }
        else
        {
            System.out.println("NOT PERFECT");
        }

    }
}
