import java.util.Scanner;

public class RPS {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Rock Paper Scissors! ");

        boolean playAgain = true;

        while(playAgain) {
            System.out.print("Player A: Please enter your move choice (R(r), P(p) or S(s) : ");
            String playerA = input.nextLine();
            if (!playerA.equalsIgnoreCase("R") && !playerA.equalsIgnoreCase("P") && !playerA.equalsIgnoreCase("S")){
                System.out.println("Invalid Move: Now Exiting");
                System.exit(0);
            }

            System.out.print("Player B: Please enter your move choice (R(r), P(p), or S(s) : ");
            String playerB = input.nextLine();
            if (!playerB.equalsIgnoreCase("R") && !playerB.equalsIgnoreCase("P") && !playerB.equalsIgnoreCase("S")){
                System.out.println("Invalid Move: Now Exiting");
                System.exit(0);
            }

            if (playerA.equalsIgnoreCase(playerB)) {
                System.out.println(playerA + " vs " + playerB + ". It's a tie. ");
            }
            else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors");
                System.out.println("Player A wins");
            }
            else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock");
                System.out.println("Player A wins");
            }
            else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Scissors cuts Paper");
                System.out.println("Player A wins");
            }
            else if (playerB.equalsIgnoreCase("R") && playerA.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors");
                System.out.println("Player B wins");
            }
            else if (playerB.equalsIgnoreCase("P") && playerA.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock");
                System.out.println("Player B wins");
            }
            else if (playerB.equalsIgnoreCase("S") && playerA.equalsIgnoreCase("P")) {
                System.out.println("Scissors cuts paper");
                System.out.println("Player B wins");
            }

            System.out.print("Play Again? (Y/N): ");
            String playAgainInput = input.nextLine().toUpperCase();
            if (playAgainInput.equals("N")) {
                playAgain = false;
            }
            }


            }
    }