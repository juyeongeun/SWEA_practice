import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int TC = 1; TC <= T; TC++) {
            int N = Integer.parseInt(br.readLine());
            String[] num = br.readLine().split(" ");
            int result = 0;
            int mul, max = -1;
            String str;

            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    result=0;
                    mul = Integer.parseInt(num[i]) * Integer.parseInt(num[j]); // 두자리 곱한 수
                    str = String.valueOf(mul); // mul 문자형 변경

                    for (int k = 0; k < str.length()-1; k++) {
                        if (str.charAt(k)-'0' <= str.charAt(k+1)-'0') { // 각 자리수 비교
                            result++;
                        }
                    }
                    if (result == str.length() - 1) { // result값이 str길이-1 값과 같으면 곱한 수의 max 구하기
                        max = Math.max(max, mul);
                    }
                }
            }
            System.out.println("#" + TC + " " + max);
        }
    }
}