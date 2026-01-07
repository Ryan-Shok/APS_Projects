import java.util.*;
import java.lang.*;


public class Main
{

    public static void main(String args[])
    {


        Scanner input = new Scanner(System.in);
        int sum = input.nextInt();
        int numCoins = input.nextInt();
        int[] coins = new int[numCoins];

        int max = 0;
        for (int i = 0; i < numCoins; i++)
        {
            coins[i] = input.nextInt();
            max += coins[i];
        }

        int[] mins = new int[max + 1];
        mins[0] = 0;
        for (int i = 1; i < max + 1; i++)
        {
            mins[i] = 200;
        }

        for (int i = 0; i < coins.length; i++)
        {
            int currCoin = coins[i];
            for (int j = max; j >= currCoin; j--)
            {
                mins[j] = Math.min(mins[j], mins[j - currCoin] + 1);
            }
        }

        for (int i = sum; i <= max; i++)
        {
            if (mins[i] < 200)
            {
                System.out.println(i + " " + mins[i]);
                break;
            }
        }
    }

}
