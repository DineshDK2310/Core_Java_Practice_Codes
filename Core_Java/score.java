
import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Your Score:");
        Float score = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter Your Department:");
        String department = scanner.nextLine();

        System.out.println("My Name is " + name);
        System.out.println("My Score is " + score / 10);
        System.out.println("My Department is " + department);
    }
}
