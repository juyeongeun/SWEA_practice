import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            int dump = sc.nextInt(); // 평탄화 횟수
            int flatten = 0; // 최고점-최저점
            int[] box = new int[100]; // 박스 높이

            // 박스 높이 입력
            for (int i = 0; i < 100; i++) {
                box[i] = sc.nextInt();
            }

            // 평탄화 횟수만큼 박스 이동
            for (int k = 0; k <= dump; k++) {
                int max = 0, min = 101, idx_max = 0, idx_min = 0; //최고점과 최저점 값, 인덱스
                for (int i = 0; i < 100; i++) {
                    if (box[i] >= max) {
                        idx_max = i;
                        max=box[i];
                    }
                    if (box[i] <= min) {
                        idx_min = i;
                        min=box[i];
                    }
                }

                // 최고점 - 최저점 계산
                flatten=box[idx_max] - box[idx_min];

                // 평탄화 높이가 0 또는 1이면 덤프 수행 중단 후 출력
                if (flatten == 0 || flatten == 1) {
                    k=dump+1;
                    
                } else { // 최고점--, 최저점++로 평탄화 작업
                    box[idx_max]--;
                    box[idx_min]++;
                }
            }
            System.out.println("#"+test_case+" "+flatten);
        }
    }
}
