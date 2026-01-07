import java.util.*;

public class Main
{

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Long> alerts = new PriorityQueue<Long>();
        HashMap<Long, Long> count = new HashMap<Long, Long>();

        while (scanner.hasNext())
        {
            String register = scanner.next();
            if (register.equals("#"))
            {
                break;
            }
            long id = scanner.nextLong();
            long interval = scanner.nextLong();
            count.put(id, interval);
            alerts.add(interval * 10000 + id);
        }
        long stopper = scanner.nextLong();
         

        for (int i = 0; i < stopper; i++)
        {
            long curr = alerts.poll();
            long currId = curr % 10000;
            long currInterval = curr - currId;
            System.out.println(currId);
            alerts.add(currInterval + count.get(currId) * 10000 + currId);
        }

    }
}
