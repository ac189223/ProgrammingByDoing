import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _63C_Nim {
    /*
    Nim is a strategy game between two players.
Start by placing counters (coins or toothpicks or something) into 3 piles.
Player #1 picks a pile, then removes one or more counters from that pile. (It's okay to take the whole pile.)
Player #2 picks a pile, then removes one or more counters from that pile.
Player #1 plays again. (It's okay to choose a different pile this time.)
Whichever player is forced to take the last counter is the LOSER.
    Write a program that allows two human players to play Nim against each other. The program should detect when the last counter has been taken and declare a winner.
    At first, don't worry about detecting cheating. That is one of the bonus options.
     */
    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<>();
        players.add("Alice");
        players.add("Bob");

        HashMap<String, Integer> piles = new HashMap<>();
        piles.put("A", 3);
        piles.put("B", 4);
        piles.put("C", 5);
        String pilesString = "";
        for (String key : piles.keySet()) {
            pilesString += key + ", ";
        }
        pilesString = pilesString.substring(0, pilesString.length() - 2);

        Scanner scanner = new Scanner(System.in);
        String pile = "";
        int amount = 0;
        int notEmpty = piles.size();
        int playerNum = 0;
        String name;

        while (notEmpty > 0) {
            name = players.get(playerNum % players.size());
            playerNum++;
            while (!pile.equals("A") && !pile.equals("B") && !pile.equals("C")) {
                System.out.print(name + ", pick a pile from (" + pilesString + "): ");
                pile = scanner.next();
                pile = pile.toUpperCase();
            }
            System.out.print("Pick a number of counters to remove: ");
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
        name = players.get(playerNum % players.size());
        System.out.println(name + ", there are no counters left, so you WIN!");
    }
}
