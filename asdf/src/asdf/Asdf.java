package asdf;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Asdf {
    static int N, M, K;
    static boolean[][] map;
    static int[] dy = {-1, 0, 1, 0}, dx = {0, 1, 0, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        
       for(int T=1; T<=tc; T++) {
    	   StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            map = new boolean[N][M];
            int ret = 0;

            for(int i = 0; i < K; i++) {
            	st = new StringTokenizer(br.readLine());
                int x =Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x] = true;
            }

            for(int y = 0; y < N; y++)
                for(int x = 0; x < M; x++)
                    if(map[y][x]) {
                        bfs(y, x);
                        ret++;
                    }
            System.out.println(ret);
        }
    }

    public static void bfs(int y, int x) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{y, x});
        map[y][x] = false;

        while(!q.isEmpty()) {
            int[] cur = q.poll();

            for(int d = 0; d < 4; d++) {
                int ny = cur[0] + dy[d];
                int nx = cur[1] + dx[d];
                if(ny >= 0 && nx >= 0 && ny < N && nx < M && map[ny][nx]) {
                    q.add(new int[]{ny, nx});
                    map[ny][nx] = false;
                }
            }
        }
    }
}