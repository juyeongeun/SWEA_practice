package boj_2839;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sugar = Integer.parseInt(br.readLine());
		int result = 0;

		while(sugar>0) {
			if(sugar%5==0) {
				result+=sugar/5;
				break;
			}else {
				sugar=sugar-3;
				result++;
			}
			if(sugar<0) {
				result=-1;
			}
		}
		System.out.println(result);
	}

}
