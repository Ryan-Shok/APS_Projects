import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int pair = Integer.parseInt(scanner.nextLine());

        int max = (int)Math.sqrt(20000000); // = 4472
        max -= 3; // = 4469
        max = (int)(max/2); // 2234
        max += 1; // 2235

        BitSet notprime = new BitSet(10000000);

        int foundpair = 0;

        for (int i = 0; i < max; i++)
        {
            if (notprime.get(i) == false)
            {
                if (i != 0 && notprime.get(i - 1) == false)
                {
                    pair -= 1;
                }
                if (pair == 0)
                {
                    foundpair = i;
                    break;
                }

                int increment = 3 + i * 2;
                for (int j = i + increment; j < 10000000; j += increment)
                {
                    notprime.set(j, true);
                }
            }
        }
        if (foundpair == 0)
        {
            for (int i = 2235; i < 10000000; i++)
            {
                if (notprime.get(i - 1) == false && notprime.get(i) == false)
                {
                    pair -= 1;
                }
                if (pair == 0)
                {
                    foundpair = i;
                    break;
                }
            }
        }

        int numTwo = (foundpair * 2) + 3;
        int numOne = numTwo - 2;
        System.out.println("(" + numOne + ", " + numTwo + ")");
    }
}
