package swea_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Swea_1961 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			String[][] map = new String[n][n];
			int row_max = n - 1, col_max = n - 1,col_min = 0;
			String[] result = new String[n];

			for (int i = 0; i < n; i++) {
				map[i] = br.readLine().split(" ");
			}

			for (int k = 0; k < n; k++) {
				result[k]="";
				// 90
				for (int i = n-1; i >= 0; i--) {
					result[k] += map[i][col_min];
				}
				col_min++;
				result[k] += " ";
				//180
				for(int i=n-1; i>=0; i--) {
					result[k] += map[row_max][i];
				}
				row_max--;
				result[k] += " ";
				//270
				for(int i=0; i<n; i++) {
					result[k]+=map[i][col_max];
				}
				col_max--;
				result[k]+=" ";
			}
			
			System.out.println("#"+tc);
			for(int i=0; i<n; i++) {
				System.out.println(result[i]);
			}
		}

	}

}
