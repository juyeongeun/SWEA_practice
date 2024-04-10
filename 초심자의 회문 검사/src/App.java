import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int TC = 1; TC <= T; TC++) {
            String s = sc.next();
            String r = "";

            for (int i = s.length() - 1; i >= 0; i--) {
                r = r + s.charAt(i);
            }
            if (s.equals(r)) {
                System.out.println("#"+TC+" "+"1");
            } else {
                System.out.println("#"+TC+" "+"0");
            }
        }
    }
}
