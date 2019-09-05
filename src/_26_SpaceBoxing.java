import java.util.HashMap;
import java.util.Scanner;

public class _26_SpaceBoxing {
    /*
    Please enter your current earth weight: 128
I have information for the following planets:
   1. Venus   2. Mars    3. Jupiter   4. Saturn  5. Uranus  6. Neptune
Which planet are you visiting? 2
Your weight would be 49.92 pounds on that planet.
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void calculateWeight(double weight) {
        HashMap<Integer, String[]> spaceInfo = new HashMap<>();
        spaceInfo.put(1, new String[]{"Venus", "0.78"});
        spaceInfo.put(2, new String[]{"Mars", "0.39"});
        spaceInfo.put(3, new String[]{"Jupiter", "2.65"});
        spaceInfo.put(4, new String[]{"Saturn", "1.17"});
        spaceInfo.put(5, new String[]{"Uranus", "1.05"});
        spaceInfo.put(6, new String[]{"Neptune", "1.23"});
        System.out.println("I have information for the following planets: ");
        for (Integer i : spaceInfo.keySet()) {
            System.out.print("  " + i + ". " + spaceInfo.get(i)[0]);
        }
        System.out.println();
        System.out.print("Planet you that you are visiting (enter number): ");
        int planet = scanner.nextInt();
        double newWeight = weight * Double.parseDouble(spaceInfo.get(planet)[1]);
        System.out.print("Your weight is " + newWeight + " pounds on " + spaceInfo.get(planet)[0] + ".");
    }

    public static void main(String[] args) {
        System.out.print("Please enter your current earth weight: ");
        double weight = scanner.nextDouble();
        calculateWeight(weight);
    }

}
