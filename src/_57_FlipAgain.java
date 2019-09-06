import java.util.Random;
import java.util.Scanner;

public class _57_FlipAgain {
    /*
    You flip a coin and it is... TAILS
Would you like to flip again (y/n)? y
You flip a coin and it is... HEADS
Would you like to flip again (y/n)? y
You flip a coin and it is... HEADS
Would you like to flip again (y/n)? n
     */
    public static void main(String[] args) {
        boolean again = true;
        String againStr = "y";
        String flip;
        int flipNum;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (again) {
            flipNum = random.nextInt(2);
            if (flipNum == 0)
                flip = "TAILS";
            else
                flip = "HEADS";
            System.out.println("You flip a coin and it is... " + flip);
            do {
                System.out.print("Would you like to flip again (y/n)? ");
                againStr = scanner.next();
                if (againStr.equals("n"))
                    again = false;
            } while (againStr.equals("y") && againStr.equals("n"));
        }
    }
}
