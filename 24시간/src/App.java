import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            String hour = br.readLine();
            StringTokenizer st = new StringTokenizer(hour);
            int h = Integer.parseInt(st.nextToken());
            int h2 = Integer.parseInt(st.nextToken());

            h = h + h2;

            bw.write("#" + test_case + " " + h % 24+"\n");
            bw.flush();

        }
        bw.close();
    }
}
