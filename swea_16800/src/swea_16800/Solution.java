package swea_16800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	int[] dx = { 1, -1, 0, 0 };
	int[] dy = { 0, 0, 1, -1 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		long result=0;

		for (int TC = 1; TC <= T; TC++) {
			long N = Long.parseLong((br.readLine()));
			result=move(N);
			System.out.println("#"+TC+" "+result);
		}
	}

	public static long move(long num) {
		long min = Long.MAX_VALUE;
		for(int i=1;i<num; i++) {
			if(num/i <i) break;
			if(num%i==0) {
				if((num/i+i)<min) {
					min=(num/i+i);
				}
			}
		}
		return min;
	}

}
