import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T= sc.nextInt();

        for(int TC=1; TC<=T; TC++){
            int H1=sc.nextInt();
            int M1=sc.nextInt();
            int H2=sc.nextInt();
            int M2=sc.nextInt();
            int TotalH=0, TotalM=0, tmp=0;

            TotalM=(M1+M2)%60;
            tmp=(M1+M2)/60;
            TotalH=H1+H2+tmp;

            if(TotalH>12){
                if(TotalH%12==0){
                    TotalH=12;
                }else{
                    TotalH=TotalH%12;
                }
            }
            
            System.out.println("#"+TC+" "+TotalH+" "+TotalM);
        }
    }
}
