
import java.util.Scanner;
import java.util.Random;
public class game {
    public static void main(String[] args) {
        Random rc = new Random();
        Scanner sc = new Scanner(System.in);
        String playagain;
        do {
            System.out.println("SELECT ROCK = 0 | PAPER = 1 | SCISSOR = 2 : ");
            int user = sc.nextInt();
            int a = rc.nextInt(3);
            {

                switch (user) {
                    case 0:
                        System.out.println("User chose ROCK");
                        break;
                    case 1:
                        System.out.println("User chose PAPER");
                        break;
                    case 2:
                        System.out.println("User chose SCISSOR");
                        break;
                    default:
                       System.out.println("Please Select a valid Integer :(");
                       return;


                }

                switch (a) {
                    case 0:
                        System.out.println("Computer chose ROCK ");
                        break;
                    case 1:
                        System.out.println("Computer chose PAPER");
                        break;
                    case 2:
                        System.out.println("Computer chose SCISSOR ");
                        break;
                     default:
                        System.out.println("Out of bound");
                        return;
                }
                if (user == a) {
                    System.out.println("TIE");
                } else if (user >= a) {
                    System.out.println("  COMPUTER WON ");
                } else if (user <=   a) {
                    System.out.println(" YOU LOSE ");
                } else {
                    System.out.println("YOU WIN");
                }
                System.out.println("You really want to play again ? ");
                playagain = sc.next();


            }}while (playagain.equalsIgnoreCase("yes")) ;

            System.out.println("Thanks for playing!");


        }
    }