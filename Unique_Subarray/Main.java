import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++)
        {
            numbers[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> unique = new HashMap<Integer, Integer>();
        int beginning = 0;
        int max = 0;
        for (int end = 0; end < count; end++) 
        {
            int currNumber = numbers[end];
            if (unique.containsKey(currNumber) && unique.get(currNumber) == 1)
            {
                while (numbers[beginning] != currNumber)
                {
                    unique.put(numbers[beginning], 0);
                    beginning++;
                }
                beginning++;
            }
            else
            {
                unique.put(currNumber, 1);
            }

            if (max < end - beginning + 1)
            {
                max = end - beginning + 1;
            }
        }

        System.out.println(max);
    }
}
