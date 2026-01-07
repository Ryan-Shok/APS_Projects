import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int fixeds = scanner.nextInt();
        int repeats = scanner.nextInt();
        BitSet schedule = new BitSet(1000001);

        boolean conflict = false;

        for (int i = 0; i < fixeds; i++)
        {
            int currTaskStart = scanner.nextInt();
            int currTaskEnd = scanner.nextInt();
            for (int j = currTaskStart + 1; j < currTaskEnd; j++)
            {
                if (schedule.get(j) == false)
                {
                    schedule.set(j, true);
                }
                else
                {
                    conflict = true;
                    break;
                }
            }
            if (conflict)
            {
                break;
            }
        }
        if (!conflict)
        {
            for (int i = 0; i < repeats; i++)
            {
                int currTaskStart = scanner.nextInt();
                int currTaskEnd = scanner.nextInt();
                int length = currTaskEnd - currTaskStart + 1;
                int currTaskInt = scanner.nextInt();
                for (int j = currTaskStart; j < 1000001 - length; j += currTaskInt)
                {
                    if (schedule.get(j, j + length).isEmpty())
                    {
                        schedule.set(j, j + length, true);
                    }
                    else
                    {
                        conflict = true;
                        break;
                    }
                    
                }
                if (conflict)
                {
                    break;
                }
            }
        }

        if (!conflict)
        {
            System.out.println("NO CONFLICT");
        }
        else
        {
            System.out.println("CONFLICT");
        }

    }
}
