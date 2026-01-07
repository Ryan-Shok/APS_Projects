import java.util.*;
import java.lang.*;

public class Main
{
    public static int C;
    public static int M;
    public static int[][] price;
    //public static int[][] answer;
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        M = scanner.nextInt();
        C = scanner.nextInt();
        price = new int[C][20];
        for (int i = 0; i < C; i++)
        {
            int flavours = scanner.nextInt();
            for (int j = 0; j < flavours; j++)
            {
                price[i][j] = scanner.nextInt();
            }
        }
        //answer = new int[C][20];
        int finale = shop(M, 0);
        if (finale <= 0)
        {
            System.out.println("no solution");
        }
        else
        {
            System.out.println(finale);
        }
       
    }
    public static int shop(int m, int i)
    {
        if (m < 0) 
        {
            return -10000;
        } 
        if (i == C) 
        {
            return (M - m);
        }       
        /*if (answer[m][i] != -1) 
        {
            return answer[m][i];
        }*/   
        int best = -1;
        for (int g = 0; g < 20; g++)
        {
           if (price[i][g] == 0)
           {
                break;
           }
           best = Math.max(best, shop(m - price[i][g], i+1));
        }
            
        //answer[m][i] = best;
        return best;
    } 
}
