public class Q4 {
    public static void main(String[] args) {
        int ans1 = Average.calculateAverage(4, 22);
        int ans2 = Average.calculateAverage(5, 31, 53);
        double ans3 = Average.calculateAverage(12.2, 43.21);
        double ans4 = Average.calculateAverage(14.66, 58.9, 34.0);

        System.out.printf("Answer 1: %d\n", ans1);
        System.out.printf("Answer 2: %d\n", ans2);
        System.out.printf("Answer 3: %f\n", ans3);
        System.out.printf("Answer 4: %f\n", ans4);
    }
}
