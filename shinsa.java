import java.util.Arrays;
import java.util.Scanner;

public class shinsa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int totalCount = 5 * n;
        int[] scores = new int[totalCount];

        for (int i = 0; i < totalCount; i++) {
            scores[i] = sc.nextInt();
        }

        // 昇順にソート
        Arrays.sort(scores);

        // 下位 N 個（0 〜 n-1）と上位 N 個（4n 〜 5n-1）を除いた中央の 3N 個を合計
        long sum = 0;
        for (int i = n; i < 4 * n; i++) {
            sum += scores[i];
        }

       
        double average = (double) sum / (3* n);
        System.out.printf("%.15f\n", average);

        sc.close();
    }
}