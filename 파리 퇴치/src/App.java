import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int TC = 1; TC <= T; TC++) {
            int max = 0; // 최대값
            int sum = 0; // 파리채 크기의 합
            int N = sc.nextInt(); // 파리 배열판 크기
            int M = sc.nextInt(); // 파리채 배열판 크기
            int[][] bugs = new int[N][N]; // 파리 배열판

            // 각 칸의 파리 수 입력
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    bugs[i][j] = sc.nextInt();
                }
            }

            // N-M : 인덱스 범위 오류 막기 위해서 파리채 크기만큼 뺌
            for (int i = 0; i <= N - M; i++) {
                for (int j = 0; j <= N - M; j++) {
                    sum = 0;
                    for (int k = 0; k < M; k++) {
                        for (int r = 0; r < M; r++) {
                            // i+k, j+r : 파리 배열판 시작지점+파리채 크기
                            sum += bugs[i + k][j + r];
                        }
                    }
                    //최대값 구하기
                    if (sum >= max) {
                        max = sum;
                    }
                }
            }
            System.out.println("#"+TC+" " +max);
        }
    }
}
