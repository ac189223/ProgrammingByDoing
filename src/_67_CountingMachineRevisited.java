import java.util.Random;

public class _67_CountingMachineRevisited {
    public static void main(String[] args) {
        Random random = new Random();
        int start = random.nextInt(15) + 1;
        int end = random.nextInt(100) + start + 1;
        int step = random.nextInt(end - start - 1) + 1;

        System.out.println("Counting from " + start + " to " + end + " by " + step + ":");
        while (start <= end) {
            System.out.print(start + ", ");
            start += step;
        }
    }
}
