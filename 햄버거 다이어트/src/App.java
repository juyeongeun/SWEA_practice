import java.util.Scanner;

public class App {
    public static int N;
    public static int L;
    public static int[][] taste;
    public static int max;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int TC = 1; TC <= T; TC++) {
            N = sc.nextInt(); // 재료 수
            L = sc.nextInt(); // 제한 칼로리
            taste = new int[N][2];
            max=0;

            for (int i = 0; i < N; i++) {
                taste[i][0] = sc.nextInt();
                taste[i][1] = sc.nextInt();
            }

            hamburger(0,0,0);
            
            System.out.println("#" + TC + " " + max);

        }
    }
    public static void hamburger(int idx, int score, int kcal){
        if(idx==N){
            if(kcal <= L && score > max){
                max=score;
            }
            return;
        }

        //현재 재료를 선택했을 때
        hamburger(idx+1, score+taste[idx][0], kcal+taste[idx][1]);

        // 현재 재료를 선택하지 않았을 때
        hamburger(idx+1, score, kcal);
    }
}