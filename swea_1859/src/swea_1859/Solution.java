package swea_1859;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			int cnt = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] price = new int[cnt];
			int idx = 0, max_idx = 0;
			long money = 0;

			for (int i = 0; i < cnt; i++) {
				price[i] = Integer.parseInt(st.nextToken());
			}

			while (idx < cnt) {
				max_idx = idx;

				for (int i = idx; i < cnt; i++) {
					if (price[max_idx] < price[i]) {
						max_idx = i;
					}
				}

				for (int i = idx; i < max_idx; i++) {
					money -= price[i];
				}

				money += price[max_idx] * (max_idx - idx);
				idx = max_idx + 1;
			}

			System.out.println("#" + tc + " " + money);
		}
	}

}
