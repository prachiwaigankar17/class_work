//IfDemo

import java.util.Scanner; //importing scanner
class IfDemo
{
    public static void main(String args[])
    {
        int num; //declaring variable

        //taking user input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        num=sc.nextInt();

        if(num>0)
        {
            System.out.println("Welcome to java programming");
        }
        System.out.print("You Enjoy");
        sc.close();

    }
}
