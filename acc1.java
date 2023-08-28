public class acc1 {
    public static void main(String[] args) {
        int result1 = operationchoices(1, 10, 5, 3); // Should return 8
        int result2 = operationchoices(4, 10, 5, 3); // Should return 1
        int result3 = operationchoices(2, 10, 5, 3); // Should return 2
        int result4 = operationchoices(3, 10, 5, 3); // Should return 15

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        System.out.println("Result 4: " + result4);
    }

    public static int operationchoices(int c, int n, int a, int b) {
        if (c == 1) {
            return a + b;
        } else if (c == 4) {
            return a / b;
        } else if (c == 2) {
            return a - b;
        } else if (c == 3) {
            return a * b;
        } else {
            throw new IllegalArgumentException("Invalid operation choice");
        }
    }
}
