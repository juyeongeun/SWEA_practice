import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            int num=sc.nextInt();
            int[][] map = new int[100][100];
            int max1 = 0, max2 = 0, left = 0, right = 0;
            int[] colsum = new int[100]; // Integer 대신 int으로 변경
            int[] rowsum = new int[100]; // Integer 대신 int으로 변경

            // 입력과 동시에 열 계산
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    map[i][j] = sc.nextInt();
                    colsum[i] += map[i][j];
                }
            }

            // 행계산
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    rowsum[i] += map[j][i];
                }
            }

            // 우하향 대각선 합 계산
            for (int i = 0; i < 100; i++) {
                left += map[i][i];
            }

            // 좌상향 대각선 합 계산
            int k = 99;
            for (int i = 0; i < 100; i++) {
                right += map[i][k];
                k--;
            }

            // 각 배열에서 최대값 선택 sort함수는 nlog(n)이라 반복이 더 빠름
            for (int i = 0; i < 100; i++) {
                // 열 최대값 구한 후 max1값과 행 최대값 비교 후 구함
                max1 = Math.max(max1, colsum[i]);
                max1 = Math.max(max1, rowsum[i]);
            }

            //대각선 최대값구하고 위에서 구한 최대값이랑 다시 비교 후 구함
            max2 = Math.max(left, right);
            max1 = Math.max(max1, max2);

            System.out.println("#" + test_case + " " + max1);
        }
    }
}
