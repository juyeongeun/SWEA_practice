import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[][] arr;

        for (int TC = 1; TC <= T; TC++) {
            int N = sc.nextInt();
            arr = new int[N][N];
            int num=1;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (j == 0) {
                        arr[i][j] = 1;
                    } else if (j == N-1) {
                        arr[i][j] = 1;
                    } else if(i!=0) {
                        arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                    }
                }
            }

            System.out.println("#"+TC);

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < num; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
                num++;
            }
        }
    }
}
