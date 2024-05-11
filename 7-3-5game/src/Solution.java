import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		
		for(int TC =1; TC<=T; TC++) {
			String[] str = br.readLine().split(" ");
			
			int[] num=new int[7];
			int[] sum = new int[35];
			
			for(int i=0; i<7; i++) {
				num[i]=Integer.parseInt(str[i]);
			}
			
			int q=0;
			for(int i=0; i<5; i++) {	
				for(int j=i+1; j<6; j++) {
					for(int k=j+1; k<7; k++) {
						sum[q]=num[i]+num[j]+num[k];
						q++;
					}
				}
			}
			
			Arrays.sort(sum);
			
			for(int i=0; i<34; i++) {
				if(sum[i]==sum[i+1]) {
					sum[i]=0;
				}
			}
			
			int check=0;
			for(int i=34; i>=0; i--) {
				if(sum[i]!=0) {
					check++;
				}
				if(check==5) {
					System.out.println("#"+TC+" "+sum[i]);
					break;
				}
			}
			
			
		}
	}
}


