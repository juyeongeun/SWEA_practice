package swea_1948;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int M1 = Integer.parseInt(st.nextToken());
			int D1 = Integer.parseInt(st.nextToken());
			int M2 = Integer.parseInt(st.nextToken());
			int D2 = Integer.parseInt(st.nextToken());
			int result = 0;

			if (M1 == 1 || M1 == 3 || M1 == 5 || M1 == 7 || M1 == 8 || M1 == 10 || M1 == 12) {
				result = 31 - D1;
			} else if (M1 == 2) {
				result = 28 - D1;
			} else {
				result = 30 - D1;
			}
			
			if (M2 - M1 > 0) {
				for (int i = M1+1; i < M2; i++) {
					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
						result += 31;
					} else if (i == 2) {
						result += 28;
					} else {
						result += 30;
					}
				}
				result += D2;
			}
			

			System.out.println("#" + tc + " " + (result+1));
		}

	}

}
