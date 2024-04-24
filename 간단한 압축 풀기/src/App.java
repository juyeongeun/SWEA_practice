import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int cnt = sc.nextInt();
            String[][] doc = new String[cnt][2];
            int line = 0;

            for (int i = 0; i < cnt; i++) {
                doc[i][0] = sc.next();
                doc[i][1] = sc.next();
            }

            System.out.println("#"+test_case);

            for (int j = 0; j < cnt; j++) {
                for (int i = 0; i < Integer.parseInt(doc[j][1]); i++) {
                    if (line == 10) {
                        System.out.println();
                        line=0;
                    }
                    System.out.print(doc[j][0]);
                    line++;
                }
            }
            System.out.println();
        }
    }
}
