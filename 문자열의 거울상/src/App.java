import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T=Integer.parseInt(br.readLine());

        for(int TC=1; TC<=T; TC++){
            String[] change = br.readLine().split("");
            
            for(int i=0; i<change.length; i++){
                if(change[i].equals("b")){
                    change[i]="d";
                }
                else if(change[i].equals("d")){
                    change[i]="b";
                }
                else if(change[i].equals("p")){
                    change[i]="q";
                }
                else if(change[i].equals("q")){
                    change[i]="p";
                }
            }
            
            System.out.print("#"+TC+" ");

            for(int i=change.length-1; i>=0; i--){
                System.out.print(change[i]);
            }
            System.out.println();
        }
    }
}
