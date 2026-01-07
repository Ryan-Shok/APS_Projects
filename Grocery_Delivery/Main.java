import java.util.*;
public class Main
{
    public static int[] items;
    public static int maxIndex;
    public static int maxString = Integer.MIN_VALUE;
    public static String max = "";
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int W = scanner.nextInt();
        items = new int[N];

        int sum = 0;
        maxIndex = -1;
        for (int i = 0; i < N; i++)
        {
            int curr = scanner.nextInt();
            sum += curr;
            if (sum > W * 2 || curr > W)
            {
                break;
            }
            items[i] = curr;
            maxIndex = i;
        }
        
        recFit(0, W, W, "");

        System.out.println(maxString);
        for (int i = 0; i < maxString; i++)
        {
            if (max.charAt(i) == '1')
            {
                System.out.println("1st");
            }
            else if (max.charAt(i) == '2')
            {
                System.out.println("2nd");
            }
        }
    }

    public static void recFit(int item, int capacityOne, int capacityTwo, String currAssignment)
    {
        if (item > maxIndex)
        {
            if (currAssignment.length() > maxString)
            {
                maxString = currAssignment.length();
                max = currAssignment;
            }
            return;
        }
        if (items[item] <= capacityOne)
        {
            recFit(item + 1, capacityOne - items[item], capacityTwo, currAssignment + "1");
        }

        if (items[item] <= capacityTwo)
        {
            recFit(item + 1, capacityOne, capacityTwo - items[item], currAssignment + "2");
        }
        
        if (currAssignment.length() > maxString)
        {
            maxString = currAssignment.length();
            max = currAssignment;
        }
    }
}
