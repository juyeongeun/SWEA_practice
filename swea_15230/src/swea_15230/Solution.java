package swea_15230;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	static String alpha ="abcdefghijklmnopqrstuvwxyz";

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int TC=1; TC<=T; TC++) {
			String str = br.readLine();
			System.out.println("#"+TC+" "+compare(str));
		}

	}

	public static int compare(String str) {
		for(int i=0;i<str.length(); i++) {
			if(str.charAt(i)!=alpha.charAt(i)) {
				return i;
			}
		}
		return str.length();
	}
}
