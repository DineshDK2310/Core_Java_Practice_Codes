import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class print_5_numbers_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[5];
        for(int i=0;i<5;i++) {
            number[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(number));
    }
}
