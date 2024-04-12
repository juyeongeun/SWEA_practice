import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int TC = 1; TC <= T; TC++) {
            int N = sc.nextInt(); // 단어판 크기
            int K = sc.nextInt(); // 단어 길이
            int[][] map = new int[N][N]; // 단어판
            int word = 0; // 들어갈 수 있는 단어 개수

            // 단어판 입력 받기
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            // 가로 방향 확인
            for (int i = 0; i < N; i++) {
                int count = 0; // 연속하는 1의 개수

                for (int j = 0; j < N; j++) {
                    if (map[i][j] == 1) {
                        count++;
                    } else { // map[i][j] ==0 인 경우
                        if (count == K) { // 연속하는 1의 개수가 K인 경우
                            word++;
                        }
                        count = 0; // 연속하는 1의 개수 초기화
                    }

                    // 행의 마지막에서도 검사
                    if (j == N - 1 && count == K) {
                        word++;
                    }
                }
            }

            // 세로 방향 확인
            for (int j = 0; j < N; j++) {
                int count = 0; // 연속하는 1의 개수

                for (int i = 0; i < N; i++) {
                    if (map[i][j] == 1) {
                        count++;
                    } else {
                        if (count == K) { // 연속하는 1의 개수가 K인 경우
                            word++;
                        }
                        count = 0; // 연속하는 1의 개수 초기화
                    }

                    // 열의 마지막에서도 검사
                    if (i == N - 1 && count == K) {
                        word++;
                    }
                }
            }

            System.out.println("#" + TC + " " + word);
        }
    }
}
