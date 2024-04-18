import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); //테스트 케이스 입력

        for (int test_case = 1; test_case <= T; test_case++) {
            int M = sc.nextInt(); // 농장 크기 입력
            String[] str = new String[M]; // 농작물 수익
            int map[][] = new int[M][M]; // 정수형 농작물 수익
            int sum = 0; //수익

            for (int i = 0; i < M; i++) { // 농작물 수익 입력
                str[i] = sc.next();
            }

            for (int i = 0; i < M; i++) { // 정수형 저장
                for (int j = 0; j < M; j++) {
                    map[i][j] = str[i].charAt(j) - '0';
                }
            }

            int cnt = 1; //농작물 개수 정하기
            int start_idx = M / 2; // 농작물 처음 시작점 정하기
            for (int i = 0; i < M; i++) {
                // 시작점 - 농작물 개수/2 ; 시작점 + 농작물 개수/2
                for (int j = start_idx - cnt / 2; j <= start_idx + cnt / 2; j++) {
                    sum += map[i][j];
                }
                if (i < start_idx) {
                    cnt += 2;

                } else {
                    cnt -= 2;
                }
            }
            System.out.println("#" + test_case + " " + sum);
        }
    }
}
