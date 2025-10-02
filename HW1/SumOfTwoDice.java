import java.util.Random;

public class SumOfTwoDice {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(6) + 1;
        int num2 = rand.nextInt(6) + 1;
        System.out.println(num1 + num2);
    }
}
