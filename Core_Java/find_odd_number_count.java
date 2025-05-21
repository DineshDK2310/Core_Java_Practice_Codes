
public class find_odd_number_count {
    public static void main(String args[]) {
        int oddCount = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("odd number count is: " + oddCount);
    }
}
