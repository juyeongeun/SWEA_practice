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
            String str = br.readLine();
            String[] s = str.split(" ");
            int sum, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;

            for(int i=0; i<10; i++){
                sum=0;
                for(int j=0; j<s[i].length();j++){
                    sum+=s[i].charAt(j)-'0';
                }
                if(sum>max){
                    max=sum;
                }
                if(sum<min){
                    min=sum;
                }
            }
            bw.write("#"+test_case+" "+max+" "+min+"\n");
            bw.flush();
        }
        bw.close();
    }
}
