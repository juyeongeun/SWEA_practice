package swea_1493;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int p[] = new int[2];
			p[0] = Integer.parseInt(st.nextToken());
			p[1] = Integer.parseInt(st.nextToken());
			int result =0;
			
			// 첫번째 값에 대한 좌표 x,y
			int x[] = {0,0};
			int y[]= {0,0};
			int sum[]= {0,0};
			
			for(int j=0; j<2; j++) {
				for(int i=1; ; i++) {
					sum[j]+=i;
					if(sum[j]>=p[j]) {
						x[j]=i-(sum[j]-p[j]);
						y[j]=(i+1)-x[j];
						break;
					}
				}
			}
			
			int xx=x[0]+x[1];
			int yy=y[0]+y[1];
			int ssum=0;
			
			for(int i=1;i<(xx+yy)-1; i++) {
				ssum+=i;
			}
			result=ssum+(xx-1);
			System.out.println("#"+tc+" "+result);
			
		}

	}

}
