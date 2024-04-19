import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int TC = 1; TC <= 1; TC++) {
            int word = sc.nextInt();
            int roop = 8 - word + 1; // 단어 수에 따른 반복 횟수 계산

            String[] map = new String[8]; // 한 줄씩 단어
            List<String> list = new ArrayList<String>(); // 비교를 위해 한 줄씩 저장
            int cnt = 0;

            for (int i = 0; i < 8; i++) { // 단어 입력
                map[i] = sc.next();
            }

            // 가로
            for (int i = 0; i < 8; i++) {
                list.clear(); // 리스트 초기화
                list.add(map[i]); // 단어 한줄 가져오기

                for (int k = 0; k < roop; k++) { // roop만큼 반복
                    int check = 0;
                    for (int r = 0; r < word; r++) { // word 만큼 반복
                        if (list.get(0).charAt((k + word - 1) - r) == (map[i].charAt(k + r))) {
                            check++;
                        }
                    } // check랑 word랑 같으면 회문
                    if (check == word) {
                        cnt++;
                    }
                }
            }

            // 세로
            String[] str = new String[1];
            str[0] = ""; // 문자열 초기화
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) { //세로 한 줄씩 저장
                    str[0] += map[j].charAt(i);
                }
                list.clear(); //리스트 초기화
                list.add(str[0]); //리스트에 추가
                str[0] = ""; //배열 초기화

                for (int k = 0; k < roop; k++) { //roop만큼 반복
                    int check = 0;
                    for (int r = 0; r < word; r++) { //word만큼 반복
                        if (list.get(0).charAt((k + word - r) - 1) == (map[k + r].charAt(i))) {
                            check++;
                        }
                    } // 같으면 회문
                    if (check == word) {
                        cnt++;
                    }
                }
            }

            // 결과 출력
            System.out.println("#" + TC + " " + cnt);
        }

    }
}
