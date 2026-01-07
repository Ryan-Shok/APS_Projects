import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int slots = M * 2;

        PriorityQueue<Integer> maxQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i = 0; i < N; i++)
        {
            int curr = scanner.nextInt();
            maxQueue.add(curr);
        }

        int[] nodes = new int[M];
        if (N <= M)
        {
            for (int i = 0; i < N; i++)
            {
                nodes[i] += maxQueue.poll();
            }
        }
        else
        {
            int over = N - M;
            for (int i = M - 1; i >= 0; i--)
            {
                nodes[i] += maxQueue.poll();
            }
            for (int i = 0; i < over; i++)
            {
                nodes[i] += maxQueue.poll();
            }
        } 
        double total = 0; 
        for (int i = 0; i < M; i++)
        {
            total += nodes[i];
        }    
        double average = total/M;
        
        double imbalance = 0;
        for (int i = 0; i < M; i++)
        {
            imbalance += Math.abs(average - nodes[i]);
        }

        System.out.printf("IMBALANCE = %.5f%n",imbalance);
    }
}
