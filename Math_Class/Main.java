import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String[] numbers = new String[count];

        for (int i = 0; i < count; i++)
        {
            numbers[i] = scanner.next();
        }


        Arrays.sort(numbers, (x, y) -> (y + x).compareTo(x + y));

        StringBuilder finalNumber = new StringBuilder();
        for (int i = 0; i < count; i++) 
        {
            finalNumber.append(numbers[i]);
        }

        System.out.println(finalNumber);
    }
}
