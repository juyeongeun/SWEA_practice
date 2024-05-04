import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App {
    public static String[] map ={"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T= Integer.parseInt(br.readLine());

        for(int TC=1; TC<=T; TC++){
            String str = br.readLine(); 
            String[] num = br.readLine().split(" "); // 영어 숫자 받기

            for(int i=0; i<num.length; i++){
                for(int j=0; j<map.length; j++){
                    if(num[i].equals(map[j])){ // 단어맵과 같으면 단어맵의 인덱스 숫자로 재저장
                        num[i]=Integer.toString(j);
                    }
                }
            }

            Arrays.sort(num); // 숫자로 저장된 배열 정렬

            System.out.println("#"+TC);
            for(int i=0; i<num.length; i++){
                // 숫자맵[num[인덱스]] 출력 , 인덱스 = 영어 숫자
                System.out.print(map[Integer.parseInt(num[i])]+" ");
            }
        }
    }
}
