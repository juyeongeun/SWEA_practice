package swea_17299;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t=Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=t; tc++) {
			String str = br.readLine();
			int min = Integer.MAX_VALUE;
			
			for(int i=0; i<str.length()-1; i++) {
				int num1=0, num2=0;
				for(int j=0; j<=i; j++) {
					num1+=(str.charAt(j)-'0')*Math.pow(10,i-j);
				}
				for(int j=i+1; j<str.length(); j++) {
					num2+=(str.charAt(j)-'0')*Math.pow(10,str.length()-j-1);
				}
				num1=num1+num2;
				min=Math.min(min,num1);
			}
			System.out.println("#"+tc+" "+min);
		}
	}

}
