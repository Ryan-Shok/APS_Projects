import java.util.*;
import java.awt.*;
public class Main
{
    public static Point[] djset;
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        djset = new Point[N];
        int M = scanner.nextInt();

        for (int i = 0; i < N; i++)
        {
            
            int currOwe = scanner.nextInt();
            djset[i] = new Point(-1, currOwe);
        }
        for (int i = 0; i < M; i++)
        {
            int friendOne = scanner.nextInt();
            int friendTwo = scanner.nextInt();
            combine(friendOne, friendTwo);
        }
        boolean possible = true;
        for (int i = 0; i < N; i++)
        {
            if (djset[i].x < 0 && djset[i].y != 0)
            {
                possible = false;
                break;
            }
        }
        if (possible)
        {
            System.out.println("POSSIBLE");
        }
        else
        {
            System.out.println("IMPOSSIBLE");
        }
        
    }

    public static int findRoot(int index)
    {
        if (djset[index].x < 0)
        {
            return index;
        }
        else
        {
            return findRoot(djset[index].x);
        }
    }
    public static void combine(int indexOne, int indexTwo)
    {
        int rootOne = findRoot(indexOne);
        int rootTwo = findRoot(indexTwo);
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
            djset[rootTwo].x = rootOne;
        }
        else if (sizeOne < sizeTwo)
        {
            djset[rootTwo].x = size * -1;
            djset[rootTwo].y += djset[rootOne].y;
            djset[rootOne].x = rootTwo;
        }
    }
}
