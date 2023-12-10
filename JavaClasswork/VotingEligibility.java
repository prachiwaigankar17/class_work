//WAP to check the Voting Eligibility

import java.util.Scanner;  //importing Scanner
public class VotingEligibility {
    public static void main(String[] args) {
        int age;  //declaring variables

        //taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        age = sc.nextInt();

        //checking eligibilty
        if(age>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not elgibile to vote");
        }


    }
}
