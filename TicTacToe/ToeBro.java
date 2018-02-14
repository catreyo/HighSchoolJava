import java.util.Scanner;

public class ToeBro
{
    public static void main(String args[]){
        TicTac toe = new TicTac();
        Scanner prompt = new Scanner(System.in);
        System.out.println("Put in values as you would in a table, horizontal is left to right and vertical is top to bottom.");
        System.out.println("IF YOU DO NOT FOLLOW THE RULES YOU WILL BE SKIPPED! or killed");
        System.out.println();
        System.out.print("# of players (1/2) --> ");
        int decision = prompt.nextInt();
        if(decision == 1){
            toe.game();
        }
        else if(decision == 2){
            toe.game2();
        }
        else{
            System.out.println("You are too stupid for this game!");
        }
        System.out.println("Play again? (Y/N)");
        String a = prompt.next();
        while(a.equals("Y")) {
            System.out.print("# of players (1/2) --> ");
            decision = prompt.nextInt();
            if(decision == 1){
                toe.game();
            }
            else if(decision == 2){
                toe.game2();
            }
            else{
                System.out.println("You are too stupid for this game!");
            }
            System.out.println("Play again? (Y/N)");
            a = prompt.next();
        }
        prompt.close();
        System.out.println("Thanks for playing!");
    }
}