import java.util.Random;

public class RollDie {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(6) + 1;
        System.out.println(num);
    }
}
