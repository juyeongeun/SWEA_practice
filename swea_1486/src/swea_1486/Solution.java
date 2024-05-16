package swea_1486;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static int n, b, min, sum;
	public static int[] talls;
	

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n =Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			talls = new int[n];
			min=Integer.MAX_VALUE;
			sum=0;
			int result=0;
			
			st=new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				talls[i]=Integer.parseInt(st.nextToken());
			}
			compare(0,0);
			result=min-b;
			System.out.println("#"+tc+" "+result);
			
		}
	}
	public static void compare(int idx, int sum) {
		if(idx==n) {
			if(sum>=b && sum<min) {
				min=sum;
			}
				return;
		}
		compare(idx+1, sum+talls[idx]);
		
		compare(idx+1, sum);
	}

}
