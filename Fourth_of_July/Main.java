import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        boolean is = familyCheck(number, 0);

        if (is)
        {
            System.out.println("July Fourth Family Number");
        }
        else
        {
            System.out.println("Not in the family");
        }
    }

    public static boolean familyCheck(long number, long divisor)
    {
        if (divisor > number)
        {
            return false;
        }
        else if (divisor != 0 && number % divisor == 0)
        {
            return true;
        }
        else
        {
            return (familyCheck(number, divisor * 10 + 4) || familyCheck(number, divisor * 10 + 7));
        }  
    }
}
