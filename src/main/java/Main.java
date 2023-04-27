

import java.util.ArrayList;
import java.util.Scanner;

//public class Main {
//
//
//    public String solution(String str) {
//        String answer = "";
//        for (char x : str.toCharArray()) {
//
//            if (x >= 97 && x <= 122) answer += (char) (x - 32);
//            else answer += (char) (x + 32);
//
//        }
//        return answer;
//    }
//
//
//
//
//
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
//        System.out.println(T.solution(str));
//    }
//
//}

public class Main {

    public ArrayList<String> solution(int n, String[] str) {
            ArrayList<String> answer = new ArrayList<String>();
            return answer;
        }






    public static void main(String[] args){
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    String[] str = new String[n];
    for (int i=0; i<n; i++){
        str[i]=kb.next();
    }
    for (String x : T.solution(n, str)) {
        System.out.println(x);
    }
    }
}