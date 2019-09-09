import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class _76_Blackjack {
    public static void main(String[] args) {


        Random random = new Random();
        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            cards.add(random.nextInt(10) + 2);
        int yourTotal = cards.get(0) + cards.get(1);
        int dealerTotal = cards.get(2) + cards.get(3);

        System.out.println("Blackjack!\n");
        System.out.println("You drew " + cards.get(0) + " and " + cards.get(1) + ". " +
                "Your total is " + yourTotal + ".");
        System.out.println("The dealer has a " + cards.get(2) + " and a hidden card. " +
                "His total is hidden, too.\n");

        boolean hit = true;
        String answer = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Would you like to \"hit\" or \"stay\"? ");
            while (!answer.equals("hit") && !answer.equals("stay"))
                answer = scanner.nextLine();
            if (answer.equals("stay"))
                hit = false;
            else {
                cards.add(random.nextInt(10) + 2);
                yourTotal += cards.get(cards.size() - 1);
                System.out.println("You drew a " + cards.get(cards.size() - 1) + ". " +
                        "Your total is " + yourTotal + ".\n");
                if (yourTotal > 21) {
                    System.out.println("You got over 21!" + " YOU LOOSE!");
                    System.exit(0);
                }
            }
            answer = "";
        } while (hit);

        System.out.println("\nOkay, dealer's turn. " +
                "His hidden card was a " + cards.get(3) + ". " +
                "His total was " + dealerTotal + ".\n");
        while (dealerTotal < 17) {
            cards.add(random.nextInt(10) + 2);
            dealerTotal += cards.get(cards.size() - 1);
            System.out.println("Dealer chooses to hit.\n" +
                    "He draws a " + cards.get(cards.size() - 1) + ". " +
                    "His total is " + dealerTotal + ".\n");
        }
        if (dealerTotal > 21) {
            System.out.println("Dealer got over 21!" + " YOU WIN!");
            System.exit(0);
        }

        System.out.println("Dealer stays.\n");

        System.out.println("Dealer total is " + dealerTotal + ", and your total is " + yourTotal + ".");

        if (yourTotal > dealerTotal)
            System.out.println("YOU WIN!");
        else if (yourTotal < dealerTotal)
            System.out.println("YOU LOOSE!");
        else
            System.out.println("It's a tie so... YOU LOOSE!");
    }
}
 /*
Write a program that allows a human user to play a simplified version of Blackjack against a computer opponent. Make it as cool as you can.

The simplified blackjack rules are as follows:

Don't worry about suits or face cards; "cards" will have values from 2-11, and all values are equally likely (that is, unlike a real blackjack game, there's no greater chance of drawing a card with value 10).
Draw two cards for the player and display them.
Draw two cards for the "dealer" and display one of them, keeping the other one hidden.
Allow the player to "hit" as many times as he would like.
If the player "busts" (gets a total over 21), the dealer automatically wins.
Allow the dealer to hit as many times as he would like. Dealer should probably hit on sixteen or lower.
If the dealer busts, the player automatically wins.
Assuming no one has busted, the player with the highest total wins. Dealer wins all ties.

    As will be the case with all projects, this is not an assigment with a fixed goal. Programs that merely do what is listed above will be passing, but will certainly not be worth 100. In order to score a high grade, programs must go above and beyond the specifications. Here are suggested additional features to add:
    Use realistic card values, with suits and faces from ace to king.
    Incorporate wagering.
    Display some sort of graphical cards.
    Anything else interesting you can think of.
Be aware that you won't get any extra points for adding additional features if the basic program doesn't work. That is, if your program can't successfully do the basics listed above, no amount of bells and whistles will save your grade. Programs will be graded on the following criteria:
Functionality - Does your program fulfill the basic requirements? Is it done? And what else does it do? (50%)
Overall Impression - Is your program efficiently organized, or is there a lot of duplicated code? Does it look well-written, or barely finished? (25%)
Bugs - does it compile? Are there obvious errors? Are there subtle errors? (10%)
Internal Documentation - How easy is your code to understand? Are you using good variable names? Are there any comments? (10%)
Readability - Is your program consistently indented in a manner that reflects the structure of your code? Is it easy to read? Are there blank lines which break up the major sections of your code? (5%)

Welcome to Mitchell's blackjack program!
You get a 6 and a 5.
Your total is 11.

The dealer has a 7 showing, and a hidden card.
His total is hidden, too.

Would you like to "hit" or "stay"? hit
You drew a 8.
Your total is 19.

Would you like to "hit" or "stay"? stay

Okay, dealer's turn.
His hidden card was a 3.
His total was 10.

Dealer chooses to hit.
He draws a 7.
His total is 17.

Dealer stays.

Dealer total is 17.
Your total is 19.

YOU WIN!
 */