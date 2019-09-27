import java.util.ArrayList;
import java.util.Random;

public class _145_HowManyTimes {
    private ArrayList<Integer> numbers;

    public _145_HowManyTimes() { this.setNumbers(new ArrayList<>()); }
    public ArrayList<Integer> getNumbers() { return numbers; }
    public void setNumbers(ArrayList<Integer> numbers) { this.numbers = numbers; }

    public static void main(String[] args) {
        _145_HowManyTimes hmt = new _145_HowManyTimes();
        Random random = new Random();
        for (int i = 0; i < 100; i++)
            hmt.numbers.add(random.nextInt(20) + 1);
        Integer searchFor = random.nextInt(20) + 1;
        hmt.numbers.forEach(number -> System.out.print(number));
        System.out.println();
        hmt.numbers.stream()
                .filter(number -> number == searchFor)
                .forEach(number -> System.out.print(number));
        System.out.println();
        System.out.println(hmt.numbers.stream()
                .filter(number -> number == searchFor)
                .count());
    }
}
