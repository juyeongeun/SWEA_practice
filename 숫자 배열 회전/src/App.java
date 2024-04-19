import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int TC = 1; TC <= T; TC++) {
            int n = sc.nextInt();
            int[][] map = new int[n][n];
            int col = 0, row = 0;
            int rmax = n - 1;
            int cmax = n - 1;

            // 숫자 배열 입력
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            System.out.println("#"+TC);

            for(int k=0; k<n; k++) {
                // 90
                for (int i = n-1; i >= 0; i--) {
                    System.out.print(map[i][col]);
                }
                System.out.print(" ");
                col++;

                // 180
                for (int i = n-1; i >= 0; i--) {
                    System.out.print(map[rmax][i]);
                }
                System.out.print(" ");
                rmax--;

                // 270
                for (int i = row; i < n; i++) {
                    System.out.print(map[i][cmax]);
                }
                System.out.println("");
                cmax--;
            }
            System.out.println("끝");
        }
    }
}
