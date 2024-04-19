import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int TC = 1; TC <= T; TC++) {
            int n = sc.nextInt();
            int[][] map = new int[n][n]; // 숫자 배열판
            int col = 0, row = 0; //행, 열
            int rmax = n - 1, cmax = n - 1; // 행, 열 최대값

            // 숫자 배열 입력
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            System.out.println("#"+TC);

            for(int k=0; k<n; k++) {
                // 90도
                for (int i = n-1; i >= 0; i--) { //col열에 있는 마지막 행부터 출력
                    System.out.print(map[i][col]);
                }
                System.out.print(" ");
                col++; //col 증가

                // 180
                for (int i = n-1; i >= 0; i--) { // rmax행의 마지막 열부터 출력
                    System.out.print(map[rmax][i]);
                }
                System.out.print(" ");
                rmax--; //rmax 감소

                // 270
                for (int i = row; i < n; i++) { //cmax열의 처음 행부터 출력
                    System.out.print(map[i][cmax]);
                }
                System.out.println("");
                cmax--; //cmax 감소
            }
        }
    }
}
