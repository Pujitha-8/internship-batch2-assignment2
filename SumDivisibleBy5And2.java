public class SumDivisibleBy5And2 {
    public static void main(String[] args) {
        int[] values = {100, 52, 43, 99, 42, 40, 91};

        int sum = findSumDivisibleBy5And2(values);

        System.out.println("Sum of numbers divisible by 5 and 2: " + sum);
    }

    public static int findSumDivisibleBy5And2(int[] array) {
        int sum = 0;

        for (int value : array) {
            if (value % 5 == 0 && value % 2 == 0) {
                sum += value;
            }
        }

        return sum;
    }
}
