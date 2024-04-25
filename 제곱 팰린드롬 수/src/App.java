import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            String num, snum;
            int cnt = 0;
            
            for (int i = A; i <= B; i++) {
                num = String.valueOf(i);
                snum = String.valueOf(Math.sqrt(i));
                for(int q=0; q<snum.length(); q++){
                    if(snum.charAt(q)=='.' && snum.charAt(snum.length()-1)=='0'){
                        snum=String.valueOf((int)Math.sqrt(i));
                        break;
                    }
                }
                boolean[] check = {true, true};
                for (int j = 0; j < num.length(); j++) {
                    if (num.charAt(j) != num.charAt(num.length() - j-1)) {
                        check[0] = false;
                    }
                }

                for (int k = 0; k < snum.length(); k++) {
                    if (snum.charAt(k) != snum.charAt(snum.length() - k-1)) {
                        check[1] = false;
                    }
                }
                if (check[0] == true && check[1]==true) {
                    cnt++;
                }
            }
            System.out.println("#" + test_case + " " + cnt);
        }
    }
}
