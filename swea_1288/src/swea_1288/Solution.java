package swea_1288;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			String num = br.readLine();
			int tmp = Integer.parseInt(num);
			boolean[] check = new boolean[10];
			int ch = 0, cnt = 0;

			while (cnt < 10) {
				cnt=0;
				ch++;
				num=String.valueOf(tmp*ch);
				for (int i = 0; i < num.length(); i++) {
					check[num.charAt(i) - '0'] = true;
				}
				
				for (int i = 0; i < 10; i++) {
					if (check[i]==true) {
						cnt++;
					}
				}
			}
			System.out.println("#" + tc + " " + ch * tmp);
		}
	}

}
