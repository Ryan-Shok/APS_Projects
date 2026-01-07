import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int overflow = 0;
        if (end != 2147483647)
        {
            overflow = 1;
        }

        int max = (int)Math.sqrt(end) + overflow;

        BitSet notprime = new BitSet(max);
        BitSet range = new BitSet(end - start + 1);

        notprime.set(0, true);
        notprime.set(1, true);
        

        for (int i = 2; i < max; i++)
        {
            if (notprime.get(i) == false)
            {

                int increment = i;
                for (int j = i * i; j < max; j += increment)
                {
                    if (j >= start)
                    {
                        notprime.set(j, true);
                        range.set(j - start, true);
                    }
                    else
                    {
                        notprime.set(j, true);
                    }
                }
                int aboveStart = ((start + i - 1)/i) * i;
                for (int j = aboveStart; j < end + overflow; j += increment)
                {
                    if (j < 0)
                    {
                        break;
                    }
                    else if (j < max)
                    {
                        continue;
                    }
                    range.set(j - start, true);
                }
            }
        }
        if (start == 1)
        {
            range.set(0, true);
        }
        int currMax = 0;
        int currMin = 1000001;
        int currMinEnd = -1;
        int currMaxEnd = -1;
        int prev = -1;
        for (int i = 0; i < end - start + 1; i++)
        {
            if (range.get(i) == false)
            {
                if (i - prev < currMin && prev != -1)
                {
                    currMin = i - prev;
                    currMinEnd = i;
                }
                if (i - prev > currMax && prev != -1)
                {
                    currMax = i - prev;
                    currMaxEnd = i;
                }
                prev = i;
            }
        }
        if (currMinEnd != -1 && currMaxEnd != -1)
        {
            int minStart = 0;
            int minEnd = 0;
            int maxStart = 0;
            int maxEnd = 0;
            minEnd = currMinEnd + start;
            minStart = minEnd - currMin;
            maxEnd = currMaxEnd + start;
            maxStart = maxEnd - currMax;

            System.out.println(minStart + " " + minEnd + " " + maxStart + " " + maxEnd);
        }
        else
        {
            System.out.println(-1);
        }
    }
}
