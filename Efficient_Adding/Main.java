import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        PriorityQueue<Long> priQueue = new PriorityQueue<Long>();
        
        for (int i = 0; i < N; i++)
        {
            priQueue.add(scanner.nextLong());
        }
        long cumSum = 0;
        for (int i = 0; i < N; i++)
        {
            if (priQueue.size() == 1)
            {
                break;
            }
            long curr = priQueue.poll() + priQueue.poll();
            priQueue.add(curr);
            cumSum += curr;
        }
        System.out.println(cumSum);
    }
}
