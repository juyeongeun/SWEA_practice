import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int TC = 1; TC <= T; TC++) {
            String[] len = br.readLine().split(" ");

            if (len[0].equals(len[1])) {
                System.out.println("#"+TC+" "+len[2]);
            }
            else if(len[0].equals(len[2])){
                System.out.println("#"+TC+" "+len[1]);
            }
            else{
                System.out.println("#"+TC+" "+len[0]);
            }

        }
    }
}
