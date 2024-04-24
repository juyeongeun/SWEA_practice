import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] cal = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        for (int test_case = 1; test_case <= T; test_case++) {
            int mon1, day1, mon2, day2, sum = 0;
            mon1 = sc.nextInt(); // 첫번째 달
            day1 = sc.nextInt(); // 첫번째 일
            mon2 = sc.nextInt(); // 두번째 달
            day2 = sc.nextInt(); // 두번째 일
            sum = day2; // sum엔 두번째 일 저장

            for (int i = 0; i < 12; i++) {
                // 인덱스와 첫번째 월이 같고 mon1과 mon2가 같지 않다면 캘린더 배열의 날짜수 - day1
                if (mon1 == (i + 1) && mon1 != mon2) {
                    sum += cal[i] - day1;
                } else if(mon1==mon2) { //mon1과 mon2가 같다면 day만 계산
                    sum = day2 - day1;
                }
            }

            // mon2가 더 큰 경우엔 mon1 다음달 ~ mon2 전달까지 일자 수 계산
            for (int i = mon1; i < mon2-1; i++) {
                sum += cal[i];
            }
            sum++; // 마지막에 +1 해주기
            System.out.println("#" + test_case + " " + sum);
        }
    }
}
