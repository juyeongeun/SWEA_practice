import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int TC = 1; TC <= T; TC++) {
            String[] NM = br.readLine().split(" "); // NM 입력
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);
            int[] weigh = new int[N];
            int result = -1, sum = 0;
            String[] w = br.readLine().split(" "); // 각각의 무게 입력

            for (int i = 0; i < N; i++) { // 무게 저장
                weigh[i] = Integer.parseInt(w[i]);
            }

            for (int i = 0; i < N - 1; i++) { // 마지막 요소 전까지 반복
                int one = weigh[i];
                for (int j = i + 1; j < N; j++) { // i 다음 요소부터 시작 (이전꺼는 이미 비교했기 때문에 처음부터 할 필요 없음)
                    int two = weigh[j];
                    sum = one + two; // 두 개만 합치면 되니까 다른 연산 필요 없음
                    if (sum <= M) { // M 무게와 같거나 작으면
                        if (sum > result) { // 결과값보다 크다면 결과값 수정
                            result = sum;
                        }
                    }
                }
            }

            System.out.println("#" + TC + " " + result);
        }
    }
}
