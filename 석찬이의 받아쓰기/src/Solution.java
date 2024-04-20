import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T= sc.nextInt();

        for(int test_case=1; test_case<=T; test_case++){
            int N = sc.nextInt();
            String str = sc.next();
            String test = sc.next();
            int correct=0;

            for(int i=0; i<N; i++){
                if(str.charAt(i)==test.charAt(i)){
                    correct++;
                }
            }

            System.out.println("#"+test_case+" "+correct);
        }
    }
}
