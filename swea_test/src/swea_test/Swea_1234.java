package swea_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Swea_1234 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int tc = 1; tc <= 10; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cnt = Integer.parseInt(st.nextToken());
			StringBuilder sb = new StringBuilder(st.nextToken());
			int len = cnt;

			for (int j = 0; j < cnt / 2; j++) {
				for (int i = 0; i < len - 1; i++) {
					if (sb.charAt(i) == sb.charAt(i + 1)) {
						sb.deleteCharAt(i);
						sb.deleteCharAt(i);
						len-=2;
						break;
					}
				}
			}
			
			System.out.println("#"+tc+" "+sb);
		}
	}

}
