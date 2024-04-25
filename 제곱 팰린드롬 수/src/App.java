import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int A = sc.nextInt(); //시작하는 숫자
            int B = sc.nextInt(); // 끝나는 숫자
            String num, snum; 
            int cnt = 0;
            
            for (int i = A; i <= B; i++) {
                num = String.valueOf(i); //숫자를 문자형으로 변형
                snum = String.valueOf(Math.sqrt(i)); // 제곱근한 수를 문자형으로 변형

                for(int q=0; q<snum.length(); q++){
                    // 제곱근 한 숫자가 딱 맞게 떨어진다면 정수형으로 변경 ex) 9 -> 3.0 => 3
                    if(snum.charAt(q)=='.' && snum.charAt(snum.length()-1)=='0'){
                        snum=String.valueOf((int)Math.sqrt(i));
                        break;
                    }
                }

                boolean[] check = {true, true}; // 팰린드롬 수 체크

                for (int j = 0; j < num.length(); j++) {
                    // 숫자가 팰린드롬 수인지 체크
                    if (num.charAt(j) != num.charAt(num.length() - j-1)) {
                        check[0] = false;
                    }
                }

                for (int k = 0; k < snum.length(); k++) {
                    // 제곱근한 숫자가 팰린드롬 수인지 체크
                    if (snum.charAt(k) != snum.charAt(snum.length() - k-1)) {
                        check[1] = false;
                    }
                }

                // 두 개 다 만족한다면 cnt++
                if (check[0] == true && check[1]==true) {
                    cnt++;
                }
            }
            System.out.println("#" + test_case + " " + cnt);
        }
    }
}
