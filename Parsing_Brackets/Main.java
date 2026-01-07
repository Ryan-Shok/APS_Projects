import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<Character>();
        String input = scanner.nextLine();
        int size = input.length();
        int j = 1;
        boolean isBadEquation = false;
        for (int i = 0; i < size; i++)
        {
            if (input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '[')
            {
                stack.push(input.charAt(i));
            }
            else if (input.charAt(i) == ')' || input.charAt(i) == '}' || input.charAt(i) == ']')
            {
                if (stack.isEmpty())
                {
                    isBadEquation = true;
                    break;
                }
                else if(stack.peek() == '(' && input.charAt(i) != ')' 
                        || stack.peek() == '{' && input.charAt(i) != '}'
                        || stack.peek() == '[' && input.charAt(i) != ']')
                {
                    isBadEquation = true;
                    break;
                } 
                else 
                {
                    stack.pop();
                }
            }
            j++;
        }
        if (!isBadEquation && stack.size() != 0)
        {
            isBadEquation = true;
        }
        
        if(isBadEquation){
            System.out.println("NO " + j);
        } else {
            System.out.println("YES");
        }
    }
}
