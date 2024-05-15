package swea_2805;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[][] map = new int[N][N];
			int sum = 0;

			for (int i = 0; i < N; i++) {
				String[] str = br.readLine().split("");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(str[j]);
				}
			}

			int start_idx = N / 2, end_idx = N / 2;

			for (int i = 0; i < N; i++) {
				if (i<N/2) {
					for (int j = start_idx; j <= end_idx; j++) {
						sum += map[i][j];
					}
					start_idx--;
					end_idx++;
				}
				else {
					for(int j=start_idx; j<=end_idx; j++) {
						sum+=map[i][j];
					}
					start_idx++;
					end_idx--;
				}
			}
			System.out.println("#"+tc+" "+sum);

		}

	}

}
