package swea_1959;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t=Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			int max=Math.max(n,m);
			int[] arr1 = new int[n];
			int[] arr2 = new int[m];
			int result=0;
			
			st=new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				arr1[i]=Integer.parseInt(st.nextToken());
			}
			
			st=new StringTokenizer(br.readLine());
			for(int i=0; i<m; i++) {
				arr2[i]=Integer.parseInt(st.nextToken());
			}
			
			if(max==n) {
				for(int i=0; i<=n-m; i++) {
					for(int j=0; j<m; j++) {
						result+= arr1[i+j]*arr2[j];
					}
					max=Math.max(result,max);
					result=0;
				}
			}
			else {
				for(int i=0; i<=m-n; i++) {
					for(int j=0; j<n; j++) {
						result+= arr2[i+j]*arr1[j];
					}
					max=Math.max(result,max);
					result=0;
				}
			}
			System.out.println("#"+tc+" "+max);
		}
	}
}