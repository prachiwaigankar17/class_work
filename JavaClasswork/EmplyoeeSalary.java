//WAP to Calculate total salary of Employee
import java.util.Scanner; //importing scanner
public class EmplyoeeSalary {
    public static void main(String[] args) {
        //declaring variables
        int Salary;
        float da;
        double hra, gross;

        //taking user input
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Salary");
        Salary= sc.nextInt();
        System.out.println("enter your daily allowance");
        da = sc.nextFloat();
        System.out.println("Enter your hra");
        hra = sc.nextDouble();

        gross = Salary+da+hra;  //calculating gross i.e total salary
        System.out.println("Toatal salary =" + gross);  //printing output

    }
}
