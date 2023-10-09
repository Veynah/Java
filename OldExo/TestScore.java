import java.util.Scanner;

public class TestScore {
    public static String getGrade(int score) {
        if (score < 0 || score > 20) {
            return "Error: Invalid score";
        }

        if (score >= 0 && score <= 10) {
            return "I";
        } else if (score >= 11 && score <= 12){
            return "S";
        } else if (score >= 13 && score <= 15){
            return "B";
        } else if (score >= 16 && score <= 18){
            return "TB";
        } else if (score >= 19 && score <= 20){
            return "Excellent";
        }

        return "Enexpected error";
    }

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter score");

    int score = scanner.nextInt();
    String grade = getGrade(score);
    System.out.println("The grade for " + score + " is: " + grade);
    scanner.close();
    }
}