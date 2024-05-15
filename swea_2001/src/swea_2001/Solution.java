package swea_2001;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			int M=Integer.parseInt(st.nextToken());
			int max=0, sum=0;
			
			int[][] bugs = new int[N][N];
			
			for(int i=0; i<N; i++) {
				st=new StringTokenizer(br.readLine());
				for(int j=0; j<N; j++) {
					bugs[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i=0; i<N-M; i++) {
				for(int j=0; j<N-M; j++) {
					sum=0;
					for(int k=i; k<i+M; k++) {
						for(int q=j; q<j+M; q++) {
							sum+=bugs[k][q];
						}
					}
					max=Math.max(max,sum);
				}
			}
			System.out.println("#"+tc+" "+max);
			
		}
	}

}
