import java.util.Scanner;
public class ArrayAvergeScore16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        int[] Score = new int[numStudents];
        double totalPassed = 0, totalFailed = 0;
        int passedCount = 0, failedCount = 0;
        for (int i = 0; i < Score.length; i++) {
            System.out.print("Enter the final score " + i + ": ");
            Score[i] = sc.nextInt();
            if (Score[i] > 70) {
                totalPassed += Score[i];
                passedCount++;
            } else {
                totalFailed += Score[i];
                failedCount++;
            }
        }
        double averagePassed = (passedCount > 0) ? totalPassed / passedCount : 0;
        double averageFailed = (failedCount > 0) ? totalFailed / failedCount : 0;
        System.out.println("The average score of students who passed is " + averagePassed);
        System.out.println("The average score of students who failed is " + averageFailed);
    }
}