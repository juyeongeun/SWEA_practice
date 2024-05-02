import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o'
                        && str.charAt(i) != 'u') {
                    sb.append(str.charAt(i));
                }
            }
            bw.write("#" + test_case + " " + sb + "\n");
            bw.flush();
        }
        bw.close();
    }
}
