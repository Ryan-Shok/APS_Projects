import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] gaps = new int[count];

        int prev = 0;
        for (int i = 0; i < count; i++)
        {
            int temp = scanner.nextInt();
            gaps[i] = temp - prev;
            prev = temp;
        }


        int max = 0;
        int currRocketPow = 0;
        for (int i = 0; i < count; i++)
        {
            if (gaps[i] > max)
            {
                max = gaps[i];
                currRocketPow = max;
                currRocketPow--;
            }
            else if (gaps[i] == currRocketPow)
            {
                currRocketPow--;
            }
            else if (gaps[i] > currRocketPow)
            {
                max++;
                currRocketPow = max;
            }
        }
        System.out.println(max);
    }
}
