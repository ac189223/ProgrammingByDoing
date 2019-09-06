import java.util.Random;
import java.util.Scanner;

public class _54_HiLoWithLimitedTries {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        System.out.println(numberToGuess);

        int count = 0;
        int guess = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number that I am thinking about (between 1 and 100)");
        while (count < 5 && guess != numberToGuess) {
            count++;
            System.out.print("Guess number " + count + ": ");
            guess = scanner.nextInt();
            if (guess > numberToGuess)
                System.out.println("Sorry, that guess is too high.");
            else if (guess < numberToGuess)
                System.out.println("Sorry, that guess is too low.");
            else
                break;
        }
        if (guess == numberToGuess)
            System.out.println("You guessed it!");
        else
            System.out.println("Sorry, you didn't guess it in 5 tries. You lose.");
    }
}
