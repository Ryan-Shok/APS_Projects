import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
        { 
            arr[i] = scanner.nextInt();
        }
        long minSwaps = mergeSort(arr, 0, N - 1);
        System.out.println(minSwaps);

    }
    static long merge(int arr[], int left, int mid, int right)
    {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        int leftArr[] = new int[leftSize];
        int rightArr[] = new int[rightSize];

        for (int i = 0; i < leftSize; i++)
        {
            leftArr[i] = arr[left + i];
        }
        for (int i = 0; i < rightSize; i++)
        {
            rightArr[i] = arr[mid + 1 + i];
        }

        int i = 0; 
        int j = 0;
        long inversionCount = 0;
        int combinePoint = left;

        while (i < leftSize && j < rightSize) 
        {
            if (leftArr[i] <= rightArr[j]) 
            {
                arr[combinePoint] = leftArr[i];
                i++;
            }
            else 
            {
                arr[combinePoint] = rightArr[j];
                j++;
                inversionCount += (leftSize - i);

            }
            combinePoint++;
        }

        while (i < leftSize) 
        {
            arr[combinePoint] = leftArr[i];
            i++;
            combinePoint++;
        }

        while (j < rightSize) 
        {
            arr[combinePoint] = rightArr[j];
            j++;
            combinePoint++;
        }

        return inversionCount;
    }

    static long mergeSort(int arr[], int left, int right)
    {
        long inversionCount = 0;
        if (left < right) 
        {
            int mid = left + (right - left) / 2;

            inversionCount += mergeSort(arr, left, mid);
            inversionCount += mergeSort(arr, mid + 1, right);
            inversionCount += merge(arr, left, mid, right);
        }
        return inversionCount;
    }
}
