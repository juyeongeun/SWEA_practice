import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] str = { "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0" };
        int T = sc.nextInt(); // 테스트 케이스

        for (int TC = 1; TC <= T; TC++) {
            int person = sc.nextInt();
            String[] score = new String[person]; // 총점 알파벳 학점
            Double[] student = new Double[person]; // person 수 만큼 점수 변환 후 총점
            int test = 0; // 점수 입력
            int K = sc.nextInt(); // 알고 싶은 사람
            double num = 0; // k번째 사람의 학점
            int cnt = person / 10;

            for (int j = 0; j < person; j++) {
                test = sc.nextInt();
                student[j] = (double) test * 0.35;
                test = sc.nextInt();
                student[j] = student[j] + ((double) test * 0.45);
                test = sc.nextInt();
                student[j] = student[j] + ((double) test * 0.2);

                if (K == j + 1) {
                    num = student[j];
                }
            }

            Arrays.sort(student, Collections.reverseOrder());

            int grade=0;
            for (int i = 0; i < person; i+=cnt) {
                for (int j = 0; j < cnt; j++) {
                    score[i+1*j] = str[grade];
                }
                grade++;
            }

            for(int i=0; i<person; i++){
                if(num==student[i]){
                    System.out.println("#"+TC+" "+score[i]);
                }
            }
        }
    }
}
