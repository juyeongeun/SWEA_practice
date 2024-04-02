import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        int num[][] = new int[T][10];
        int sum;

        // 숫자 입력받기
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 10; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        for (int test_case = 1; test_case <= T; test_case++) {
            sum = 0;
            for (int j = 0; j < 10; j++) {
                if (num[test_case-1][j] % 2 != 0) {
                    sum = sum + num[test_case-1][j];
                }
            }
            System.out.println("#"+test_case+" "+sum);
        }

    }
}
