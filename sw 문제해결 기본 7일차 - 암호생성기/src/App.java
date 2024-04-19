import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int TC = 1; TC <= 1; TC++) {

            Boolean check = true;
            List<Integer> make = new ArrayList<Integer>();

            int tmp = sc.nextInt();

            // 숫자 입력
            for (int i = 0; i < 8; i++) {
                make.add(sc.nextInt());
            }

            System.out.print("#" + TC + " ");

            int ch = 1;
            while (check) {
                if (ch == 6) {
                    ch = 1;
                }

                if (make.get(0) <= 0 || make.get(0) - ch <= 0) {
                    make.set(0, 0);
                    int num = make.get(0);
                    make.remove(0);
                    make.add(num);

                    for (int j = 0; j < 8; j++) {
                        System.out.print(make.get(j) + " ");
                        check = false;
                    }
                } else {
                    int num = make.get(0) - ch;
                    make.remove(0);
                    make.add(num);
                    ch++;
                }
            }
            System.out.println("");
        }
    }
}
