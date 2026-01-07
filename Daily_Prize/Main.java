import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        PriorityQueue<Integer> min = new PriorityQueue<Integer>();
        PriorityQueue<Integer> max = new PriorityQueue<Integer>(Collections.reverseOrder());

        int total = 0;
        for (int i = 0; i < days; i++)
        {
            int forms = scanner.nextInt();
            for (int j = 0; j < forms; j++)
            {
                int curr = scanner.nextInt();
                min.add(curr);
                max.add(curr);
            }
            int top = max.poll();
            int bottom = min.poll();
            total += (top - bottom);
            min.remove(top);
            max.remove(bottom);

        }
        System.out.println(total);
    }
}
