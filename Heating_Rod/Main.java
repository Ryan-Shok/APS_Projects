import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double L = scanner.nextDouble();
        double T = scanner.nextDouble();
        double C = scanner.nextDouble();

        double ratio = 1 + T * C;

        double end = Math.PI;
        double start = 0.0;
        double mid = 0.0;
        while (end - start > 1e-12)
        {
            mid = (end + start)/2;
            double expression = mid/(2 * Math.sin(mid/2));

            if (expression < ratio)
            {
                start = mid;
            }
            else
            {
                end = mid;
            }
        }

        double radius = L / (2 * Math.sin(mid / 2));
        double D = radius - radius * Math.cos(mid / 2);

        System.out.printf("%.3f%n", D);
    }
}
