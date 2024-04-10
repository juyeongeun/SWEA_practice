import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int TC = 1; TC <= T; TC++) {
            int[] arr = new int[10];
            int max = 0, min = 10000;
            int sum = 0;
            double avg = 0.0;

            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
                sum += arr[i];
            }
            avg= (double)(sum - min - max) / 8;
            System.out.println("#" + TC + " " + String.format("%.0f",avg));
        }
    }
}
