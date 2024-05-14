package swea_2814;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
	public static int N, M, cnt;
	public static ArrayList<Integer>[] list;
	public static boolean[] result;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			cnt=0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken()); // 노드 개수
			M = Integer.parseInt(st.nextToken()); // 간선 개수
			list= new ArrayList[N]; // 노드 개수만큼 LIST 생성
			result = new boolean[N];// 노드 개수 만큼 체크하는 배열 생성
			
			if (M == 0) { // 간선 개수가 0이면 1개의 노드밖에 안됨
				System.out.println("#" + tc + " 1");

			} else {
				for (int i = 0; i < N; i++) { // 노드 번호-1 리스트를 생성
					list[i] = new ArrayList<>();
				}
				for (int i = 0; i < M; i++) {
					st = new StringTokenizer(br.readLine());
					int x = Integer.parseInt(st.nextToken()); // 연결 노드 A
					int y = Integer.parseInt(st.nextToken()); // 연결 노드 B
					list[x - 1].add(y - 1); // list x-1에 y-1 저장
					list[y - 1].add(x - 1); // list y-1에 x-1 저장
				}
				for (int i = 0; i < N; i++) {
					 
					dfs(i, 1);
				}
				System.out.println("#" + tc + " " + cnt);
			}
		}

	}

	public static void dfs(int q, int p) {
		result[q] = true; // 체크 배열 q번째는 방문 했으므로 true
		cnt=Math.max(cnt,p); // 연결된 노드의 수를 가져옴 -> true 개수를 가져온다 생각하면 됨
		for (int j = 0; j < list[q].size(); j++) { // 해당 노드에 연결된 노드 수 만큼
			if (result[list[q].get(j)] == false) { // 체크 배열에 리스트[q].get[j]해당하는 위치가 false라면
				dfs(list[q].get(j), p + 1); // 방문 안 했으므로 해당 숫자와 p+1
				
			}
		}
		result[q] = false; // 방문 해제 시켜주기 -> 배열 재사용 해야해서
	}

}
