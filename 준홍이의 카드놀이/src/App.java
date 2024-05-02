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
            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);
            int max = Integer.MIN_VALUE;
            int[] map = new int[N + M - 1];
            StringBuilder sb = new StringBuilder();

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    map[i + j - 2]++;
                }
            }

            for (int i = 0; i < map.length; i++) {
                if (map[i] > max) {
                    max = map[i];
                    sb.delete(0, sb.length());
                    sb.append(i + 2 + " ");
                } else if (map[i] == max) {
                    sb.append(i + 2 + " ");
                }
            }

            bw.write("#" + TC + " " + sb + "\n");
            bw.flush();
        }
        bw.close();
    }
}
