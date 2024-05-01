import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int TC = 1; TC <= T; TC++) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            int[][] people = new int[N][M];
            int max = 0, cnt = 0, tmp = 0; // 1등 점수, 1등한 사람 수, 한 사람 당 푼 문제 수

            for (int i = 0; i < N; i++) {
                String[] chinput = br.readLine().split(" "); // 한 사람당 풀어낸 문제 여부
                for (int j = 0; j < M; j++) {
                    people[i][j] = Integer.parseInt(chinput[j]); // 정수형 저장
                }
            }

            // 1등한 사람 수와 맞힌 문제의 수
            for (int i = 0; i < N; i++) {
                tmp = 0;
                for (int j = 0; j < M; j++) {
                    if (people[i][j] == 1) { // 문제를 풀었다면 tmp++
                        tmp++;
                    }
                }

                if (tmp > max) { //tmp가 max보다 크면 cnt 초기화 및 max값 변경
                    max = tmp;
                    cnt = 1;
                } else if (tmp == max) { // 같다면 cnt 증가
                    cnt++;
                }
            }
            bw.write("#" + TC + " " + cnt + " " + max+"\n");
            bw.flush();
        }
        bw.close();
    }
}
