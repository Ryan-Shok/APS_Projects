import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int a = 0;
        int b = 0;

        boolean odd = true;
        for (int i = 0; i < 31; i++)
        {
            if ((num & (1<<i)) > 0)
            {
                if (odd)
                {
                    a |= (1 << i);
                    odd = false;
                }
                else
                {
                    b |= (1 << i);
                    odd = true;
                }
            }
        }
        System.out.println(a + " " + b);
    }
}
