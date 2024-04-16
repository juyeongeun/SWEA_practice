import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[][] arr;

        for (int TC = 1; TC <= T; TC++) {
            int N = sc.nextInt();
            arr = new int[N][N]; // 파스칼 삼각형 층 수
            int num=1;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (j == 0) { // 파스칼 시작 지점은 1
                        arr[i][j] = 1;
                    } else if (j == N-1) { // 파스칼 마지막 지점도 1
                        arr[i][j] = 1;
                    } else if(i!=0) { // 현재 위치의 값 = 이전 행 왼쪽 값 + 이전 행 현재 열 값
                        arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                    }
                }
            }

            System.out.println("#"+TC);

            // 삼각형의 층 수 만큼의 개수만 출력 ex) 0행 : 1개, 1행 : 2개 … n행 : n+1개
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < num; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
                num++;
            }
        }
    }
}