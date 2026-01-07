import java.util.*;
import java.awt.*;
public class Main
{
    public static int[] djset;
    public static Point[] points;
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        djset = new int[N];
        points = new Point[N];
        double D = scanner.nextDouble();

        for (int i = 0; i < N; i++)
        {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            djset[i] = -1;
            Point temp = new Point();
            temp.setLocation(x, y);
            points[i] = temp;


        }
        for (int i = 0; i < N; i++)
        {
            for (int j = i; j < N; j++)
            {
                if (points[i].distance(points[j]) <= D)
                {
                    combine(i, j);
                }
            }
        } 
        int groups = 0;
        for (int i = 0; i < N; i++)
        {
            if (djset[i] < 0)
            {
                groups++;
            }
        }
        System.out.print(groups);    
    }

    public static int findRoot(int index)
    {
        if (djset[index] < 0)
        {
            return index;
        }
        else
        {
            return findRoot(djset[index]);
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

        int sizeOne = -1 * djset[rootOne];
        int sizeTwo = -1 * djset[rootTwo];
        int size = sizeOne + sizeTwo;

        if (sizeOne >= sizeTwo)
        {
            djset[rootOne] = size * -1;
            djset[rootTwo] = rootOne;
        }
        else if (sizeOne < sizeTwo)
        {
            djset[rootTwo] = size * -1;
            djset[rootOne] = rootTwo;
        }
    }
}

