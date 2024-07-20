import javax.management.RuntimeErrorException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double input = scanner.nextDouble();

        double answer = mySqrt(input);
        System.out.printf("Square root of %f is %f", input, answer);
    }

    private static double mySqrt(double num) {
        if (num == 0) return 0;
        if (num < 0) throw new IllegalArgumentException("Invalid number provided to mySqrt()");

        double lowerLimit = num > 1.0 ? 1 : num;
        double upperLimit = num > 1.0 ? num : 1;

        return sqrtBinarySearch(lowerLimit, upperLimit, num);
    }

    // recursive method
    private static double sqrtBinarySearch(double lowerLimit, double upperLimit, double num) {
        double smallerLimit, largerLimit;
        double midpoint = (lowerLimit + upperLimit) / 2.0;

        if (lowerLimit < upperLimit) {
            smallerLimit = lowerLimit;
            largerLimit = upperLimit;
        } else {
            smallerLimit = upperLimit;
            largerLimit = lowerLimit;
        }

        if ((largerLimit - smallerLimit) / smallerLimit < 1e-8) return midpoint;
        if (midpoint * midpoint > num) upperLimit = midpoint;
        else lowerLimit = midpoint;

        return sqrtBinarySearch(lowerLimit, upperLimit, num);
    }
}
