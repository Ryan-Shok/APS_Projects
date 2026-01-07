import java.util.*;

public class Main
{

    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<Integer>();
        LinkedList<Integer> queue = new LinkedList<Integer>();
        PriorityQueue<Integer> priQueue = new PriorityQueue<Integer>();

        Scanner input = new Scanner(System.in);
        int operations = input.nextInt();
        input.nextLine();

        boolean isStack = true;
        boolean isQueue = true;
        boolean isPriQueue = true;

        for (int i = 0; i < operations; i++)
        {
            String[] line = input.nextLine().split(" ");
            int operation = Integer.parseInt(line[0]);
            int value = Integer.parseInt(line[1]);
            if (operation == 1)
            {
                stack.add(value);
                queue.add(value);
                priQueue.add(Math.abs(value - 100));
            }
            else if (operation == 2)
            {
                try
                {
                    if (stack.pop() != value)
                    {
                        isStack = false;
                    }
                    if (queue.poll() != value)
                    {
                        isQueue = false;
                    }
                    if ((priQueue.poll()*(-1) + 100) != value)
                    {
                        isPriQueue = false;
                    }
                }
                catch (Exception e)
                {
                    System.out.println("impossible");
                    System.exit(1);
                }
            }
        }

        if (!isStack && !isQueue && !isPriQueue)
        {
            System.out.println("impossible");
        }
        else if (isStack && !isQueue && !isPriQueue)
        {
            System.out.println("stack");
        }
        else if (!isStack && isQueue && !isPriQueue)
        {
            System.out.println("queue");
        }
        else if (!isStack && !isQueue && isPriQueue)
        {
            System.out.println("priority queue");
        }
        else
        {
            System.out.println("not sure");
        }

    }

}
