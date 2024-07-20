public class Q1 {
    public static void main(String[] args) {
        System.out.println("Number   SquareRoot   Cube\n");

        for (double i = 0.0; i < 21.0; i += 2.0) {
            double squareRoot = Math.sqrt(i);
            double cube = Math.pow(i, 3);

            System.out.printf("%-8d %-12.4f %.4f\n", (int) i, squareRoot, cube);
        }
    }
}
