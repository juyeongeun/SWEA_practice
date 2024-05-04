import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T=Integer.parseInt(br.readLine());

        for(int TC=1; TC<=T; TC++){
            int N=Integer.parseInt(br.readLine());
            int cnt=0;

            for(int x=-N; x<=N; x++){
                for(int y=-N; y<=N; y++){
                    if(x*x+y*y<=N*N){
                        cnt++;
                    }
                }
            }
            System.out.println("#"+TC+" "+cnt);
        }
    }
}
