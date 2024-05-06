import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class App {
    public static int len;
    public static String str;
    public static Stack<Character> stack;
    public static Stack<Integer> calresult;
    public static String result = "";

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int TC = 1; TC <= 10; TC++) {
            stack = new Stack<>(); // 연산 기호 스택
            calresult = new Stack<>(); // 후위 연산 결과 스택
            len = Integer.parseInt(br.readLine());
            str = br.readLine();

            for (int i = 0; i < len; i++) {
                postfix(str.charAt(i)); // 후위연산 변환
            }

            while (!stack.isEmpty()) {
                result += stack.pop(); // 변환된 식 저장
            }

            for (int i = 0; i < result.length(); i++) {
                calcul(result.charAt(i)); // 연산 결과 저장
            }
            int end = calresult.pop();
            System.out.println("#" + TC + " " + end);
        }
    }

    public static void postfix(char cur) {
        if (cur == '*') { // 곱하기면 무조건 스택 저장
            stack.push(cur);
        } else if (cur == '+') { // 더하기면 스택이 비어있을 경우만 저장,
            if (stack.isEmpty()) {
                stack.push(cur);
            } else { // 스택이 비어있지 않다면 전부 다 pop 시키고 현재 cur 저장
                while (!stack.isEmpty()) {
                    result += stack.pop();
                }
                stack.push(cur);
            }
        } else {
            result += cur;
        }
    }

    public static void calcul(char cur) {
        if (cur == '*') {
            int sum = 0;
            sum = calresult.pop() * calresult.pop();
            calresult.push(sum);
        } else if (cur == '+') {
            int sum = 0;
            sum = calresult.pop() + calresult.pop();
            calresult.push(sum);
        } else {
            calresult.push(cur - '0');
        }
    }
}
