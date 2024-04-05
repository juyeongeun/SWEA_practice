import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        String[] arr = new String[T];
        
        //숫자를 문자형태로 배열에 저장
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(i + 1);
        }

        // 3,6,9를 포함하고 있으면 해당 숫자를 '-'로 대체하고 문자를 제거 예를 들어 23이면 -로 표현되어야하기 때문에 2-이 안되려고 문자 제거
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("3") == true || arr[i].contains("6") == true || arr[i].contains("9")) {
                arr[i] = String.valueOf(i + 1).replaceAll("[369]", "-").replaceAll("\\d", "");
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }
}