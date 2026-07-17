import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter midterm score: ");
        double midterm = scanner.nextDouble();
        System.out.print("Enter final score: ");
        double finalScore = scanner.nextDouble();
        double total = midterm + finalScore;
        System.out.println("Total score: " + total);
        if (total >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        scanner.close();
    }
}
