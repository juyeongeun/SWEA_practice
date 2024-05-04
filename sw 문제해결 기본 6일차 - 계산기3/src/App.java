import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Scanner;

public class App {
    static int l; // 테스트 케이스 길이
    static String str; // 계산식 (중위 표기법)
    static String result; // 변환식 (후위 표기법)
    static Stack<Character> stack; // 변환 위한 스택
    static Stack<Integer> calStack; // 변환식 계산 스택
    static int resultValue; // 계산 결과

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int T = 1; T <= 10; T++) {
            stack = new Stack<>();
            calStack = new Stack<>();
            result = "";
            resultValue = 0;

            l = Integer.parseInt(br.readLine());
            str = br.readLine();

            // 현재 문자 반환
            for (int i = 0; i < l; i++) {
                conversion(str.charAt(i));
            }

            // 스택이 빌 때까지 변환식에 넣음
            while (!stack.isEmpty()) {
                result += stack.pop();
            }

            // 후위 표기식 계산
            for (int i = 0; i < result.length(); i++) {
                calculate(result.charAt(i));
            }
            resultValue = calStack.pop();
            System.out.println("#" + T + " " + resultValue);
        }
    }

    public static void conversion(char cur) {
        // '('랑 '*' => 무조건 스택에 쌓기
        if (cur == '('|| cur=='*') {
            stack.push(cur);
        } else if (cur == ')') { // ')' => '(' 만날 때까지 스택을 pop하여 변환식에 넣기 '('는 버림
            while (!stack.isEmpty()) {
                if (stack.peek() == '(') {
                    stack.pop();
                    break;
                } else {
                    result += stack.pop();
                }
            }
        } else if (cur == '+') { // + 비어있다면 스택에 쌓고, 아니면 '(' 만날 때까지 스택 pop해 변환식에 넣기
            if (stack.isEmpty()) {
                stack.push(cur);
            } else {
                while (!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        stack.push(cur);
                        break;
                    } else {
                        result += stack.pop();
                    }
                }
            }
        } else { // 피연산자면 변환식에 넣기
            result += cur;
        }
    }

    // 연산자가 아니라면 스택에 넣고, 연산자면 스택 2개 pop하여 계산 후 다시 push
    public static void calculate(char cur) {
        if (cur == '*') {
            int tmp = calStack.pop() * calStack.pop();
            calStack.push(tmp);
        } else if (cur == '+') {
            int tmp = calStack.pop() + calStack.pop();
            calStack.push(tmp);
        } else {
            calStack.push(cur - '0');
        }
    }

}