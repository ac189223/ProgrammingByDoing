import java.util.ArrayList;

public class _123_NumberPuzzlesI {
    /*
    Use nested for loops to generate a list of all the pairs of positive two digit numbers whose sum is 60, and whose difference is 14.
     */
    public static void main(String[] args) {
        ArrayList<String> sumSixty = new ArrayList<>();
        ArrayList<String> diffFourteen = new ArrayList<>();
        for (int i = 10; i < 100; i++) {
            for (int j = 10; j <= i; j++) {
                if (i + j == 60)
                    if (!sumSixty.contains(i + "+" + j))
                        sumSixty.add(i + "+" + j);
                if (i - j == 14)
                    if (!diffFourteen.contains(i + "-" + j))
                        diffFourteen.add(i + "-" + j);
            }
        }
        System.out.println("Pairs of positive two digit numbers whose sum is 60:");
        print(sumSixty);
        System.out.println("\nPairs of positive two digit numbers whose difference is 14:");
        print(diffFourteen);
    }

    private static void print(ArrayList<String> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            count++;
            System.out.print(list.get(i) + ", ");
            if (count == 21) {
                System.out.println();
                count = 0;
            }
        }
    }

}
