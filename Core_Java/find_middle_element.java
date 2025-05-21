import java.util.Arrays;
import java.util.Scanner;

public class find_middle_element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println((array.length));
        if (arraySize % 2 == 0) {
            int mid1 = arraySize / 2 - 1;
            int mid2 = arraySize / 2;
            System.out.println("Middle elements are: " + array[mid1] + " and " + array[mid2]);
        } else {
            int mid = arraySize / 2;
            System.out.println("Middle element is: " + array[mid]);
        }
    }
}
