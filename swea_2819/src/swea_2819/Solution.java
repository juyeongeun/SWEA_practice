package swea_2819;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Solution {
	public static int[] dx = { 1, -1, 0, 0 };
	public static int[] dy = { 0, 0, 1, -1 };
	public static String[][] map;
	public static HashSet<String> hs;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			map = new String[4][4];
			hs=new HashSet<>();

			for (int i = 0; i < 4; i++) {
				map[i] = br.readLine().split(" ");
			}
			
			for(int i=0; i<4; i++) {
				for(int j=0; j<4; j++) {
					dfs(i, j, 0, ""+map[i][j] );
				}
			}
			
			
			System.out.println("#"+tc+" "+hs.size());
		}
	}

	public static void dfs(int sx, int ey, int depth, String str) {
		if(depth==6) {
			hs.add(str);
			return;
		}
		for(int i=0; i<4; i++) {
			int nx=sx+dx[i];
			int ny = ey+dy[i];
			
			if(nx>=0 && ny>=0&& nx<4&&ny<4) {
				dfs(nx, ny, depth+1, str+map[nx][ny]);
			}
		}
	}
}
