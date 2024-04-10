import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int TC = 1; TC <= T; TC++) {
            int max = 0;
            int sum = 0;
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] bugs = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    bugs[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i <= N - M; i++) {
                for (int j = 0; j <= N - M; j++) {
                    sum = 0;
                    for (int k = 0; k < M; k++) {
                        for (int r = 0; r < M; r++) {
                            sum += bugs[i + k][j + r];
                        }
                    }
                    if (sum >= max) {
                        max = sum;
                    }
                }
            }
            System.out.println("#"+TC+" " +max);
        }
    }
}
