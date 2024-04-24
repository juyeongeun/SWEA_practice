import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int num = sc.nextInt();
            int a = 0, b = 0, c = 0, d = 0, e = 0;

            while (num % 2 == 0) {
                a++;
                num = num / 2;
            }
            while (num % 3 == 0) {
                num = num / 3;
                b++;
            }
            while (num % 5 == 0) {
                num = num / 5;
                c++;
            }
            while (num % 7 == 0) {
                num = num / 7;
                d++;
            }
            while (num % 11 == 0) {
                num = num / 11;
                e++;
            }
            System.out.println("#" + test_case + " " + a + " " + b + " " + c + " " + d + " " + e);
        }
    }
}
