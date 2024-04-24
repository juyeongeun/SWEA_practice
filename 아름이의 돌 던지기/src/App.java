import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int people = sc.nextInt(); // 사람 수
            int[] distance = new int[people]; // 던진 위치
            int min = Integer.MAX_VALUE;
            int cnt = 0;

            for (int i = 0; i < people; i++) {
                distance[i] = sc.nextInt();
                if (Math.abs(distance[i]) < min) {
                    min =Math.abs(distance[i]) ;
                    cnt=1;
                }else if(min==Math.abs(distance[i])){
                    cnt++;
                }
            }
            System.out.println("#"+test_case+" "+min+" "+cnt);
        }
        sc.close();
    }
}
