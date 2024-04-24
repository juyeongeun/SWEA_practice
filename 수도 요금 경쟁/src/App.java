import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int P= sc.nextInt(), Q= sc.nextInt(), R= sc.nextInt(), S= sc.nextInt(), W = sc.nextInt();
            int sum = 0, min = Integer.MAX_VALUE;

            // A회사
            sum = P * W;
            min = sum;

            // B회사
            if (W < R) {
                sum = Q;
            } else {
                W = W - R;
                sum = Q + W * S;
            }
            min = Math.min(min, sum);

            System.out.println("#" + test_case + " " + min);
        }
    }
}
