import java.util.*;

public class Main
{

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        PriorityQueue<Integer> priQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

        int count = input.nextInt();
        int position = input.nextInt();
        input.nextLine();
        
        LinkedList<Integer> jobs = new LinkedList<Integer>();

        for (int i = 0; i < count; i++)
        {
            int curr = input.nextInt();
            priQueue.add(curr);
            jobs.add(curr); 
        }
        int priority = jobs.get(position);

        for (int i = 0; i < priQueue.size(); i++)
        {
            if (i == position)
            {
                if (priQueue.peek() == priority)
                {
                    break;
                }
                else if (priQueue.peek() > priority)
                {
                    jobs.poll();
                    i--;
                    jobs.add(priority);
                    position = jobs.size() - 1;
                }
            }
            else if (priQueue.peek() > jobs.get(i))
            {
                int curr = jobs.poll();
                i--;
                position--;
                jobs.add(curr);
            }
            else if (priQueue.peek() == jobs.get(i))
            {
                priQueue.poll();
                jobs.poll();
                i--;
                position--;
            }
        }
        System.out.println(count - priQueue.size() + 1);
    }
}
