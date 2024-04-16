import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        
        for(int tc=0; tc<test; tc++){
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            int num=1;

            int minRow=0, minCol=0;
            int maxRow=n-1, maxCol=n-1;

            while(num<=n*n){
                //우측
                for(int col = minCol; col<= maxCol; col++){
                    arr[minRow][col]=num++;
                }
                minRow++; // 행 최소값 증가

                //하
                for(int row = minRow; row<=maxRow; row++){
                    arr[row][maxCol]=num++;
                }
                maxCol--; // 열 최대값 감소

                //좌측
                for(int col=maxCol; col>=minCol; col--){
                    arr[maxRow][col]=num++;
                }
                maxRow--; //행 최대값 감소

                //상
                for(int row=maxRow; row>= minRow; row--){
                    arr[row][minCol]=num++;
                }
                minCol++; //열 최소값 증가
            }

            System.out.println("#"+(tc+1));

            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println();
            }
        }
    }
}
