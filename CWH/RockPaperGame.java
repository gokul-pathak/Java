import java.util.Random;
import java.util.Scanner;

public class RockPaperGame {
    public static void main(String[] args) {
        // 0 for rock
        // 1 for Paper
        // 2 for Scissor
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter '0' for Rock, '1' for Paper & '2' for Scissor ");
        int choice = scan.nextInt();

        Random random = new Random();
        int botInput = random.nextInt( 3);
        if(choice == botInput){
            System.out.println("Draw.");
        }
        else if (botInput == 2 && choice == 0 || botInput ==0 && choice ==1 || choice == 2 && botInput == 1){
            System.out.println("Congratulations, You win!!.");
        }
        else {
            System.out.println("Better luck next time. Computer win!!");
        }
        if(botInput == 0){
            System.out.println("Computer choice: Rock");
        }
        else if(botInput == 1){
            System.out.println("Computer choice: Paper");
        }
        else if(botInput == 2){
            System.out.println("Computer choice: Scissor");
        }

    }
}
