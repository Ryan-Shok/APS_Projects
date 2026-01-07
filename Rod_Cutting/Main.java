import java.util.*;

public class Main
{
    public static int[][] costs;
    public static int[] cuts;
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int l = scanner.nextInt();
        int cutNum = scanner.nextInt();
        cuts = new int[cutNum + 2];
        cuts[0] = 0;
        cuts[cutNum + 1] = l;
        for (int i = 1; i < cutNum + 1; i++)
        {
            cuts[i] = scanner.nextInt();
        }

        costs = new int[cutNum + 2][cutNum + 2];

        System.out.println(recCut(0, cutNum + 1));
        
    }

    public static int recCut(int start, int end)
    {
        if (end - start <= 1)
        {
            return 0;
        }
        else if (costs[start][end] != 0)
        {
            //System.out.println("start:" + start + "end:" + end);
            return costs[start][end];
        }
        else
        {
            int min = Integer.MAX_VALUE;
            for (int i = start + 1; i < end; i++)
            {
                int sum = recCut(start, i) + recCut(i, end) + cuts[end] - cuts[start];
                if (sum < min)
                {
                    min = sum;
                }
            }
            //System.out.println("start:" + start + "end:" + end);
            costs[start][end] = min;
            return min;
        }
    }
}
