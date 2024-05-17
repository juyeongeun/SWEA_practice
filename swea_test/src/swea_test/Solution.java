package swea_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution {

	public static int dx[] = { 1, -1, 0, 0 };
	public static int dy[] = { 0, 0, 1, -1 };
	public static int[][] map;
	public static boolean[][] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int TC = 1; TC <= 10; TC++) {
			int num = Integer.parseInt(br.readLine());
			map = new int[100][100];
			visited = new boolean[100][100];
			int m = 0,n =0;

			for (int i = 0; i < 100; i++) {
				String[] str = br.readLine().split("");
				for (int j = 0; j < 100; j++) {
					map[i][j] = Integer.parseInt(str[j]);
					if(map[i][j]==2) {
						m=i;
						n=j;
					}
				}
			}

			System.out.println("#" + num + " " + dfs(m, n));
		}
	}

	public static int dfs(int x, int y) {
		Stack<int[]> s = new Stack<>();
		s.push(new int[] { 1, 1 });
		visited[1][1]=true;

		while (!s.isEmpty()) {
			int now[] = s.pop();
			for(int i=0; i<4; i++) {
				int nextX = now[0]+dx[i];
				int nextY = now[1]+dy[i];
				
				if(nextX>=100||nextY>=100||nextX<0||nextY<0) {
					continue;
				}
				if(visited[nextX][nextY]==true || map[nextX][nextY]==1) {
					continue;
				}
				if(map[nextX][nextY]==3) {
					return 1;
				}
				visited[nextX][nextY]=true;
				s.push(new int[] {nextX, nextY});
			}
		}
		return 0;
	}
}