import java.util.Scanner;
public class ArrayAnalysis16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double total = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            total += numbers[i];
        }
        double average = total / n;
        System.out.println("Highest value: " + max);
        System.out.println("Lowest value: " + min);
        System.out.println("Average value: " + average);
    }
}