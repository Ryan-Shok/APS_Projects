import java.util.*;
import java.lang.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String[] instructions = scanner.nextLine().split(" "); 
        String currRot = "+x";
        for (int i = 0; i < instructions.length; i++)
        {
            if (instructions[i].equals("No"))
            {
                continue;
            }
            
            if (currRot.equals("+x"))
            {
                currRot = instructions[i];
            }
            else if (currRot.equals("-x"))
            {
                if (instructions[i].charAt(0) == '+')
                {
                    currRot = "-" + instructions[i].charAt(1);
                }
                else
                {
                    currRot = "+" + instructions[i].charAt(1);
                }
            }
            else if (currRot.equals("+y"))
            {
                if (instructions[i].charAt(1) == 'z')
                {
                    continue;
                }
                else
                {
                    if (instructions[i].charAt(0) == '+')
                    {
                        currRot = "-x";
                    }
                    else
                    {
                        currRot = "+x";
                    }
                }
            }
            else if (currRot.equals("-y"))
            {
                if (instructions[i].charAt(1) == 'z')
                {
                    continue;
                }
                else
                {
                    if (instructions[i].charAt(0) == '+')
                    {
                        currRot = "+x";
                    }
                    else
                    {
                        currRot = "-x";
                    }
                }
            }
            else if (currRot.equals("+z"))
            {
                if (instructions[i].charAt(1) == 'y')
                {
                    continue;
                }
                else
                {
                    if (instructions[i].charAt(0) == '+')
                    {
                        currRot = "-x";
                    }
                    else
                    {
                        currRot = "+x";
                    }
                }
            }
            else if (currRot.equals("-z"))
            {
                if (instructions[i].charAt(1) == 'y')
                {
                    continue;
                }
                else
                {
                    if (instructions[i].charAt(0) == '+')
                    {
                        currRot = "+x";
                    }
                    else
                    {
                        currRot = "-x";
                    }
                }
            }
        }  
        System.out.print(currRot); 
    }
}
