package swea_12004;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			String ans = "No";

			a: for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					if (i * j == n) {
						ans="Yes";
						break a;
					}
				}
			}
			System.out.println("#"+tc+" "+ans);
		}
	}
}
