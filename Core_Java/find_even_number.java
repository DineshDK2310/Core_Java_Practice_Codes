import java.util.Scanner;

public class find_even_number {
    public static void main(String args[]) {
        System.out.println("Enter the Number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Given number is Even");
        } else {
            System.out.println("Given number is Odd");
        }
    }
}
