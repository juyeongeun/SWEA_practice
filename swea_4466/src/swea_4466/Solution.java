package swea_4466;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t= Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			int sum=0;
			
			st=new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				arr[i]=Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			for(int i=0; i<k; i++) {
				sum+=arr[n-1-i];
			}
			System.out.println("#"+tc+" "+sum);
		}

	}

}
