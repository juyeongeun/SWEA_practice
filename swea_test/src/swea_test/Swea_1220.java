package swea_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Swea_1220 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int tc = 1; tc <= 10; tc++) {
			StringBuilder sb = new StringBuilder();
			int sum = 0;
			String n = br.readLine();

			String[][] map = new String[100][100];

			for (int i = 0; i < 100; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 100; j++) {
					map[i][j] = st.nextToken();
				}
			}

			for (int i = 0; i < 100; i++) {
				sb = new StringBuilder();
				for (int j = 0; j < 100; j++) {
					if (sb.length() != 0) {
						if (map[j][i].equals("1") && sb.charAt(sb.length() - 1) != '1') {
							sb.append(map[j][i]);
						}
						if (map[j][i].equals("2") && sb.charAt(sb.length() - 1) != '2') {
							sb.append(map[j][i]);
						}
					} else {
						sb.append(map[j][i]);
					}
				}
				for (int k = 0; k < sb.length() - 1; k++) {
					if (sb.charAt(k) == '1' && sb.charAt(k + 1) == '2') {
						sum++;
					}
				}
			}

			System.out.println("#" + tc + " " + sum);
		}
	}

}
