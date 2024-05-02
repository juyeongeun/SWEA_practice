import java.util.*;
import java.io.*;

public class App {
    static int[] time;
    static int fish;
    static int count;
    static int N, M, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken()); // 손님 수
            M = Integer.parseInt(st.nextToken()); // 붕어빵 만드는 시간
            K = Integer.parseInt(st.nextToken()); // 한 번에 만들어지는 붕어빵 갯수
            String ch="Possible";

            time = new int[N];
            fish = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < time.length; i++)
                time[i] = Integer.parseInt(st.nextToken());

            Arrays.sort(time);

            for (int i = 0; i < time.length; i++) {
                fish = (time[i] / M) * K; // 손님이 온 시간이 됐을 때 붕어빵 몇개 만들어졌는지
                if (fish - i - 1 < 0) { // i는 앞에 손님들의 수
                    ch="Impossible";
                   break;
                }
            }
            System.out.println("#" + t + " "+ch);
        }
    }
}
