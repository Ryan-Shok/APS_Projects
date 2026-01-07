import java.util.*;
import java.awt.*;
import java.awt.geom.Point2D;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int ufos = scanner.nextInt();


        TreeSet<Double> xs = new TreeSet<Double>();
        TreeSet<Double> ys = new TreeSet<Double>();

        Point4D[] squares = new Point4D[ufos];


        for (int i = 0; i < ufos; i++)
        {
            double xu = scanner.nextDouble();
            double yu = scanner.nextDouble();
            double ru = scanner.nextDouble();

            double xCornerOne = xu - ru;
            double xCornerTwo = xu + ru;
            double yCornerOne = yu - ru;
            double yCornerTwo = yu + ru;
            xs.add(xCornerOne);
            xs.add(xCornerTwo);
            ys.add(yCornerOne);
            ys.add(yCornerTwo);
            Point4D currPoint = new Point4D(xCornerOne, xCornerTwo, yCornerOne, yCornerTwo);
            squares[i] = currPoint;
        }
        int xSize = xs.size();
        int ySize = ys.size();

        double totalSize = 0;
        Iterator<Double> xIterator = xs.iterator();
        double xOne = xIterator.next();
        while (xIterator.hasNext()) 
        {
            double xTwo = xIterator.next();
            Iterator<Double> yIterator = ys.iterator();
            double yOne = yIterator.next();
            while (yIterator.hasNext()) 
            {    
                double yTwo = yIterator.next();
                for (int i = 0; i < squares.length; i++)
                {
                    Point4D currPoint = squares[i];
                    if (xOne >= currPoint.getX() && xTwo <= currPoint.getY() 
                    && yOne >= currPoint.getZ() && yTwo <= currPoint.getW())
                    {
                        totalSize += (xTwo - xOne) * (yTwo - yOne);
                        break;
                    }
                }  
                yOne = yTwo;  
            }
            xOne = xTwo;
        }
        System.out.printf("%.2f", totalSize);
        

    }

    public static class Point4D 
    {
        private final double x;
        private final double y;
        private final double z;
        private final double w;

        public Point4D(double x, double y, double z, double w) 
        {
            this.x = x;
            this.y = y;
            this.z = z;
            this.w = w;
        }

        public double getX() 
        {
            return x;
        }

        public double getY() 
        {
            return y;
        }

        public double getZ() 
        {
            return z;
        }

        public double getW() 
        {
            return w;
        }
    }
}
