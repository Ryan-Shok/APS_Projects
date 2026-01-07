import java.util.*;
import java.lang.*;
import java.math.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int ones = scanner.nextInt();
        int zeros = scanner.nextInt();
        StringBuilder sequence = new StringBuilder();


        while (ones > 1 && zeros > 0)
        {
            sequence.append("101");
            ones -= 2;
            zeros--;
        }

        if (ones >= 1 && zeros == 0)
        {
            while (ones != 0)
            {
                sequence.append("1");
                ones--;
            }   
        }
        else if (ones == 1 & zeros >= 1)
        {
            sequence.insert(0, "1");
            ones--;
        }

        sequence.insert(0, "0");

        System.out.println(new BigInteger(sequence.toString(), 2));


    }
}
