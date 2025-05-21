import java.util.Scanner;

public class divideby3and5 {
    public static void main(String args[]) {
        System.out.println("Enter the Number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Number is Divisible by 3 and 5");
        } else {
            System.out.println("Number is not Divisible by 3 and 5");
        }
    }
}
