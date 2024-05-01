import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int test_case=1; test_case<=T; test_case++){
            int up, down, maxup=0, maxdown=0;
            int cnt = Integer.parseInt(br.readLine());
            int[] map = new int[cnt];
            String st = br.readLine();
            StringTokenizer st1 = new StringTokenizer(st);

            for(int i=0; i<cnt; i++){
                map[i]=Integer.parseInt(st1.nextToken());
            }

            for(int i=0; i<cnt-1; i++){
                if(map[i]>map[i+1]){
                    down=map[i]-map[i+1];
                    if(down>maxdown){
                        maxdown=down;
                    }
                }
                else{
                    up=map[i+1]-map[i];
                    if(up>maxup){
                        maxup=up;
                    }
                }
            }
            bw.write("#"+test_case+" "+maxup+" "+maxdown+"\n");
            bw.flush();
        }
        bw.close();
    }
}
