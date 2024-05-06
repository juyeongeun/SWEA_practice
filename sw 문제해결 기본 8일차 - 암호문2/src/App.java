import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int TC = 1; TC <= 10; TC++) {
            int len = Integer.parseInt(br.readLine());
            LinkedList<String> list = new LinkedList<>();
            String[] str = br.readLine().split(" ");
            int cmdCnt = Integer.parseInt(br.readLine());
            String[] str2 = br.readLine().split(" ");

            for (int i = 0; i < len; i++) {
                list.add(str[i]);
            }

            for (int i = 0; i < str2.length; i++) {
                char cmd = str2[i].charAt(0);
                if (cmd == 'D') {
                    int locate = Integer.parseInt(str2[i + 1]);
                    int cnt = Integer.parseInt(str2[i + 2]);

                    for (int j = 0; j < cnt; j++) {
                        list.remove(locate);
                    }

                }
                else if (cmd=='I'){
                    int locate = Integer.parseInt(str2[i + 1]);
                    int cnt = Integer.parseInt(str2[i + 2]);

                    for(int j=0; j<cnt; j++){
                        list.add(locate,str2[j+i+3]);
                        locate++;
                    }
                }
            }
            System.out.print("#"+TC+" ");
            for(int i=0; i<10; i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }
    }
}
