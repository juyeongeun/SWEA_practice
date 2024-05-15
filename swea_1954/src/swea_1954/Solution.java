package swea_1954;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			int num = 1;
			int N = Integer.parseInt(br.readLine());
			int[][] map = new int[N][N];
			int col_max = N - 1, col_min = 0, row_max = N - 1, row_min = 0;

		while(num<=N*N) {
				for (int i = col_min; i <= col_max; i++) {
					map[row_min][i] = num++;
				}
				row_min++;
				for (int i = row_min; i <= row_max; i++) {
					map[i][col_max] = num++;
				}
				col_max--;
				for (int i = col_max; i >= col_min; i--) {
					map[row_max][i] = num++;
				}
				row_max--;
				for (int i = row_max; i >= row_min; i--) {
					map[i][col_min] = num++;
				}
				col_min++;
		
		}
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					System.out.print(map[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
