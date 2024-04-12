import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int TC = 1; TC <= T; TC++) {

            int[][] map = new int[9][9];
            int result=1;

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            // 가로 검사
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    for (int k = j + 1; k< 9; k++) {
                        if (map[i][j] == map[i][k]) {
                            result=0;
                        } 
                    }
                }
            }

            // 세로 검사
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    for (int k = j + 1; k< 9; k++) {
                        if (map[j][i] == map[k][i]) {
                            result=0;
                        } 
                    }
                }
            }

            int rpuzzle = 3;
            int cpuzzle = 3;
            int col = 0;
            int row = 0;

            // 3*3 구역 검사
            while (rpuzzle <= 9) {
                int[] Rmap = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
                for (int i = row; i < rpuzzle; i++) {
                    for (int j = col; j < cpuzzle; j++) {
                        for (int k = 0; k < 9; k++) {
                            if (map[i][j] == Rmap[k]) {
                                Rmap[k] = 0;
                            }
                        }
                    }
                }
                for (int i = 0; i < 9; i++) {
                    if (Rmap[i] != 0) {
                        result=0;
                    }
                }
                if (cpuzzle < 9) {
                    col += 3;
                    cpuzzle += 3;
                } else {
                    row += 3;
                    rpuzzle += 3;
                    col = 0;
                    cpuzzle = 3;
                }
            }

            System.out.println("#" + TC + " "+result);
        }
    }
}
