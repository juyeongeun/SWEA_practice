import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int TC=1; TC<=T; TC++){
            int sum=0, avg=0;
            String[] score = br.readLine().split(" ");

            for(int i=0; i<5; i++){
                if(Integer.parseInt(score[i])<40){
                    sum+=40;
                }
                else{
                    sum+=Integer.parseInt(score[i]);
                }
            }

            avg=sum/5;

            System.out.println("#"+TC+" "+avg);
        }
    }
}
