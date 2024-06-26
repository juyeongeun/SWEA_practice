package swea_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Swea_11315 {
	static String[][] str;
	static int[] dx = { 1, 1, 0, -1 };
	static int[] dy = { 0, 1, 1, 1 };
	static String result;
	static int n;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			n = Integer.parseInt(br.readLine());
			str = new String[n][n];

			for (int i = 0; i < n; i++) {
				str[i] = br.readLine().split("");
			}
			result="NO";

			a: for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (str[i][j].equals("o")) {
						check(i, j);
						if (result .equals("YES")) {
							break a;
						}
					}
				}
			}
			System.out.println("#" + tc + " " + result);
		}
	}

	public static void check(int y, int x) {
		for (int i = 0; i < 4; i++) { // 좌표 이동
			int sum = 1; // 이미 o를 찾았기 때문에 1부터 시작
			int nx = x; // 현재 좌표 저장
			int ny = y; // 현재 좌표 저장
			for (int j = 0; j < 4; j++) { // dx,dy이동 횟수
				nx = nx + dx[i];
				ny = ny + dy[i];
				if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
					if (str[ny][nx].equals("o")) {
						sum++;
					}
					if(sum==5) {
						result="YES";
						return;
					}
				} else {
					break;
				}
			}
		}
	}
}
