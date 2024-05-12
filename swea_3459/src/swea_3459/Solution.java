package swea_3459;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {

	 public static void main(String[] args) throws Exception{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        int T = Integer.parseInt(br.readLine());
	        for(int t=1; t<=T; t++) {
	            long N = Long.parseLong(br.readLine());
	            String s = "Alice";
	            while(N > 10) {
	                N = (N/2) + 1;
	                N = (N/2) - 1;
	            }
	            if( N == 1 || (N >= 6 && N <= 9)){
	                s = "Bob";
	            }
	            bw.write("#"+t+" "+s+"\n");
	            bw.flush();
	        }
	       
	        br.close();
	        bw.close();
	    }
}
