package boj_2667;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main { // 아파트 단지 나누기
	static int n, sum, cnt;
	static List<Integer> sb;
	static int[][] map;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };
	static boolean[][] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		int[][] copy = new int[n][n];
		sum = 0;
		sb=new ArrayList<>();
		visited = new boolean[n][n];
		cnt = 0;

		for (int i = 0; i < n; i++) {
			String[] s = br.readLine().split("");
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(s[j]);
				copy[i][j] = Integer.parseInt(s[j]);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 1) {
					check(i, j);
					sum++;
					sb.add(cnt);
				}
			}
		}
		Collections.sort(sb);
		System.out.println(sum);
		
		for(int i=0; i<sb.size(); i++) {
			System.out.println(sb.get(i));
		}
	}

	public static void check(int y, int x) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { y, x });
		map[y][x]=0;
		cnt=1;
		
		while (!q.isEmpty()) {
			int now[] = q.poll();

			for (int i = 0; i < 4; i++) {
				int nx = now[1] + dx[i];
				int ny = now[0] + dy[i];

				if (nx < 0 || nx >= n || ny < 0 || ny >= n) {
					continue;
				}
				if (visited[ny][nx] || map[ny][nx] == 0) {
					continue;
				}

				q.add(new int[] { ny, nx });
				cnt++;
				visited[ny][nx] = true;
				map[ny][nx]=0;
			}
		}
	}

}
