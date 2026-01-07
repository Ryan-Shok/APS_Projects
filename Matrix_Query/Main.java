import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] matrix = new int[N][M];

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int queries = scanner.nextInt();
        for (int j = 0; j < queries; j++)
        {
            int P = scanner.nextInt();
            int Q = scanner.nextInt();
            int max = 0;

            for (int i = 0; i < N; i++)
            {
                int startCol = binarySearch(matrix[i], P);
                int sideLength = max;
                while (i + sideLength < N && startCol + sideLength < M && matrix[i + sideLength][startCol + sideLength] <= Q) 
                {
                    sideLength++;
                }

                if (sideLength > max)
                {
                    max = sideLength;
                }
            }
            System.out.println(max);
        }
    }

    public static int binarySearch(int[] arr, int min)
    {
        int left = 0;
        int right = arr.length;
        while (left < right) 
        {
            int mid = (left + right)/2;
            if (arr[mid] < min) 
            {
                left = mid + 1;
            }
            else
            {
                right = mid;
            } 
        }
        return left;
    }
}
