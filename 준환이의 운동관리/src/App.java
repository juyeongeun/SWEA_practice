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
            String[] exercise = str.split(" ");
            int mins;

            if(Integer.parseInt(exercise[2])>Integer.parseInt(exercise[1])){
                bw.write("#"+test_case+" -1\n");
            }
            else if(Integer.parseInt(exercise[2])>Integer.parseInt(exercise[0])){
                bw.write("#"+test_case+" 0\n");
            }
            else{
                mins=Integer.parseInt(exercise[0])-Integer.parseInt(exercise[2]);
                bw.write("#"+test_case+" "+mins+"\n");
            }
            bw.flush();
        }
        bw.close();
    }
}
