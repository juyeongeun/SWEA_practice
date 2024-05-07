import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class App {

    static int[] dx = { -1, 0, 1, 0 }; // 상, 우, 하, 좌 방향을 나타내는 배열
    static int[] dy = { 0, 1, 0, -1 };
    static int[][] map; // 입력된 맵 정보를 저장하는 배열
    static boolean[][] isVisited; // 방문 여부를 나타내는 배열
    static int min, N; // 최소 복구 시간과 맵의 크기를 저장하는 변수

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 수를 입력받음

        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine()); // 맵의 크기를 입력받음
            map = new int[N][N]; // 맵 배열 초기화
            min = Integer.MAX_VALUE; // 최소 복구 시간을 초기화
            isVisited = new boolean[N][N]; // 방문 여부 배열 초기화

            // 맵 정보 입력
            for (int i = 0; i < N; i++) {
                String s = br.readLine();
                for (int j = 0; j < N; j++) {
                    map[i][j] = s.charAt(j) - '0'; // 문자를 숫자로 변환하여 맵에 저장
                }
            }

            // BFS 탐색 시작
            bfs(0, 0);

            // 결과 출력
            System.out.println("#" + tc + " " + min);
        }
    }

    public static void bfs(int x, int y) {
        // 우선순위 큐를 사용하여 최소 복구 시간을 탐색
        PriorityQueue<Pos> que = new PriorityQueue<>((a, b) -> Integer.compare(a.time, b.time));

        // 시작 위치를 큐에 추가하고 방문 표시
        que.add(new Pos(x, y, 0));
        isVisited[x][y] = true;

        // 큐가 빌 때까지 반복
        while (!que.isEmpty()) {
            Pos p = que.poll(); // 큐에서 다음 위치 정보를 가져옴

            int curX = p.x;
            int curY = p.y;
            int curT = p.time;

            // 목적지에 도착하면 최소 복구 시간을 갱신
            if (curX == N - 1 && curY == N - 1) {
                min = Math.min(min, curT);
            }

            // 현재 위치에서 이동할 수 있는 모든 방향에 대해 탐색
            for (int t = 0; t < 4; t++) {
                int nx = curX + dx[t];
                int ny = curY + dy[t];

                // 맵 범위를 벗어나거나 이미 방문한 곳은 무시
                if (nx < 0 || ny < 0 || nx >= N || ny >= N || isVisited[nx][ny]) {
                    continue;
                }

                // 새로운 위치를 큐에 추가하고 방문 표시
                int totalTime = curT + map[nx][ny];
                que.add(new Pos(nx, ny, totalTime));
                isVisited[nx][ny] = true;
            }
        }
    }

    // 위치 정보를 담는 클래스
    static class Pos {
        int x, y;
        int time; // 복구하는 데 든 시간

        Pos(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }
}