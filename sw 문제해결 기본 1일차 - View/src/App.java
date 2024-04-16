import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            int cnt = sc.nextInt();
            int[] building = new int[cnt];
            int view = 0;
            int heigh1 = 0, heigh2=0;

            for (int i = 0; i < cnt; i++) {
                building[i] = sc.nextInt();
            }

            for (int i = 2; i < cnt - 2; i++) {
                if (building[i] > building[i - 1] && building[i] > building[i - 2] && building[i] > building[i + 1]
                        && building[i] > building[i + 2]) {
                    heigh1 = Math.max(building[i + 1], building[i + 2]);
                    heigh2 = Math.max(building[i - 1], building[i - 2]);
                    heigh1=Math.max(heigh1, heigh2);
                    view += building[i] - heigh1;
                }
            }

            System.out.println("#" + test_case + " " + view);
        }
    }
}
