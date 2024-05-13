package swea_3752;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T=Integer.parseInt(br.readLine());
        
        for(int tc=1; tc<=T; tc++) {
            int problem = Integer.parseInt(br.readLine());
            HashSet<Integer> set = new HashSet<>();
            set.add(0); // 0개 맞았을 때
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] score = new int[problem];
            for(int i=0; i<problem; i++) {
                score[i]=Integer.parseInt(st.nextToken());
            }
            
            for (int i = 0; i < score.length; i++) {
                int s = score[i];
                HashSet<Integer> newSet = new HashSet<>();
                for (int idx : set) { //해시는 반복문 for-each문 사용이 제일 편함
                    set.add(idx + s);
                }
                //set.addAll(newSet);
            }

            System.out.println("#"+tc+" "+set.size());
        }
        
    }

}
