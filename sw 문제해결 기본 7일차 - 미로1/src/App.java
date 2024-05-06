import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class App{
    static int ans, arr[][];
    static int dy[] = {0, 1, 0, -1}, dx[] = {1, 0, -1, 0};
    static int startY, startX, endY, endX;
    static boolean check[][];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int tc=1; tc<=10; tc++) {
            int T = Integer.parseInt(br.readLine());
            arr = new int[16][16];
            check = new boolean[16][16];

            for(int i=0; i<16; i++) {
                String input = br.readLine();

                for(int j=0; j<16; j++) {
                    int num = input.charAt(j) - '0';
                    arr[i][j] = num;

                    if(num == 1) check[i][j] = true;

                    if(num == 2) {
                        startY = i;
                        startX = j;
                    }
                    if(num == 3) {
                        endY = i;
                        endX = j;
                    }
                }
            }
            ans = 0;

            if(dfs(startY, startX)) // 시작 지점에서 DFS 실행
                ans = 1;

            sb.append("#" + T + " " + ans + "\n");
        }
        System.out.print(sb);
    }

    public static boolean dfs(int startY, int startX) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{startY, startX}); // 시작 지점을 스택에 추가

        while(!stack.isEmpty()) {
            int[] current = stack.pop();
            int y = current[0];
            int x = current[1];

            check[y][x] = true; // 방문한 노드 표시

            if(y == endY && x == endX) // 도착 지점에 도달하면 true 반환
                return true;

            for(int i=0; i<4; i++) {
                int nextY = y + dy[i];
                int nextX = x + dx[i];

                if(nextY >= 0 && nextY < 16 && nextX >= 0 && nextX < 16 && arr[nextY][nextX] != 1 && !check[nextY][nextX]) {
                    stack.push(new int[]{nextY, nextX}); // 인접한 노드를 스택에 추가
                    check[nextY][nextX] = true; // 방문한 노드 표시
                }
            }
        }
        return false; // 도착 지점에 도달하지 못한 경우 false 반환
    }
}