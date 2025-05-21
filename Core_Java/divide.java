import java.util.Scanner;

class divide {
    public static void main(String args[]) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a value:");
        int a = Scan.nextInt();
        System.out.println("Enter b value:");
        int b = Scan.nextInt();
        System.out.println("Enter c value:");
        int c = Scan.nextInt();

        int d = a * b * c;
        int e = a + b + c;
        System.out.println("Final Value: " + d / e);
    }
}