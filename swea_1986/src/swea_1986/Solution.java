package swea_1986;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			int num = Integer.parseInt(br.readLine());
			int result = 0;

			for (int i = 1; i <= num; i++) {
				if (i % 2 == 1) {
					result += i;
				} else {
					result -= i;
				}
			}
			System.out.println("#" + tc + " " + result);
		}
	}
}
