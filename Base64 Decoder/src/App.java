
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        char[] dic = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
                'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
                'v', 'w', 'x', 'y', 'z',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

        int T = sc.nextInt();

        for (int test_case=1; test_case <= T; test_case++) {

            String s = sc.next(); // 문자열 받음
            String result = "";
            for (int j = 0; j < s.length(); j++) { // 문자 하나씩 작업 시작
                int idx = 0;
                for (int k = 0; k < dic.length; k++) { // 문자를 정수로 바꿈
                    if (s.charAt(j) == dic[k]) {
                        idx = k;
                    }
                }
                String binary = String.format("%08d", Integer.parseInt(Integer.toBinaryString(idx))); // 정수를 2진수로 바꿈
                result += binary.substring(2); // string형태의 2진수 앞 2개 자르고 결과에 넣어줌
            }
            System.out.print("#" + test_case + " ");
            for (int j = 0; j < result.length(); j += 8) {
                String ten = "";
                ten += result.substring(j, j + 8); // result에서 8자리씩 자름
                int num = Integer.parseInt(ten, 2); // 2진수를 10진수로 변환
                System.out.print((char) num + "");
            }
            System.out.println();
        }
    }
}