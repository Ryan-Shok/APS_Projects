import java.util.*;
import java.io.*;
public class Main
{

    public static void main(String args[])
    {
        int N = 0;
        String line = "";
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(reader.readLine());
            line = reader.readLine();
        }
        catch (Exception e)
        {
        }
              
        int[] counters = new int[101];
        int size = line.length();
        int num = 0;
        for (int i = 0; i < size; i++) 
        {
            char currChar = line.charAt(i);
            if (currChar == ' ') 
            {
                counters[num]++;
                num = 0;
            } 
            else 
            {
                num = num * 10 + (currChar - '0');
            }
        }
        counters[num]++;

        int counter = N;
        try
        {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
            for (int i = 0; i < 101; i++)
            {
                int currCount = counters[i];
                for (int j = 0; j < currCount; j++)
                {
                    counter--;
                    if (counter == 0)
                    {
                        writer.write(i + "\n");
                        break;
                    }
                    writer.write(i + " ");
                }
            }
            writer.flush();
        }
        catch (Exception e)
        {
        }  

    }
}
