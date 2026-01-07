import java.util.*;


public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String instruct = scanner.nextLine();
        int length = Integer.parseInt(scanner.nextLine());

        String[] code = new String[length];

        code = scanner.nextLine().split(",");
        if (length != 0)
        {
            code[0] = code[0].substring(1, code[0].length());
            code[length - 1] = code[length - 1].substring(0, code[length - 1].length() - 1);
        }
        
        int pointerOne = 0;
        int pointerTwo = length - 1;
        boolean front = true;

        int instructionCount = instruct.length();
        boolean success = true;
        for (int i = 0; i < instructionCount; i++)
        {
            if (instruct.substring(i, i + 1).equals("R"))
            {
                front = !front;
            }
            else if (instruct.substring(i, i + 1).equals("D"))
            {
                if (length == 0)
                {
                    success = false;
                    System.out.println("error");
                    break;
                }
                if (front)
                {
                    pointerOne += 1;
                }
                else
                {
                    pointerTwo -= 1;
                }
                length -= 1;
            }

        }

        if (success)
        {
            System.out.print("[");
            if (front)
            {
                int i;
                for (i = pointerOne; i < pointerTwo; i++)
                {
                    System.out.print(code[i] + ",");
                }
                if (i == pointerTwo)
                {
                    System.out.print(code[i]);
                }
            }
            else
            {
                int i;
                for (i = pointerTwo; i > pointerOne; i--)
                {
                    System.out.print(code[i] + ",");
                }
                if (pointerOne == i)
                {
                    System.out.print(code[i]);
                }
            }
            System.out.println("]");
        }
    }
}
