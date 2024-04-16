import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int TC = 1; TC <= T; TC++) {
            int num = sc.nextInt();
            int[] score = new int[101];
            int maxFrequency = 0;
            int maxScore = 0;

            for (int i = 0; i < 1000; i++) {
                int studentScore = sc.nextInt();
                score[studentScore]++;

                // 최빈값보다 많이 나오거나 (조건 1)
                // 최빈값과 같고, 학생의 점수가 현재 최대 점수보다 크면 (조건 2)
                if (score[studentScore] > maxFrequency
                        || (score[studentScore] == maxFrequency && studentScore > maxScore)) {
                    maxFrequency = score[studentScore];
                    maxScore = studentScore;
                }
            }

            System.out.println("#" + num + " " + maxScore);
        }
        sc.close();
    }
}
