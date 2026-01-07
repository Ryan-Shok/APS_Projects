import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        TreeSet<String> dictionary = new TreeSet<String>();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            String temp = scanner.next().toLowerCase();
            StringBuilder word = new StringBuilder("");
            for (int i = 0; i < temp.length(); i++)
            {
                if (temp.charAt(i) < 123 && temp.charAt(i) > 96)
                {
                    word.append(temp.charAt(i));
                } 
                else if (word.length() != 0)
                {
                    dictionary.add(word.toString());
                    word.setLength(0);
                }
            }
            if (word.length() != 0)
            {
                dictionary.add(word.toString());
            }
        }
        int size = dictionary.size();
        for (int i = 0; i < size; i++)
        {
            System.out.println(dictionary.pollFirst());
        }

    }
}
