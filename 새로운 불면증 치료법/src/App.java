import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int num = sc.nextInt();
            boolean[] check = new boolean[10];
            int cnt = 0, result = 0;
            String chresult;
            int sum = 0;

            while (sum < 10) {
                sum=0;
                cnt++;
                result = num * cnt;
                chresult = String.valueOf(result);

                for (int i = 0; i < chresult.length(); i++) {
                    check[chresult.charAt(i) - '0'] = true;
                }

                for (int i = 0; i < 10; i++) {
                    if (check[i] == true) {
                        sum++;
                    }
                }
            }
            System.out.println("#" + test_case + " " + result);
        }
    }
}
