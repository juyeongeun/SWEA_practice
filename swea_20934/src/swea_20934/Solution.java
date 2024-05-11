package swea_20934;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int TC = 1; TC <= T; TC++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringBuilder cup = new StringBuilder();
			cup.append(st.nextToken());
			int cnt = Integer.parseInt(st.nextToken());
			int place = 0;

			for (int i = 0; i < 3; i++) {
				if (cup.charAt(i) == 'o') {
					place = i;
					break;
				}
			}

			for (int i = 0; i < cnt; i++) {
				if (place == 0) {
					place = 1;
				} else if (place == 1) {
					place = 0;
				} else if (place == 2) {
					place = 1;
				}
			}

			System.out.println("#" + TC + " " + place);

		}
	}
}