import java.util.Scanner;

public class find_average {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Tamil Subject Mark:");
        int tamil = scanner.nextInt();
        System.out.println("Enter the English Subject Mark:");
        int english = scanner.nextInt();
        System.out.println("Enter the Maths Subject Mark:");
        int maths = scanner.nextInt();
        System.out.println("Enter the Science Subject Mark:");
        int science = scanner.nextInt();
        System.out.println("Enter the SocialScience Subject Mark:");
        int socialScience = scanner.nextInt();

        int totalMark = tamil + english + maths + science + socialScience;
        int avgMark = totalMark / 5;
        if (avgMark > 35) {
            System.out.println("You are Pass");
        } else {
            System.out.println("You are Fail");
        }
    }
}
