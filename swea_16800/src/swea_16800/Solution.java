package swea_16800;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t=Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=t; tc++) {
			long n = Long.parseLong(br.readLine());
			long e = (long) Math.sqrt(n);
			long min = Long.MAX_VALUE;
			
			for(int i=1; i<=e; i++) {
				if(n%i==0) {
					min=Math.min(min, (n/i)+i);
				}
			}
			System.out.println("#"+tc+" "+(min-2));
		}		
	}
}
