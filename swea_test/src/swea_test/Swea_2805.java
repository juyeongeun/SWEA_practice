package swea_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Swea_2805 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t= Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=t; tc++) {
			int n = Integer.parseInt(br.readLine());
			int[][] map = new int[n][n];
			int end_idx=n/2+1, start_idx = n/2;
			int sum=0;
			
			for(int i=0; i<n; i++) {
				String[] s = br.readLine().split("");
				for(int j=0; j<n; j++) {
					map[i][j]=Integer.parseInt(s[j]);
				}
			}
			
			for(int k=0; k<n; k++) {
				for(int i=start_idx; i<end_idx; i++) {
					sum+=map[k][i];
				}
				if(k<n/2) {
					start_idx--;
					end_idx++;
				}else {
					start_idx++;
					end_idx--;
				}
			}
			System.out.println("#"+tc+" "+sum);
			
		}
	}
}