import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mark");
        int totalMark = scanner.nextInt();
        School school = new School();
        System.out.println(school.passorfail(totalMark));
    }

    String passorfail(int mark) {
        return mark >= 35 ? "You are Pass" : "You are Fail";
    }
}
