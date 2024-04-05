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
                for(int col = minCol; col<= maxCol; col++){
                    arr[minRow][col]=num++;
                }
                minRow++;

                for(int row = minRow; row<=maxRow; row++){
                    arr[row][maxCol]=num++;
                }
                maxCol--;

                for(int col=maxCol; col>=minCol; col--){
                    arr[maxRow][col]=num++;
                }
                maxRow--;

                for(int row=maxRow; row>= minRow; row--){
                    arr[row][minCol]=num++;
                }
                minCol++;
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
