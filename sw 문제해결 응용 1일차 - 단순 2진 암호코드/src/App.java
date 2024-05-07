import java.util.Scanner;

class Solution {
	public static String[] code = { "0001101", "0011001", "0010011", "0111101", 
			"0100011", "0110001", "0101111", "0111011", "0110111", "0001011"};
	
	public static int[] toNum(String s) {
		int num[] = new int[8];
		int idx = 0;
		for (int i = 0; i < s.length(); i += 7) { 
			String tmp = s.substring(i, i + 7); // 7개 뽑아오기
			for (int j = 0; j < code.length; j++) { // 코드 배열에서 일치하는 것 찾기
				if (tmp.equals(code[j])) {
					num[idx] = j; // num배열에 숫자 넣기
                    idx++; //idx 증가 시켜주기
					break;
				}
			}
		}
		return num;
	}

	public static int isValid(String code) {
		int num[] = toNum(code);
		int sum = 0;
		int total = 0;

		for (int i = 0; i < num.length; i++) {
			sum += num[i]; // 총 합계 계산해주기
			if (i % 2 == 0) total += 3 * num[i]; // 짝수라면 3*num[i] 해주기
			else total += num[i]; // 아니면 total+num[i]
		}

		if (total % 10 == 0) // 계산한 수가 10의 배수라면 sum 출력
			return sum;
		return 0; // 아니면 0
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			String code = "";
			for (int i = 0; i < n; i++) {
				String s = sc.next();
				if (code.isEmpty()) {
					for (int j = m - 1; j >= 0; j--) {
						if (s.charAt(j) == '1') {
							code = s.substring(j - 55, j + 1); // 암호코드만 뽑아서 code에 저장하기
							break;
						}
					}
				}
			}
			System.out.println("#" + test_case + " " + isValid(code));
		}
	}
}