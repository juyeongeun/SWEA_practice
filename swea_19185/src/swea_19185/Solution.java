package swea_19185;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tt = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= tt; tc++) {
			String st = br.readLine();
			String[] s = br.readLine().split(" "); //s표 이름
			String[] t = br.readLine().split(" "); //t표 이름

			int cnt = Integer.parseInt(br.readLine()); // 반복횟수
			String name = "";
			int snum, tnum; // 각 이름표의 인덱스 계산
			
			for (int i = 0; i < cnt; i++) {
				int year = Integer.parseInt(br.readLine());
				snum=(year-1)%s.length;
				tnum=(year-1)%t.length;
	
				name += " " + s[snum] + t[tnum];
			}
			System.out.println("#" + tc + name);
		}
	}
}