import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<Character>();
        String input = scanner.next();
        int size = input.length();
        for (int i = 0; i < size; i++)
        {
            if (input.charAt(i) == '<')
            {
                stack.pop();
            }
            else
            {
                stack.push(input.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.empty())
        {
            result.append(stack.pop());
        }
        result.reverse();
        System.out.print(result);
    }
}
