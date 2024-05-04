import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class App {
    public static String str;
    public static Stack<Character> stack;
    public static Stack<Integer> comstack;
    public static String result = "";

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int T = 1; T <= 10; T++) {
            int len = Integer.parseInt(br.readLine()); // 중위 연산식 길이
            str = br.readLine(); // 중위 연산식
            stack = new Stack<>(); // 연산기호 스택
            comstack = new Stack<>(); // 후위 연산 계산

            for (int i = 0; i < len; i++) {
                postfix(str.charAt(i)); // 연산 기호만 스택에 저장
            }

            while (!stack.isEmpty()) {
                result += stack.pop(); // 숫자식에 후위 연산 기호 추가하기
            }

            for (int i = 0; i < result.length(); i++) {
                calculate(result.charAt(i)); // 후위 연산 계산하기
            }

            System.out.println("#" + T + " " + comstack.pop()); // 출력
        }
    }

    public static void postfix(char cur) {
        if (cur == '+') { // +면 무조건 push
            stack.push(cur);
        } else {
            result += cur; // 숫자라면 result에 바로 저장
        }
    }

    public static void calculate(char cur) {
        if (cur == '+') { // +를 만나면 스택에서 pop한 후 계산하고 다시 push
            int tmp = comstack.pop() + comstack.pop();
            comstack.push(tmp);
        } else { // +가 아닌 숫자라면
            comstack.push(cur - '0');
        }
    }
}
