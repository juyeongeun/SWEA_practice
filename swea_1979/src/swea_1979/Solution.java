package swea_1979;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int[][] map = new int[n][n];
			int result = 0;

			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < n; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			// 가로
			for (int i = 0; i < n; i++) {
				int cnt = 0;
				for (int j = 0; j < n; j++) {
					if (map[i][j] == 1) {
						cnt++;
					}
					if(map[i][j]==0||j==n-1) {
						if (cnt == k) {
							result++;
						}
						cnt = 0;
					}
				}
			}

			// 세로
			for (int i = 0; i < n; i++) {
				int cnt = 0;
				for (int j = 0; j < n; j++) {
					if (map[j][i] == 1) {
						cnt++;
					}
					if(map[j][i]==0||j==n-1)  {
						if (cnt == k) {
							result++;
						}
						cnt = 0;
					}
				}
			}

			System.out.println("#" + tc + " " + result);
		}
	}

}
