import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int TC=1; TC<=T;TC++){
            int people = Integer.parseInt(br.readLine());
            String[] money = br.readLine().split(" ");
            int avg = 0,cnt=0;

            for(int i=0; i<people; i++){
                avg+=Integer.parseInt(money[i]);
            }
            avg/=people;

            for(int i=0; i<people; i++){
                if(Integer.parseInt(money[i])<=avg){
                    cnt++;
                }
            }
            bw.write("#"+TC+" "+cnt+"\n");
            bw.flush();
        }
        bw.close();
    }
}
