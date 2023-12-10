import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        int num;

        // taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();

        // checking the number
        if (num > 0) {
            System.out.println("The number is positive");
        } else if (num < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}
