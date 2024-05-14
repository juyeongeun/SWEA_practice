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
			N = Integer.parseInt(st.nextToken()); // ��� ����
			M = Integer.parseInt(st.nextToken()); // ���� ����
			list= new ArrayList[N]; // ��� ������ŭ LIST ����
			result = new boolean[N];// ��� ���� ��ŭ üũ�ϴ� �迭 ����
			
			if (M == 0) { // ���� ������ 0�̸� 1���� ���ۿ� �ȵ�
				System.out.println("#" + tc + " 1");

			} else {
				for (int i = 0; i < N; i++) { // ��� ��ȣ-1 ����Ʈ�� ����
					list[i] = new ArrayList<>();
				}
				for (int i = 0; i < M; i++) {
					st = new StringTokenizer(br.readLine());
					int x = Integer.parseInt(st.nextToken()); // ���� ��� A
					int y = Integer.parseInt(st.nextToken()); // ���� ��� B
					list[x - 1].add(y - 1); // list x-1�� y-1 ����
					list[y - 1].add(x - 1); // list y-1�� x-1 ����
				}
				for (int i = 0; i < N; i++) {
					 
					dfs(i, 1);
				}
				System.out.println("#" + tc + " " + cnt);
			}
		}

	}

	public static void dfs(int q, int p) {
		result[q] = true; // üũ �迭 q��°�� �湮 �����Ƿ� true
		cnt=Math.max(cnt,p); // ����� ����� ���� ������ -> true ������ �����´� �����ϸ� ��
		for (int j = 0; j < list[q].size(); j++) { // �ش� ��忡 ����� ��� �� ��ŭ
			if (result[list[q].get(j)] == false) { // üũ �迭�� ����Ʈ[q].get[j]�ش��ϴ� ��ġ�� false���
				dfs(list[q].get(j), p + 1); // �湮 �� �����Ƿ� �ش� ���ڿ� p+1
				
			}
		}
		result[q] = false; // �湮 ���� �����ֱ� -> �迭 ���� �ؾ��ؼ�
	}

}
