import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int test_case=1; test_case<=T; test_case++){
            int student = Integer.parseInt(br.readLine());
            int mok=student/3;

            if(mok==0){
                bw.write("#"+test_case+" 0\n");
            }
            else{
                bw.write("#"+test_case+" "+mok+"\n");
            }
            bw.flush();
        }
        bw.close();
    }
}
