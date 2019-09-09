import java.util.Random;

public class _75_BabyBlackjack {
    /*
    Write a program that allows a human user to play a single hand of "blackjack" against a dealer.
Pick two values from 1-10 for the player. These are the player's "cards".
Pick two more values from 1-10 for the dealer.
Whoever has the highest total is the winner.
There is no betting, no busting, and no hitting. Save that for real blackjack.
Baby Blackjack!
You drew 6 and 5.  -->  Your total is 11.  -->  The dealer has 7 and 3.  -->  Dealer's total is 10.
YOU WIN!
     */

    public static void main(String[] args) {
        Random random = new Random();
        int[] cards = new int[4];
        for (int i = 0; i < cards.length; i++)
            cards[i] = random.nextInt(10) + 1;

        System.out.println("Baby Blackjack!\n");
        System.out.println("You drew " + cards[0] + " and " + cards[1] + "." +
                "\nYour total is " + (cards[0] + cards[1]) + ".\n");
        System.out.println("The dealer has " + cards[2] + " and " + cards[3] + "." +
                "\nDealer's total is " + (cards[2] + cards[3]) + ".\n");
        if ((cards[0] + cards[1]) > (cards[2] + cards[3]))
            System.out.println("YOU WIN!");
        else if ((cards[0] + cards[1]) < (cards[2] + cards[3]))
            System.out.println("YOU LOOSE!");
        else
            System.out.println("IT'S A TIE!");
    }
}
