import java.util.*;
public class Main
{
    public static String end;
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        end = scanner.nextLine();
        int length = end.length();
        System.out.println("[");
        if (length != 0 && length == start.length())
        {
            combos(length, length, start, "", "", "");
        }
        System.out.println("]");

    }

    public static void combos (int icount, int ocount, String start, String stack, String currWord, String sequence)
    {
        if (icount == 0 && ocount == 0)
        {
            if (currWord.equals(end))
            {
                System.out.println(sequence.substring(0, sequence.length() - 1));
            }
        }

        if (icount != 0)
        {
            combos(icount - 1, ocount, start.substring(1, start.length()), stack + start.charAt(0), currWord, sequence + "i ");
        }
        if (icount != ocount && ocount != 0)
        {
            combos(icount, ocount - 1, start, stack.substring(0, stack.length() - 1), currWord + stack.charAt(stack.length() - 1), sequence + "o ");
        }
    }

    
}

