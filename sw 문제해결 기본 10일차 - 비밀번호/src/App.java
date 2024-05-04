import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int test = 1; test <= 10; test++) {
            StringBuffer pw = new StringBuffer(); 
            pw.append(br.readLine());// 입력받기
            for (int i = 0; i < pw.length(); i++) {
                if (pw.charAt(i) == ' ') { // 공백 찾으면 공백까지 제거 
                    pw.delete(0, i + 1); // 0부터 i+1 전까지라 i+1은 포함 안됨
                    break;
                }
            }

            int idx = pw.length();
            for (int j = 0; j < idx / 2; j++) { // 2개씩 비교하므로 pw 길이의 반만 반복
                for (int i = 0; i < pw.length() - 1; i++) { // pw 전부 반복하며 겹치는 숫자 찾기
                    if (pw.charAt(i) == pw.charAt(i + 1)) {
                        pw.delete(i, i + 2); // i+2는 포함 안됨
                    }
                }
            }

            System.out.println("#" + test + " " + pw);
        }
    }
}
