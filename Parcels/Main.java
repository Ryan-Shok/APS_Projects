import java.util.*;
import java.lang.*;


public class Main
{

    public static void main(String args[])
    {


        Scanner input = new Scanner(System.in);
        int one = input.nextInt();
        int two = input.nextInt();
        int three = input.nextInt();
        int four = input.nextInt();
        int five = input.nextInt();
        int six = input.nextInt();

        int packCount = 0;

        packCount += six;
        six = 0;
        packCount += five;
        
        one = one - 11 * five;
        five = 0;
        if (one < 0)
        {
            one = 0;
        }
        
        packCount += four;
        two = two - 5 * four;
        if (two < 0)
        {
            one += two * 4;
        }
        four = 0;

        packCount += three/4;
        three = three - (three/4) * 4;
        if (one < 0)
        {
            one = 0;
        }
        if (two < 0)
        {
            two = 0;
        }

        if (three == 1)
        {
            if (two > 0)
            {
                two -= 5;
                if (two < 0)
                {
                    one += -7 + two * 4;
                }
                one -= 7;
            }
            packCount++;
        }
        else if (three == 2)
        {
            if (two > 0)
            {
                two -= 3;
                if (two < 0)
                {
                    one += -6 + two * 4;
                }
            }
            else
            {
                one -= 18;
            }
            packCount++;
        }
        else if (three == 3)
        {
            if (two > 0)
            {
                two -= 1;
                one -= 5;
            }
            else
            {
                one -= 9;
            }
            packCount++;
        }

        if (one < 0)
        {
            one = 0;
        }
        if (two < 0)
        {
            two = 0;
        }

        if (two > 0)
        {
            packCount += two/9;
            two = two - (two/9) * 9;
        }
        if (two > 0)
        {
            one += (two - 9) * 4;
            packCount++;
            two = 0;
        }
        if (one < 0)
        {
            one = 0;
        }
        packCount += one/36;
        one = one - (one/36) * 36;
        if (one > 0)
        {
            packCount++;
        }
        System.out.println(packCount);
    }

}
