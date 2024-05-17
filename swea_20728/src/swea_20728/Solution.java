package swea_20728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	static int[] arr;
	static int k;
	static int min, n;
	

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n =Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			arr=new int[n];
			min= Integer.MAX_VALUE;
			
			st= new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				arr[i]=Integer.parseInt(st.nextToken());
			}
	
			Arrays.sort(arr);
			
			for(int i=0; i<n-k+1; i++) {
				min=Math.min(min, arr[i+k-1]-arr[i]);
			}
			
			System.out.println("#"+tc+" "+min);
		}
	}
}
