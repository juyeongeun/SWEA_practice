import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);
            int[][] map = new int[N][N];
            String[] xydol = new String[3];
            int[] check = new int[2];

            // 초기 흑백 돌 위치
            map[N / 2 - 1][N / 2 - 1] = 2;
            map[N / 2][N / 2] = 2;
            map[N / 2][N / 2 - 1] = 1;
            map[N / 2 - 1][N / 2] = 1;

            for (int i = 0; i < M; i++) {
                xydol = br.readLine().split(" ");
                int x = Integer.parseInt(xydol[0]) - 1;
                int y = Integer.parseInt(xydol[1]) - 1;
                int dol = Integer.parseInt(xydol[2]);

                map[x][y] = dol;

                for (int ix = -1; ix <= 1; ix++) {
                    for (int iy = -1; iy <= 1; iy++) {
                        if (ix == 0 && iy == 0) {
                            continue;
                        }
                        int xx = x + ix;
                        int yy = y + iy;

                        boolean ch = false;
                        while (xx >= 0 && xx < N && yy >= 0 && yy < N && map[xx][yy] != 0) {
                            if (map[xx][yy] == dol) {
                                ch = true;
                                break;
                            }
                            xx += ix;
                            yy += iy;
                        }
                        while (ch) {
                            if (xx == x && yy == y) {
                                break;
                            }
                            map[xx][yy] = dol;
                            xx -= ix;
                            yy -= iy;
                        }
                    }
                }

            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (map[i][j] == 1) {
                        check[0]++;
                    } else if (map[i][j] == 2) {
                        check[1]++;
                    }
                }
            }

            System.out.println("#" + test + " " + check[0] + " " + check[1]);
        }
    }
}
