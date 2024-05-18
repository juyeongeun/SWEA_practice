package swea_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Swea_1204 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=t; tc++) {
			String ct = br.readLine();
			int[] score=new int[101];
			int max = Integer.MIN_VALUE, max_idx=0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i=0; i<1000; i++) {
				int idx = Integer.parseInt(st.nextToken());
				score[idx]++;
				if(max<=score[idx]) {
					if(max<idx) {
						max=score[idx];
						max_idx=idx;
					}
				}
			}
			System.out.println("#"+ct+" "+max_idx);
		}

	}

}
