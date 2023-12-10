/*WAP to accept percentage from the user and make a decision as per below condition:
        per>=75 distinction
        per<75 and per>60 first class
per<60 and per>=45 second class
35 to 45 pass class otherwise fail
*/

import java.util.Scanner; //importing Scanner
public class StudentResult {
    public static void main(String[] args) {
        double percentage; //declaring variables

        //taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Percentage");
        percentage = sc.nextDouble();

        //checking result
        if(percentage >= 75 ){
            System.out.println("Your result is Distinction");
        }
        else if (percentage < 75 && percentage >= 60){
            System.out.println("Your result is First CLass");
        }
        else if (percentage <60 && percentage >= 45){
            System.out.println("Your result is Second Class");
        }
        else if (percentage < 45 && percentage >=35){
            System.out.println("Your result is Passed");
        }
        else{
            System.out.println("Your result is Fail");
        }


    }


}
