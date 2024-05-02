import java.util.Scanner;

public class App {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = 10;

        for (int test_case = 1; test_case <= T; test_case++) {
            String TC = sc.next();
            String s_tc = sc.next();
            String[][] arr_s = new String[100][100];

            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    arr_s[j][i] = s_tc.substring(j, j + 1);
                }
                if (i < s_tc.length() - 1) {
                    s_tc = sc.next();
                }
            }
            for (int maxLen = 100; maxLen > 0; maxLen--) {
                if (find(arr_s, maxLen)) {
                    System.out.println("#" + test_case + " " + maxLen);
                    break;
                }
            }
        }
    }

    public static boolean find(String[][] arr_s, int maxLen) {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j <= 100 - maxLen; j++) {
                if (findX(arr_s, i, j, maxLen) | findY(arr_s, i, j, maxLen)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean findX(String[][] arr_s, int i, int j, int maxLen) {
        for (int k = 0; k < maxLen / 2; k++) {
            if (!arr_s[i][j + k].equals(arr_s[i][j - (k + 1) + maxLen])) {
                return false;
            }
        }
        return true;
    }

    public static boolean findY(String[][] arr_s, int i, int j, int maxLen) {
        for (int k = 0; k < maxLen / 2; k++) {
            if (!arr_s[j + k][i].equals(arr_s[j - (k + 1) + maxLen][i])) {
                return false;
            }
        }
        return true;
    }
}