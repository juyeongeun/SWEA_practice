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
            int len = str.length();
            int a=1, b=1; // 루트가 나타내는 수 a/b

            for(int i=0; i<len; i++){
                if(str.charAt(i)=='L'){
                    b+=a; // 왼쪽은 a/a+b
                }
                else{
                   a+=b; // 오른쪽은 a+b/b
                }
            }
            bw.write("#"+test_case+" "+a+" "+b+"\n");
            bw.flush();
        }
        bw.close();
    }
}
