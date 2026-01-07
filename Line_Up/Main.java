import java.util.*;
import java.awt.*;
public class Main
{
    public static Point[] djset;
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int groups = scanner.nextInt();

        HashMap<Integer, Integer> groupMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < groups; i++)
        {
            int currGroupSize = scanner.nextInt();
            for (int j = 0; j < currGroupSize; j++)
            {
                int currIndex = scanner.nextInt();
                groupMap.put(currIndex, i);
            }
        }
        @SuppressWarnings("unchecked")
        LinkedList<Integer>[] queues = (LinkedList<Integer>[]) new LinkedList[groups];
        LinkedList<Integer> queueOrder = new LinkedList<Integer>();
        for (int i = 0; i < queues.length; i++) 
        {
            queues[i] = new LinkedList<Integer>();
        }

        while (scanner.hasNext())
        {
            String command = scanner.next();
            if (command.equals("Push"))
            {
                int index = scanner.nextInt();
                int groupId = groupMap.get(index);
                if (queues[groupId].isEmpty())
                {
                    queueOrder.add(groupId);
                }
                queues[groupId].add(index);
            }
            else if (command.equals("Pop"))
            {
                int currGroupId = queueOrder.peek();
                if (queues[currGroupId].size() == 1)
                {
                    queueOrder.remove();
                }
                int currIndex = queues[currGroupId].remove();
                System.out.println(currIndex);
            }
            else if (command.equals("Shutdown"))
            {
                break;
            }   
        }        

    }

}
