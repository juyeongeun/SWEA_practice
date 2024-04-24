import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int money = sc.nextInt();
            int[] extra = new int[8];
            int[] num={50000,10000,5000,1000,500,100,50,10};

            for (int i = 0; i < 8; i++) {
                extra[i]=money/num[i];
                money=money%num[i];
            }

            System.out.println("#" + test_case);
            for (int i = 0; i < 8; i++) {
                System.out.print(extra[i] + " ");
            }
            System.out.println("");
        }
    }
}
