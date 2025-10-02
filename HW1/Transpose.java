import java.util.Scanner;
public class Transpose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n;i++) {
            for (int j = 0; j < n;j++) {
                a[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < n;i++) {
            for (int j = i + 1; j < n;j++) {
                int tmp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = tmp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
