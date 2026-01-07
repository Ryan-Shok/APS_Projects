import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int students = (int)Math.pow(2, scanner.nextInt());
        int missings = scanner.nextInt();
        BitSet all = new BitSet(students);
        all.flip(0, students);

        for (int i = 0; i < missings; i++)
        {
            int student = scanner.nextInt();
            all.set(student - 1, false);
        }

        int count = 0;
        int size = students;
        int loop = 1;
        while (size != 1)
        {
            int increment = (int)Math.pow(2, loop);
            for (int i = 0; i < size; i += increment)
            {
                
                if (all.get(i) ^ all.get(i + increment/2)) 
                {
                    count++;
                }
                all.set(i, all.get(i) | all.get(i + increment/2));
            }
            loop++;
            size /= 2;
        }

        System.out.print(count);
    }
}
