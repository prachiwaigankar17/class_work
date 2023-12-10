//write a number to swap two numbers
import java.util.Scanner; //importing scanner

public class SwapNumbers {
    public static void main(String[] args) {
        int num1 , num2 , temp; //decalring variable

        //taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 and 2");
        num1= sc.nextInt();
        num2= sc.nextInt();

        System.out.println("Before swapping"+ num1 + " " + num2); //Displaying the Original Numbers

        //swapping the numbers
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping"+ num1 + " " + num2); //Displaying the Swap Numbers

    }
}
