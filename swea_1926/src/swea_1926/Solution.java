package swea_1926;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		String[] str = new String[num];

		for (int i = 0; i < num; i++) {
			str[i] = Integer.toString(i + 1);
			int cnt = 0;
			for (int j = 0; j < str[i].length(); j++) {
				if (str[i].charAt(j) == '3' || str[i].charAt(j) == '6' || str[i].charAt(j) == '9') {
					cnt++;
				}
			}
			if (cnt != 0) {
				str[i] = "";
				for (int j = 0; j < cnt; j++) {
					str[i] += "-";
				}
			}
		}

		for (int i = 0; i < num; i++) {
			System.out.print(str[i] + " ");
		}
		System.out.println();

	}

}
