import java.util.HashMap;
import java.util.Scanner;

public class _63B_BabyNim_EmptyOfPile {
    /*
Write a program that starts with three "piles" of 3 counters each. Let the player choose piles and remove counters until all the piles are empty.
Start by placing counters (coins or toothpicks or something) into 3 piles.
The player picks a pile, then removes one or more counters from that pile. (It's okay to take the whole pile.)
The player picks a new pile, then removes one or more counters from that pile. (It's okay to pick the same pile as before.)
Once all piles are empty, the game stops.
     */
    public static void main(String[] args) {
        HashMap<String, Integer> piles = new HashMap<>();
        piles.put("A", 3);
        piles.put("B", 3);
        piles.put("C", 3);
        String pilesString = "";
        for (String key : piles.keySet()) {
            pilesString += key + ", ";
        }
        pilesString = pilesString.substring(0, pilesString.length() - 2);

        Scanner scanner = new Scanner(System.in);
        String pile = "";
        int amount = 0;
        int notEmpty = piles.size();

        while (notEmpty > 0) {
            while (!pile.equals("A") && !pile.equals("B") && !pile.equals("C")) {
                System.out.print("Pick a pile from (" + pilesString + "): ");
                pile = scanner.next();
                pile = pile.toUpperCase();
            }
            System.out.print("Pick a number of counters: ");
            amount = scanner.nextInt();

            piles.put(pile, piles.get(pile) - amount);
            pile = "";

            notEmpty = 0;
            for (String key : piles.keySet()) {
                System.out.print(key + " : " + piles.get(key) + " ".repeat(8));
                if (piles.get(key) > 0)
                    notEmpty++;
            }
            System.out.println();
        }
        System.out.println("All piles are empty. Good job!");
    }
}
