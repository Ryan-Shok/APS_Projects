import java.util.*;
import java.awt.*;
public class Main
{
    public static Point[] djset;
    public static int[] replacers;
    public static int currOpen;
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        djset = new Point[N + M];
        replacers = new int[N];
        currOpen = N + 1;

        for (int i = 0; i < N; i++)
        { 
            djset[i] = new Point(-1, i + 1);
            replacers[i] = i + 1;
        }
        for (int i = 0; i < M; i++)
        {
            int currCommand = scanner.nextInt();
            if (currCommand == 1)
            {
                union(scanner.nextInt(), scanner.nextInt());
            }
            else if (currCommand == 2)
            {
                move(scanner.nextInt(), scanner.nextInt());
            }
            else
            {
                returny(scanner.nextInt());
            }
        }
        
    }

    public static int findRoot(int index)
    {
        if (djset[index - 1].x < 0)
        {
            return index;
        }
        else
        {
            return findRoot(djset[index - 1].x);
        }
    }
    public static void union (int indexOne, int indexTwo)
    {
        int rootOne = findRoot(replacers[indexOne - 1]) - 1;
        int rootTwo = findRoot(replacers[indexTwo - 1]) - 1;
        if (rootOne == rootTwo)
        {
            return;
        }

        int sizeOne = -1 * djset[rootOne].x;
        int sizeTwo = -1 * djset[rootTwo].x;
        int size = sizeOne + sizeTwo;

        if (sizeOne >= sizeTwo)
        {
            djset[rootOne].x = size * -1;
            djset[rootOne].y += djset[rootTwo].y;
            djset[rootTwo].x = rootOne + 1;
        }
        else if (sizeOne < sizeTwo)
        {
            djset[rootTwo].x = size * -1;
            djset[rootTwo].y += djset[rootOne].y;
            djset[rootOne].x = rootTwo + 1;
        }
    }

    public static void move (int indexOne, int indexTwo)
    {
        int rootOne = findRoot(replacers[indexOne - 1]) - 1;
        int rootTwo = findRoot(replacers[indexTwo - 1]) - 1;

        if (rootOne == rootTwo)
        {
            return;
        }

        djset[rootOne].x += 1;
        djset[rootOne].y -= indexOne;

        int newFake = currOpen;
        djset[newFake - 1] = new Point(rootTwo + 1, indexOne);
        replacers[indexOne - 1] = newFake;
        currOpen++;

        djset[rootTwo].x -= 1;
        djset[rootTwo].y += indexOne;

    }

    public static void returny (int index)
    {
        int root = findRoot(replacers[index - 1]) - 1;
        System.out.println((djset[root].x * -1) + " " + djset[root].y);
    }

}
