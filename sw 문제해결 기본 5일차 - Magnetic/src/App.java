import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int test_case = 1; test_case <= 10; test_case++) {
            int width = Integer.parseInt(br.readLine());
            String[][] map = new String[100][100];
            String check = "";
            int cnt = 0;

            for (int i = 0; i < 100; i++) {
                String st = br.readLine();
                map[i] = st.split(" ");
            }

            for (int i = 0; i < 100; i++) {
                check = "";
                for (int j = 0; j < 100; j++) {
                    // 현재 열의 자성체 상태를 가져옴
                    String currentStatus = map[j][i];

                    // 마지막 문자와 현재 추가하려는 문자를 비교하여 조건에 따라 문자열에 추가하거나 스킵함 (중복 제거)
                    if (!check.isEmpty()) { // check가 비어있지 않은 경우에만 비교 수행
                        char lastChar = check.charAt(check.length() - 1); // 마지막 문자 가져오기
                        if (currentStatus.equals("1") && lastChar != '1') {
                            check += "1"; // 추가
                        } else if (currentStatus.equals("2") && lastChar != '2') {
                            check += "2"; // 추가
                        }
                    } else { // check가 비어있는 경우 무조건 추가
                        check += currentStatus;
                    }
                }

                for (int k = 0; k < check.length() - 1; k++) { // check 문자열 비교
                    if (check.charAt(k) == '1' && check.charAt(k + 1) == '2') {
                        cnt++;
                    }

                }
            }

            bw.write("#" + test_case + " " + cnt + "\n");
            bw.flush();
        }
        bw.close();
    }
}
