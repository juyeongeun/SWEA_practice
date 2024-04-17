import java.util.Scanner;

public class App {
    static int cnt;
    static int max = 0;
    static int[] map;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            String num = sc.next(); // 초기 숫자 입력
            cnt = sc.nextInt(); // 교환 횟수
            map = new int[num.length()]; // num의 길이만큼 정수형 배열 생성

            // 숫자를 각 자릿수로 분리하여 배열 저장
            for (int i = 0; i < map.length; i++) {
                map[i] = num.charAt(i)-'0';
            }

            // 교환 횟수가 숫자의 길이보다 크면 교환 횟수를 숫자의 길이로 제한
            if (map.length < cnt) {
                cnt = map.length;
            }

            // 숫자의 자릿수를 교환하며 가장 큰 수 찾기
            DFS(0,0);
            System.out.println("#"+test_case+" "+max);
            max=0;
        }
    }

    static void DFS(int start, int depth) {
        // 주어진 횟수만큼 교환 후, 결과를 계산
        if (depth == cnt) {
            int result = 0;
            for (int i = 0; i < map.length; i++) {
                // pow : 제곱 연산, 최종 자릿수 계산하기 위해
                result += (Math.pow(10, i) * map[map.length - i - 1]);
            }

            max = Math.max(result, max);
            return;
        }
        // 모든 자릿수에 대해 교환 할 자릿수 선택
        for (int i = 0; i < map.length; i++) {
            // 선택한 자릿수 이후의 모든 자릿수와 교환
            for (int j = i + 1; j < map.length; j++) {
                swap(i, j);
                DFS(i, depth + 1); // 재귀로 다음 자릿수 교환
                swap(i, j); // 이전에 교환한 자릿수를 다시 되돌리기
            }
        }
    }

    static void swap(int i, int j) {
        int tmp = map[i];
        map[i] = map[j];
        map[j] = tmp;
    }
}
