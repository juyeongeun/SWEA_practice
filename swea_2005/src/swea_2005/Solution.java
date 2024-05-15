package swea_2005;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t= Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=t; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[][] map = new int[N][N];
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<=i; j++) {
					if(i-1>=0&&j-1>=0) {
						map[i][j]=map[i-1][j-1]+map[i-1][j];
					}
					else {
						map[i][j]=1;
					}
				}
			}
			for(int i=0; i<N; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print(map[i][j]+" ");
				}
				System.out.println();
			}
		}

	}

}
