import java.util.Scanner;

public class String7 {
    public String solution(String str){
        String answer= "";
        char[] s =str.toCharArray();
        char lt= s[0];
        char rt= s[s.length-1];
        while (lt==rt){
            if (lt==rt) lt++;

        }
        return null;
    }

    public static void main(String[] args){
        String7 T = new String7();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}
