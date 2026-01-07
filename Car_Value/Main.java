import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] loan = line.split(" ");
        int dur = Integer.parseInt(loan[0]);
        double down = Double.parseDouble(loan[1]);
        double amount = Double.parseDouble(loan[2]);
        double totalOwe = amount;
        double totalValue = amount + down;
        double monPay = amount/dur;
        int depRec = Integer.parseInt(loan[3]);
        double depPer[] = new double[depRec];
        int depMon[] = new int[depRec];
        for (int i = 0; i < depRec; i++)
        {
            String lineTwo = scanner.nextLine();
            String[] dep = lineTwo.split(" ");
            depMon[i] = Integer.parseInt(dep[0]);
            depPer[i] = Double.parseDouble(dep[1]);
        }

        int curr = 0;
        double currDepPer = depPer[0];
        int endMon = 0;
        for (int i = 0; i < dur + 1; i++)
        {
            if (i != 0)
            {
                totalOwe -= monPay;
            }
            
            //System.out.println(curr);

            if (i == depMon[curr])
            {
                currDepPer = depPer[curr];
                if (curr + 1 < depPer.length)
                {
                    curr++;
                }
            }
            totalValue *= (1 - currDepPer);

            //System.out.println(i);
            //System.out.println(totalOwe);
            //System.out.println(totalValue);

            if (totalOwe < totalValue)
            {
                endMon = i;
                break;
            }
        }
        if (endMon == 1)
        {
            System.out.println("1 month");
        }
        else
        {
            System.out.println(endMon + " months");
        }

    }
}
