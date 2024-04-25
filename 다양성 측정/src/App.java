import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T=sc.nextInt();

        for(int test_case=1; test_case<=T; test_case++){
            int[] check = new int[10];
            String num=sc.next();
            int cnt=0;

            // 입력받은 숫자를 하나씩 가져와서 배열에 체크
            for(int i=0; i<num.length(); i++){
                check[(num.charAt(i)-'0')]=1;
            }

            // 체크한 숫자 개수 확인
            for(int i=0; i<10; i++){
                if(check[i]==1){
                    cnt++;
                }
            }
            System.out.println("#"+test_case+" "+cnt);
        }
    }
}
