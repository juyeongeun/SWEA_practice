package swea_13428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static int min, max;
	public static char[] str;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			int num = Integer.parseInt(br.readLine());

			max = num; // 현재 숫자 저장
			min = num; // 현재 숫자 저장

			str = Integer.toString(num).toCharArray(); // 문자형 배열로 저장 (String으로 저장하면 한 번 더 작업해야함)

			for (int i = 0; i < str.length; i++) {
				for (int j = i + 1; j < str.length; j++) {
					char c = str[i]; // swap과정
					str[i] = str[j];
					str[j] = c;

					if (str[0] != '0') { // 0번째 index의 값이 0이 아니라면
						int n = 0;
						for (int k = 0; k < str.length; k++) {
							n+= (str[i] - '0') *( Math.pow(10, str.length-1-k)); // 문자 배열을 숫자로 변환
						}
						min = Math.min(min, n); // 변환한 값과 min값 비교
						max = Math.max(max, n); // 변환한 값과 max값 비교
					}
					c = str[i]; // 원상복구
					str[i] = str[j];
					str[j] = c;
				}
			}

			System.out.println("#" + tc + " " + min + " " + max);
		}

	}
}
