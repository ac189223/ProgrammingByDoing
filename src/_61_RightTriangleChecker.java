import java.util.Scanner;

public class _61_RightTriangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sides = new int[3];
        System.out.println("Enter three integers in ascending order");
        for (int i = 0; i < sides.length; i++) {
            System.out.print("Side " + (i + 1) + ": ");
            sides[i] = scanner.nextInt();
            if (i > 0 && sides[i] < sides[i - 1]) {
                System.out.println("Number cannot be smaller than the previous one (" + sides[i - 1] + "). Try again.");
                i--;
            }
        }
        if (sides[0] + sides[1] >= sides[2])
            System.out.println("You can build a triangle from these sides.");
        else
            System.out.println("You cannot build a triangle. Wrong size of sides.");
    }
}
