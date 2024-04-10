import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int TC = 1; TC <= T; TC++) {
            int cnt = 1;
            int sum = 0;
            int num = sc.nextInt();

            for (int i = 0; i < num; i++) {
                if (i % 2 == 0) {
                    sum = sum + cnt;
                    cnt++;
                } else {
                    sum = sum - cnt;
                    cnt++;
                }
            }
            System.out.println("#" + TC + " " + sum);
        }
    }
}
