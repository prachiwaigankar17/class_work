//WAP to Check whether the number is even or odd
import java.util.Scanner; //importing scanner

public class EvenOrOdd {
    public static void main(String[] args) {
        int num; //deaclring variable

        //taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        num = sc.nextInt();

        //checking even or odd
        if (num % 2 == 0) {
            System.out.println("It is even Number");

            } else {
                System.out.println("It is odd number");
            }
        }
    }




