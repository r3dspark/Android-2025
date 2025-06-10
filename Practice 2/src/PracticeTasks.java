import java.util.*;

public class PracticeTasks {

    public static String evenOrOdd(int number) {
        return (number & 1) == 0 ? "Even" : "Odd";
    }

    public static int multiplyByParity(int number) {
        return number * ((number & 1) == 0 ? 4 : 5);
    }

    public static int makeNegative(int number) {
        return number > 0 ? -number : number;
    }

    public static int getCentury(int year) {
        return (year + 99) / 100;
    }

    public static int findMin(int[] array) {
        return Arrays.stream(array).min().orElseThrow();
    }

    public static List<Integer> twoLargest(int[] array) {
        return Arrays.stream(array)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .sorted()
                .toList();
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[0];
        int positives = 0, negativesSum = 0;
        for (int num : input) {
            if (num > 0) positives++;
            else if (num < 0) negativesSum += num;
        }
        return new int[]{positives, negativesSum};
    }

    public static int countVowels(String str) {
        return (int) str.toLowerCase().chars()
                .filter(c -> "aeiouy".indexOf(c) >= 0)
                .count();
    }

    public static String getMiddle(String str) {
        int len = str.length(), mid = len / 2;
        return len % 2 == 0 ? str.substring(mid - 1, mid + 1) : str.substring(mid, mid + 1);
    }

    public static int[][] multiplicationTable(int n) {
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                table[i][j] = (i + 1) * (j + 1);
        return table;
    }

    public static void main(String[] args) {
        System.out.println("1. Even or Odd: " + evenOrOdd(3));
        System.out.println("2. Multiply: " + multiplyByParity(4));
        System.out.println("3. Negative: " + makeNegative(5));
        System.out.println("4. Century: " + getCentury(2023));
        System.out.println("5. Min: " + findMin(new int[]{34, 15, 88, 2}));
        System.out.println("6. Two largest: " + twoLargest(new int[]{1, 5, 87, 45, 8, 8}));
        System.out.println("7. Positives/Negatives: " + Arrays.toString(countPositivesSumNegatives(new int[]{1,2,3,-1,-2,-3})));
        System.out.println("8. Vowels: " + countVowels("education"));
        System.out.println("9. Middle: " + getMiddle("student"));
        System.out.println("10. Multiplication Table: " + Arrays.deepToString(multiplicationTable(3)));
    }
}
