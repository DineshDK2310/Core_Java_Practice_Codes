import java.util.Scanner;

public class Find_Even_Odd {
    public static void main(String[] args) {
        Find_Even_Odd find_Even_Odd = new Find_Even_Odd();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        find_Even_Odd.evenorodd(number);
    }

    void evenorodd(int num) {
        System.out.println(num % 2 == 0 ? "Given Number is Even" : "Given Number is Odd");
    }
}
