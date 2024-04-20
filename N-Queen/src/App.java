import java.util.Scanner;

public class App {

    public static int sum = 0;
    public static int[] chess; // index는 행, index의 값은 열 ex) chess[1]=2 1행 2열

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int TC = 1; TC <= T; TC++) {

            int N = sc.nextInt();
            chess = new int[N];
            sum = 0;

            dfs(0, N);

            System.out.println("#" + TC + " " + sum);
        }
    }

    public static void dfs(int start, int n) {
        if (start == n) { //시작점이 N까지 왔다면 정답이기 때문에 sum++
            sum++; 
            return;
        }

        for (int x = 0; x < n; x++) {

            boolean check = true;

            for (int y = 0; y < start; y++) {
                /*
                 * 이전 행에서 지금 체스를 넣고자 하는 x와 같은 열에 놓아져있으면 안됨 chess[y] == x
                 * 위 행에서 왼쪽 대각선 아래로 내려 오는 구간에 걸쳐 있으면 안됨  chess[y] + (start - y) == x
                 * 위 행에서 오른쪽 대각선 아래로 내려 오는 구간에 걸쳐 있으면 안됨 chess[y] - (start - y) == x
                 */
                if (chess[y] == x || chess[y] + (start - y) == x || chess[y] - (start - y) == x) {
                    check = false;
                    break;
                }
            }
            if (check) {
                chess[start] = x;
                dfs(start + 1, n); // 다음 줄로 넘어가기
            }
        }
    }
}
