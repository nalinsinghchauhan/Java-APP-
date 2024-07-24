import java.util.Scanner;

public class ExamGrader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your exam score (0-100): ");
        int score = scanner.nextInt();

        String grade;
        switch (score / 10) {
            case 10:
            case 9:
                grade = "A (Excellent)";
                break;
            case 8:
                grade = "B (Very Good)";
                break;
            case 7:
                grade = "C (Good)";
                break;
            case 6:
                grade = "D (Satisfactory)";
                break;
            default:
                if (score < 0 || score > 100) {
                    grade = "Invalid score";
                } else {
                    grade = "F (Fail)";
                }
                break;
        }

        System.out.println("Your grade is: " + grade);

        scanner.close();
    }
}