public class FivePerLine {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 1000; i <= 2000;i++) {
            System.out.print(i + " ");
            ++cnt;
            if (cnt % 5 == 0) {
                System.out.println();
            }
        }
    }
}
