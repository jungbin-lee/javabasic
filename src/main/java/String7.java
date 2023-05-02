import java.util.Scanner;

public class String7 {
    public String solution(String str)
//    {
//        String answer= "YES";
//        str = str.toUpperCase();
////        char[] s =str.toCharArray();
////        char lt= s[0];
////        char rt= s[s.length-1];
////        while (lt==rt){
////            if (lt==rt) lt++;
////
////        }
//
//        //짝홀 둘다 상관없다.
//        int len = str.length();
//        for (int i =0; i<len/2; i++){
//            if (str.charAt(i)!=str.charAt(len-i-1))
//                return "NO";
//        }
//        return answer;
//    }

    {
        String answer= "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) answer="YES";
            return answer;
    }

    public static void main(String[] args){
        String7 T = new String7();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}
