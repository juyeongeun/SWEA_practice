import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int TC = 1; TC <= 10; TC++) {
            int N = sc.nextInt();
            LinkedList<Integer> list = new LinkedList<>();

            for (int i = 0; i < N; i++) {
                list.add(sc.nextInt());
            }

            int cmdcnt = sc.nextInt();
            int pin, cnt;

            for (int i = 0; i < cmdcnt; i++) {
                String cmd = sc.next();
                if (cmd.equals("I")) {
                    pin = sc.nextInt();
                    cnt = sc.nextInt();
                    for (int j = 0; j < cnt; j++) {
                        list.add(pin, sc.nextInt());
                        pin++;
                    }
                } else if (cmd.equals("D")) {
                    pin = sc.nextInt();
                    cnt = sc.nextInt();
                    for (int j = 0; j < cnt; j++) {
                        list.remove(pin);
                    }
                } else {
                    cnt = sc.nextInt();
                    for (int j = 0; j < cnt; j++) {
                        list.add(sc.nextInt());
                    }
                }
            }

            System.out.print("#" + TC + " ");
            for (int i = 0; i < 10; i++) {
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }
    }
}