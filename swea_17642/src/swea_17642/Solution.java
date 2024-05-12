package swea_17642;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int TC = 1; TC <= T; TC++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long A = Long.parseLong(st.nextToken());
			long B = Long.parseLong(st.nextToken());
			long result;

			result = B - A;

			if (result == 0) {
				System.out.println("#" + TC + " 0");
			} else if (result < 2) {
				System.out.println("#" + TC + " -1");
			} else {
				System.out.println("#" + TC + " " + (long) (result / 2));
			}
		}
	}
}
