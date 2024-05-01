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
            String[] stdt = br.readLine().split(" "); // 전체 학생 수, 제출한 학생 수
            int student = Integer.parseInt(stdt[0]); // 전체 학생 수
            int cntstudent = Integer.parseInt(stdt[1]); // 제출한 학생 수

            String[] num = br.readLine().split(" "); // 제출한 학생의 번호
            int[] confirmnum = new int[cntstudent]; // 제출한 학생의 번호
            boolean[] all = new boolean[student];

            for (int i = 0; i < cntstudent; i++) {
                confirmnum[i] = Integer.parseInt(num[i]); // 제출한 학생 번호 int형 저장
            }

            for (int j = 0; j < cntstudent; j++) {
                all[confirmnum[j]-1] = true;
            }

            bw.write("#" + test_case + " ");
            for (int i = 0; i < student; i++) {
                if (all[i]==false) {
                    bw.write(i+1 + " ");
                }
            }
            bw.write("\n");
            bw.flush();
        }
        bw.close();
    }
}
