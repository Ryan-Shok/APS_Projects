import java.util.*;
import java.lang.*;


public class Main
{
    public static int finalLength;

    public static void main(String args[])
    {


        Scanner input = new Scanner(System.in);
        int spaces = input.nextInt();
        finalLength = spaces;
        int ones = input.nextInt();
        int zeros = spaces - ones;
        StringBuilder combination = new StringBuilder();

        recCombine(ones, zeros, combination);
    }

    public static void recCombine(int ones, int zeros, StringBuilder combine)
    {
        if (combine.length() == finalLength)
        {
            System.out.println(combine);
            return;
        }
        if (zeros != 0)
        {
            StringBuilder combination = new StringBuilder(combine.toString());
            recCombine(ones, zeros - 1, combination.append(0));
        }
        if (ones != 0)
        {
            StringBuilder combination = new StringBuilder(combine.toString());
            recCombine(ones - 1, zeros, combination.append(1));
        }
    }
}
