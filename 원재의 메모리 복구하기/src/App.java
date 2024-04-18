import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int X = 1; X <= T; X++) {
            String str = sc.next();
            int[] binary = new int[str.length()];
            int[] err = new int[str.length()];
            int cnt = 0;

            for (int i = 0; i < str.length(); i++) {
                binary[i] = str.charAt(i) - '0';
            }

            for (int i = 0; i < binary.length; i++) {
                if (binary[i] != err[i]) {
                    cnt++;
                    for (int k = i; k < err.length; k++) {
                        if(err[k]==0){
                            err[k] = 1;
                        }
                        else{
                            err[k]=0;
                        }
                    }
                }
            }
            System.out.println("#" + X + " " + cnt);
        }
    }
}
