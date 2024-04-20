import java.util.Scanner;

class Solution {
	public static int result;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		for (int test_case = 1; test_case <= 10; test_case++) {
			int T= sc.nextInt();
			int N=sc.nextInt();
			int M=sc.nextInt();
			result=1;

			pows(N,M); // 함수 호출
			System.out.println("#"+test_case+" "+result);
		}
	}
	public static void pows(int n, int m){
		if(m==0){ //m번의 곱셈이 끝나면
			return;
		}
		result*=n;
		pows(n,m-1); //재귀함수
	}
}