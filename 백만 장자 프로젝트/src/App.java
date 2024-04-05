import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트케이스 개수
        long money = 0; // 수익
        int idx_max = 0; // 최대값
        int idx = 0;

        for (int tc = 1; tc <= T; tc++) {
            int cnt = sc.nextInt(); // 연속된 n일
            money = 0; // 수익 0으로 초기화
            idx = 0;
            int[] price = new int[cnt]; // n일 만큼의 매매가 배열 생성

            // 매매가 입력
            for (int i = 0; i < cnt; i++) {
                price[i] = sc.nextInt();
            }

            while (idx < cnt) {
                idx_max = idx;
            
                // 최대값 구하기
                for (int i = idx; i < cnt; i++) {
                    if (price[idx_max] < price[i]) {
                        idx_max = i;
                    }
                }

                // 구매
                for (int j = idx; j < idx_max; j++) {
                    money -= price[j];
                }

                // 판매
                money += price[idx_max] * (idx_max - idx);
                idx = idx_max + 1;
            }
            System.out.println("#" + tc + " " + money);
        }
    }
}
