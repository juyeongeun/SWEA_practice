import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Scanner;
 
public class App{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String expression = sc.next();
 
        for (int tc = 1; tc <= 10; tc++) {
            int len = Integer.parseInt(expression);
            String line = expression;
 
            //postfix로 바꾸기
            StringBuilder postfix = new StringBuilder();
            Stack<Character> operator = new Stack<>();
 
            for (int i = 0; i < len; i++) {
                char ch = line.charAt(i);
                if (ch == '(') {
                    operator.push(ch);
                    continue;
                }
                else if(ch>='0' && ch<='9'){
                    postfix.append(ch);
                    continue;
                }
 
                //여기서부터는 ), 부호만 남음
                while (!operator.empty() && operator.peek() != '(' && checkPriority(operator.peek()) >= checkPriority(ch)) {
                    postfix.append(operator.pop());
                }
 
                if(ch==')') operator.pop();
                else operator.push(ch);
 
            }
 
            //stack에 넣어가면서 계산하기
            Stack<Integer> calculator = new Stack<>();
            for (int i = 0; i < postfix.length(); i++) {
                char ch = postfix.charAt(i);
                switch (ch) {
                    case '+':
                        calculator.push(calculator.pop() + calculator.pop());
                        break;
                    case '*':
                        calculator.push(calculator.pop() * calculator.pop());
                        break;
                    default:
                        calculator.push(ch - '0');
                        break;
                }
            }
 
            //출력하기
            System.out.println("#" + tc + " " + calculator.pop());
 
        }
    }
 
    //우선순위 체크 함수
    public static int checkPriority(char ch){
        switch(ch){
            case '(': case ')':return 0;
            case '+': case '-':return 1;
            case '*': case '/':return 2;
        }
        return -1;
    }
}