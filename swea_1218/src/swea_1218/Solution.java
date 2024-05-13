package swea_1218;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int tc = 1; tc <= 10; tc++) {
			Stack<String> s = new Stack<>();
			int cnt = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split("");
			int check = 1;

			if (cnt % 2 == 1) {
				check = 0;
			} else {
				for (int i = 0; i < cnt; i++) {
					if (str[i].equals("(") || str[i].equals("[") || str[i].equals("{") || str[i].equals("<")) {
						s.add(str[i]);
					} else if (s.isEmpty()) {
						check = 0;
						break;
					} else if (str[i].equals("}") && !s.peek().equals("{")) {
						check = 0;
						break;
					} else if (str[i].equals("]") && !s.peek().equals("[")) {
						check = 0;
						break;
					} else if (str[i].equals(")") && !s.peek().equals("(")) {
						check = 0;
						break;
					} else if (str[i].equals(">") && !s.peek().equals("<")) {
						check = 0;
						break;
					}else {
						s.pop();
					}

				}
			}
			System.out.println("#" + tc + " " + check);

		}

	}
}
