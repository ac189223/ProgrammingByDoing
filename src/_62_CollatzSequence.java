import java.util.Scanner;

public class _62_CollatzSequence {
/*
Take any natural number n.
- If n is even, divide it by 2 to get n / 2.
- If n is odd, multiply it by 3 and add 1 to get 3n + 1.
- Repeat the process indefinitely.
 */
    private static String repeat(String lineToRepeat, int howMany) {
        String line = "";
        for (int i = 0; i < howMany; i++) {
            line += lineToRepeat;
        }
        return line;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any natural number: ");
        int num = scanner.nextInt();
        if (num <= 0)
            System.out.print("This is not a valid number. Enter natural one: ");
        int count = 0;
        while (num != 1) {
            System.out.print(num + repeat(" ", 10 - String.valueOf(num).length()));
            if (num % 2 == 0)
                num = num / 2;
            else
                num = 3 * num + 1;
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
//        System.out.print(num + " ".repeat(10 - String.valueOf(num).length()));
        System.out.print(num + repeat(" ", 10 - String.valueOf(num).length()));
    }
}
