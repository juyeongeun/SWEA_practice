package swea_20551;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] box = new int[3];
			int sum = 0;

			for (int i = 0; i < 3; i++) {
				box[i] = Integer.parseInt(st.nextToken());
			}

			for (int i = 2; i >= 1; i--) {
				int tmp = box[i-1];
				for(int j=box[i]; j<=tmp; j++) {
					sum++;
					box[i - 1]--;
				}
				if (box[i - 1] == 0) {
					sum = -1;
					break;
				}
			}

			System.out.println("#" + tc + " " + sum);
		}
	}
}