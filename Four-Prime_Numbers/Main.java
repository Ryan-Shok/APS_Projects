import java.util.*;

public class Main
{
    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);
        int end = scanner.nextInt();
        int max = (int)(end/30) + 1;

        BitSet notprime = new BitSet(max);

        notprime.set(0, true);
        notprime.set(1, true);
        LinkedList<Integer> primes = new LinkedList<Integer>();

        for (int i = 2; i < max; i++)
        {
            if (notprime.get(i) == false)
            {
                primes.add(i);
                int increment = i;
                for (int j = i * i; j < max; j += increment)
                {
                    if (j < 0)
                    {
                        break;
                    }
                    notprime.set(j, true);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < primes.size(); i++) 
        {
            long primeone = primes.get(i);
            if (primeone * primeone * primeone * primeone > end)
            {
                break;
            } 
            for (int j = i + 1; j < primes.size(); j++) 
            {
                long primetwo = primes.get(j);
                if (primeone * primetwo * primetwo * primetwo > end) 
                {
                    break;
                }
                for (int k = j + 1; k < primes.size(); k++) 
                {
                    long primethree = primes.get(k);
                    if (primeone * primetwo * primethree * primethree > end) 
                    {
                        break;
                    }

                    for (int l = k + 1; l < primes.size(); l++) 
                    {
                        long primefour = primes.get(l);

                        if (primeone * primetwo * primethree * primefour > end) 
                        {
                            break;
                        }
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
