import java.util.Scanner;

public class find_loan_amount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Enter your Salary:");
        int salary = scanner.nextInt();
        if (salary >= 20000 || age >= 25) {
            System.out.println("How much loan amount needed: ");
            int loanAmount = scanner.nextInt();
            if (loanAmount >= 50000) {
                System.out.println("Eligible for Loan");
            } else {
                System.out.println("Maximum Loan amount is 50000");
            }
        } else {
            System.out.println("You are not eligible for loan");
        }
    }
}
