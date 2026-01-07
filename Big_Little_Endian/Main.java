import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int swap = 0;

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if ((num & (1<<(i*8 + j))) != 0)
                {
                    swap |= (1 << ((3 - i) * 8 + j));
                }
            }
        }
        System.out.print(num + " converts to " + swap);
    }
}
