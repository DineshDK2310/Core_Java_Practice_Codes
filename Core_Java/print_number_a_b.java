import java.util.Scanner;

public class print_number_a_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a value:");
        int a = scanner.nextInt();
        System.out.println("Enter the b value:");
        int b = scanner.nextInt();
        for(int i=a; i<=b; i++) {
            System.out.println(i);
        }
    }
}
