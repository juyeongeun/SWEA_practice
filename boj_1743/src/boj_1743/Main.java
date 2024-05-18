package boj_1743;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m, treshc, cnt;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };
	static int[][] map;
	static boolean[][] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); // 세로
		m = Integer.parseInt(st.nextToken()); // 가로
		treshc = Integer.parseInt(st.nextToken()); // 음식물 수
		map= new int[n][m];
		visited=new boolean[n][m];
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<treshc; i++) {
			st=new StringTokenizer(br.readLine());
			int q=Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			map[q-1][p-1]=1;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j]==1) {
					check(i,j);
					max=Math.max(cnt,max);
				}
			}
		}
		System.out.println(max);
	}
	
	public static void check(int x, int y) {
			Queue<int[]> q = new LinkedList<>();
			q.add(new int[] {x,y});
			map[x][y]=0;
			cnt=1;
			
			while(!q.isEmpty()) {
				int now[] = q.poll();
				
				for(int i=0; i<4;i++) {
					int nx = now[0]+dx[i];
					int ny = now[1]+dy[i];
					
					if(nx<0||ny<0||nx>=n||ny>=m) {
						continue;
					}
					if(map[nx][ny]==0||visited[nx][ny]==true) {
						continue;
					}
					q.add(new int[] {nx, ny});
					visited[nx][ny]=true;
					map[nx][ny]=0;
					cnt++;
				}
			}
	}

}
