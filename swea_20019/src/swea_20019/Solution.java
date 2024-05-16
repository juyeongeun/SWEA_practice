package swea_20019;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t= Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=t; tc++) {
			String str = br.readLine();
			String ans = "NO";
			int half = (str.length()-1)/2, sum=0;
			
			for(int i=0; i<str.length(); i++) { // 전체 검사
				if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
					sum++;
					break;
				}
			}
			for(int i=0; i<half; i++) { // 앞쪽 검사
				if(str.charAt(i)!=str.charAt(half-i-1)) {
					sum++;
					break;
				}
			}
			for(int i=half+1; i<str.length()-1; i++) { // 뒷쪽 검사
				if(str.charAt(i)!=str.charAt(half+str.length()-i)) {
					sum++;
					break;
				}
			}
			
			if(sum==0) { // sum의 증가가 없다면 회문의 회문
				ans="YES";
			}
			System.out.println("#"+tc+" "+ans);
		}
	}

}
