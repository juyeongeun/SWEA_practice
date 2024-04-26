import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T= Integer.parseInt(br.readLine());

        for(int test_case=1; test_case<=T; test_case++){
            String str = br.readLine();
            int num=0;

            if(str.equals("MON")){
                num=6;
            }else if(str.equals("TUE")){
                num=5;
            }else if(str.equals("WED")){
                num=4;
            }else if(str.equals("THU")){
                num=3;
            }else if(str.equals("FRI")){
                num=2;
            }else if(str.equals("SAT")){
                num=1;
            }else if(str.equals("SUN")){
                num=7;                
            }

            bw.write("#"+test_case+" "+num+"\n");
            bw.flush();
        }
        bw.close();
    }
}
