package swea_test;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Swea_1215 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		for (int TC = 1; TC <= 10; TC++) {
			int word = sc.nextInt();
			int roop = 8 - word + 1;

			String[] map = new String[8];
			List<String> list = new ArrayList<String>();
			int cnt = 0;

			for (int i = 0; i < 8; i++) {
				map[i] = sc.next();
			}

			// 가로
			for (int i = 0; i < 8; i++) {
				list.clear();
				list.add(map[i]);

				for (int k = 0; k < roop; k++) {
					int check = 0;
					for (int r = 0; r < word; r++) {
						if (list.get(0).charAt((k + word - 1) - r) == (map[i].charAt(k + r))) {
							check++;
						}
					}
					if (check == word) {
						cnt++;
					}
				}
			}

			// 세로
			String[] str = new String[1];
			str[0] = "";
			for (int i = 0; i < 8; i++) {

				for (int j = 0; j < 8; j++) {
					str[0] += map[j].charAt(i);
				}
				list.clear();
				list.add(str[0]);
				str[0] = "";

				for (int k = 0; k < roop; k++) {
					int check = 0;
					for (int r = 0; r < word; r++) {
						if (list.get(0).charAt((k + word - r) - 1) == (map[k + r].charAt(i))) {
							check++;
						}
					}
					if (check == word) {
						cnt++;
					}
				}
			}

			// 결과 출력
			System.out.println("#" + TC + " " + cnt);
		}
	}
}