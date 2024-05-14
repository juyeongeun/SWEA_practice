import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[N];
			int max = 0, result = 0;

			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			for (int i = 2; i < N - 2; i++) {
				if (arr[i] > arr[i + 1] && arr[i] > arr[i + 2] && arr[i] > arr[i - 1] && arr[i] > arr[i - 2]) {
					max = Math.max(arr[i + 1], arr[i + 2]);
					max = Math.max(max, arr[i-1]);
					max = Math.max(max, arr[i-2]);
					result = result + arr[i] - max;
				}
			}
			System.out.println("#" + tc + " " + result);
		}
	}

}
