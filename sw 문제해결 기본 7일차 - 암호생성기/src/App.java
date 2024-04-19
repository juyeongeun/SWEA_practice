import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int TC = 1; TC <= 1; TC++) {

            Boolean check = true;
            List<Integer> make = new ArrayList<Integer>(); //암호문 리스트

            int tmp = sc.nextInt(); //테스트 케이스 입력받기

            // 숫자 입력
            for (int i = 0; i < 8; i++) {
                make.add(sc.nextInt());
            }

            System.out.print("#" + TC + " ");

            int ch = 1; //암호문에서 뺄 숫자
            while (check) {
                if (ch == 6) { //ch가 6이되면 1로 초기화
                    ch = 1;
                }

                // 리스트의 숫자가 0과 같거나 작을 때 또는 ch를 차감했을 때 0과 같거나 작으면
                if (make.get(0) <= 0 || make.get(0) - ch <= 0) {
                    make.set(0, 0); // 리스트의 해당 숫자는 0으로 지정
                    int num = make.get(0); // 숫자 저장
                    make.remove(0); // 리스트의 해당 인덱스 삭제
                    make.add(num); // 리스트의 마지막에 숫자 추가

                    for (int j = 0; j < 8; j++) { // 종료된 암호문 출력
                        System.out.print(make.get(j) + " ");
                        check = false; // while문 빠져나오기
                    }
                } else {
                    int num = make.get(0) - ch; //리스트의 숫자 - ch 저장
                    make.remove(0); // 해당 인덱스 제거
                    make.add(num);  // 리스트의 마지막에 해당 숫자 추가
                    ch++; //ch증가
                }
            }
            System.out.println("");
        }
    }
}
