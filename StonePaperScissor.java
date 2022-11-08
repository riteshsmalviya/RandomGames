import java.util.Scanner;
import java.util.Random;
public class StonePaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Welcome To Stone Paper Scissor");
        System.out.println("I Hope You Dont Win This Game");
        System.out.println("Enter: \n1. Stone\n2. Paper\n3. Scissor");
        int win = 0;
        int draw = 0;
        for(int i=0;i<3;i++){
            
        System.out.println("Enter Your Choice: ");
        int choice = sc.nextInt();
        int ComChoice = rand.nextInt(1,4);
        if(choice==ComChoice){
            System.out.println("Draw");
            draw++;     
        }
        else if(choice==1 && ComChoice == 2){
            System.out.println("You Took Stone");
            System.out.println("Computer Took Paper");
            System.out.println("You lose");
        }
        else if(choice==2 && ComChoice==1){
            System.out.println("You Took Paper");
            System.out.println("Computer Took Stone");
            System.out.println("You win");
            win++;
        }
        else if(choice==3 && ComChoice==1){
            System.out.println("You Took Scissor");
            System.out.println("Computer Took Stone");
            System.out.println("You Lose");
        }
        else if(choice==3 && ComChoice==2){
            System.out.println("You Took Scissor");
            System.out.println("Computer Took Paper");
            System.out.println("You Win");
            win++;
        }
        else if(choice==1 && ComChoice==3){
            System.out.println("You Took Stone");
            System.out.println("Computer Took Scissor");
            System.out.println("You Win");
            win++;
        }
        else if(choice==2 && ComChoice==3){
            System.out.println("You Took Paper");
            System.out.println("Computer Took Scissor");
            System.out.println("You Lose");
        }
        else{
            System.out.println("Your Choice is Wrong MF");
        }
    }
    System.out.println("Game Ended, Thanks For Playing");
    System.out.println("The Result Is Given Below");
    if(win>=2){
        System.out.println("You Are A Champion");
       }
       else if(draw<=2 && draw>1){
        System.out.println("The Match Is Draw");
       }
       else{
        System.out.println("You Are Not A Champion");
       }
    sc.close();

    }
}

