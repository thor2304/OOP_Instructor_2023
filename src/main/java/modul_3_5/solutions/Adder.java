package modul_3_5.solutions;

public class Adder {
    public static int sum(int[] numbers) {
        int result = 0;

        for (int i = 0; i < numbers.length; i++) { // corrected 1 -> 0 and <= to <
            result += numbers[i]; // corrected i -> numbers[i]
        }

        return result;
    }

    public static void main(String[] args) {
        int[] testcase1 = {1, 3, 5, 2, 3, 7};
        int[] testcase2 = {5, 6, 2, 3};

        System.out.println(sum(testcase1));
        System.out.println(sum(testcase2));
    }
}
