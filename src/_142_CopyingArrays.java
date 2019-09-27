import java.util.ArrayList;
import java.util.Random;

public class _142_CopyingArrays {
    private ArrayList<Integer> numbers;

    public _142_CopyingArrays() { this.setNumbers(new ArrayList<>()); }
    public ArrayList<Integer> getNumbers() { return numbers; }
    public void setNumbers(ArrayList<Integer> numbers) { this.numbers = numbers; }

    public static void main(String[] args) {
        _142_CopyingArrays ca = new _142_CopyingArrays();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            ca.numbers.add(random.nextInt(20) + 1);
        }
        int[] tmpNumbers = new int[ca.numbers.size()];
        for (int i = 0; i < 100; i++) {
            tmpNumbers[i] = ca.numbers.get(i);
        }
        int[] temporaryNumbers = tmpNumbers.clone();
        boolean check = true;
        for (int i = 0; i < 100; i++) {
            if (tmpNumbers[i] != temporaryNumbers[i] || tmpNumbers[i] != ca.numbers.get(i))
                check = false;
        }
        if (check)
            System.out.println(";)");
    }
}
