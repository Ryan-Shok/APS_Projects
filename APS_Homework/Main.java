import java.util.*;

public class Main
{

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Long> problems = new PriorityQueue<Long>(Collections.reverseOrder());

        int problemCount = scanner.nextInt();        
        for (int i = 0; i < problemCount; i++)
        {
            long currAmaTime = scanner.nextInt();
            long currGradeTime = scanner.nextInt();
            problems.add(currGradeTime * 100000 + currAmaTime);
        }
         
        long leftOverGradeTime = 0;
        long totalTime = 0;
        for (int i = 0; i < problemCount; i++)
        {
            long curr = problems.poll();
            long currAmaTime = curr % 100000;
            long currGradeTime = curr/100000;
            totalTime += currAmaTime;
            if (leftOverGradeTime != 0)
            {
                leftOverGradeTime -= currAmaTime;
                if (leftOverGradeTime < 0)
                {
                    leftOverGradeTime = 0;
                }
            }
            if (currGradeTime > leftOverGradeTime)
            {
                leftOverGradeTime = currGradeTime;
            }
        }
        totalTime += leftOverGradeTime;
        System.out.println(totalTime);

    }
}
