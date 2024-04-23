import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[M];
            int max = 0, max_result = 0, result = 0;

            max = Math.max(N, M);

            for(int i=0; i<N; i++){
                A[i]=sc.nextInt();
            }

            for(int i=0; i<M; i++){
                B[i]=sc.nextInt();
            }

            if (max == N) { //A배열이 더 길 때
                for (int i = 0; i <=max-M; i++) {
                    result=0;
                    for (int j = 0; j < M; j++) {
                        result += A[i + j] * B[j];
                    }
                    if(result>max_result){
                        max_result=result;
                    }
                }
            }
            else{
                for (int i = 0; i <= max-N; i++) { // B 배열이 더 길 때
                    result=0;
                    for (int j = 0; j < N; j++) {
                        result += A[j] * B[i+j];
                    }
                    if(result>max_result){
                        max_result=result;
                    }
                }
            }
            System.out.println("#"+test_case+" "+max_result);
        }
    }
}
