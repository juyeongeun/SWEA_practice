package swea_15612;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int TC = 1; TC <= T; TC++) {
			String[][] map = new String[8][8];
			String result = "yes";

			for (int i = 0; i < 8; i++) {
				map[i] = br.readLine().split("");
			}

			int cnt = 0;
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (map[i][j].equals("O")) {
						cnt++;
					}
				}
				if (cnt != 1) {
					result = "no";
					break;
				}
				cnt = 0;
			}
			
			if (result != "no") {
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						if (map[j][i].equals("O")) {
							cnt++;
						}
					}
					if (cnt != 1) {
						result = "no";
						break;
					}
					cnt = 0;
				}
			}
			System.out.println("#"+TC+" "+result);
		}
	}
}
