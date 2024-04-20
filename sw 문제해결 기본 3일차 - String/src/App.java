import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            int tmp = sc.nextInt();
            String check = sc.next(); // 찾는 문자열
            String str = sc.next(); // 검색할 문장
            int sum=0; // 문자열이 들어있는 개수

            for(int i=0; i<str.length()-check.length()+1; i++){ //전체 문장 - 찾는 문자열 +1 ex) 12 - 2+1
                int cnt=0;
                for(int j=0; j<check.length(); j++){ // 찾는 문자열 만큼 반복
                    if(str.charAt(i+j)==check.charAt(j)){ // str문자 한 개랑 체크문자 하나씩 비교
                        cnt++;
                    }
                }
                if(cnt==check.length()){ // cnt랑 찾는 문자열 수가 같으면 개수++
                    sum++;
                }
            }
            System.out.println("#"+test_case+" "+sum);
        }

    }
}
