//Wap to decide who won the cricket match India or pakistan
import java.util.Scanner; //importing scanner
public class CricketMatch {
    public static void main(String[] args) {
        int India , Pakistan; //decalring variables

        //taking input from user
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the score of India");
        India = sc.nextInt();
        System.out.println("Enter the score of Pakistan");
        Pakistan = sc.nextInt();

       //checking winner
        if(India > Pakistan) {
            System.out.println("The Winner is India");
        }
           else if(Pakistan > India) {
                System.out.println("The Winner is Pakistan");

           }
           else{
            System.out.println("The match is tie");
        }
    }

}
