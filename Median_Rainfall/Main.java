import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        int median = 0;
        while (scanner.hasNextInt())
        {
            int curr = scanner.nextInt();

            if (minHeap.size() == 0 && maxHeap.size() == 0)
            {
                maxHeap.add(curr);
            }
            else if (curr > median)
            {
                minHeap.add(curr);
            }
            else if (curr <= median)
            {
                maxHeap.add(curr);
            }

            if (minHeap.size() - maxHeap.size() == 2)
            {
                maxHeap.add(minHeap.poll());
            }
            else if (maxHeap.size() - minHeap.size() == 2)
            {
                minHeap.add(maxHeap.poll());
            }

            if ((minHeap.size() + maxHeap.size()) % 2 == 0)
            {
                median = (maxHeap.peek() + minHeap.peek())/2;
                System.out.println(median);
                
            }
            else
            {
                if (maxHeap.size() > minHeap.size())
                {
                    median = maxHeap.peek();
                    System.out.println(median);
                }
                else
                {
                    median = minHeap.peek();
                    System.out.println(median);
                }
            }
        }
    }
}
