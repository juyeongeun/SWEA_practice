package swea_10912;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			StringBuilder sb = new StringBuilder(br.readLine());
			StringBuilder an = new StringBuilder();
			char c[];
			int check = 0;

			for (int i = 0; i < sb.length() - 1; i++) {
				for (int j = i + 1; j < sb.length(); j++) {
					if (sb.charAt(i) == sb.charAt(j) && sb.charAt(i) != '1' && sb.charAt(j) != '1') {
						sb.setCharAt(i, '1');
						sb.setCharAt(j, '1');
					}
				}
			}

			for (int i = 0; i < sb.length(); i++) {
				if (sb.charAt(i) != '1') {
					an.append(sb.charAt(i));
					check = 1;
				}
			}
			c=an.toString().toCharArray();
			Arrays.sort(c);
			

			if (check == 0) {
				System.out.println("#" + tc + " Good");
			} else {
				System.out.println("#" + tc+" ");
				for(int i=0; i<c.length; i++) {
					System.out.print(c[i]);
				}
				System.out.println();
			}
		}
	}
}
