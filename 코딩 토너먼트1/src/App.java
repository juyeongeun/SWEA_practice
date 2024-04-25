import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int K = sc.nextInt();
            int sum = 0, rank = (int) Math.pow(2.0, (double) K); // 2^K=사람 수
            int[] people = new int[rank];

            for (int i = 0; i < people.length; i++) {
                people[i] = sc.nextInt();
            }

            //K만큼 대진표 돌아감 ex) K=4, 총 4개층 생김
            for (int j = 0; j < K; j++) {
                int rank2 =rank/2; // winner의 수 16명이 붙으면 8명이 winner
                int z=0;
                int[] winner = new int[rank2]; //이긴 사람
                for (int i = 0; i < people.length-1; i += 2) { // 두 사람씩 대진
                    winner[z] = Math.max(people[i], people[i + 1]); //숫자가 큰 사람이 승리
                    sum+=Math.abs(people[i]-people[i+1]); // 두 사람의 능력치 차를 더해줌
                    z++;
                }

                people=new int[rank2]; // 사람 수를 rank2로 수정
                for(int i=0; i<rank2; i++){
                    people[i]=winner[i]; // 다시 저장
                }
            }
            System.out.println("#"+test_case+" "+sum);
        }
    }
}
