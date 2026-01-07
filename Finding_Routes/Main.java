import java.util.*;
public class Main
{
    static int[][] adjacency;
    static int target;
    static int total = 0;
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        adjacency = new int[21][21];

        target = scanner.nextInt();
        while (true)
        {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            if (first == 0)
            {
                break;
            }
            adjacency[first][second] = 1;
            adjacency[second][first] = 1;
        }

        BitSet bits = new BitSet(21);
        bits.set(1);
        recAdd(1, "1", bits);
        System.out.print("There are " + total + " routes from the initial position to corner " + target + ".");
    }

    public static void recAdd(int currNode, String combo, BitSet visited)
    {
        if (currNode == target)
        {
            total += 1;
            System.out.println(combo);
        }
        for (int i = 1; i < 21; i++)
        {
            if (adjacency[currNode][i] == 1 && !visited.get(i))
            {
                BitSet newBits = (BitSet)visited.clone();
                newBits.set(i);
                String dup = combo + " " + i;
                recAdd(i, dup, newBits);
            }
        }
        return;
    }
}
