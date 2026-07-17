import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[5];
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
            sum += scores[i];
        }
        double average = sum / scores.length;
        System.out.println("\n--- Results ---");
        System.out.println("Total Score: " + sum);
        System.out.println("Average Score: " + average);
        scanner.close();
    }
}

