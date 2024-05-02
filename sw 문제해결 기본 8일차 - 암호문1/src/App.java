import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int TC = 1; TC <= 10; TC++) {
            StringBuilder laststr = new StringBuilder(); // 최종 암호문 저장
            int len = Integer.parseInt(br.readLine()); // 원본 암호문의 길이 N
            String[] str = br.readLine().split(" "); // 원본 암호문
            int cmdcnt = Integer.parseInt(br.readLine()); // 명령어의 개수
            String[] cmdstr = br.readLine().split(" "); // 명령어
            int cnt, idx;

            for (int j = 0; j < str.length; j++) {
                laststr.append(str[j] + " ");
            }

            for (int k = 0; k < cmdstr.length; k++) {
                if (cmdstr[k].equals("I")) {
                    idx = Integer.parseInt(cmdstr[k + 1]); // 삽입 할 인덱스
                    cnt = Integer.parseInt(cmdstr[k + 2]); // 삽입 할 명령어 수

                    for (int j = k; j < k + cnt; j++) {
                        laststr.insert(idx * 7, cmdstr[j + 3] + " ");
                        idx++;
                    }
                }
            }
            bw.write("#" + TC + " ");

            for (int i = 0; i < 10 * 7; i++) {
                bw.write(laststr.charAt(i));
            }

            bw.write("\n");
            bw.flush();
        }
        bw.close();
    }
}
