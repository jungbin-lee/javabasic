import java.util.Scanner;

public class String8 {
    public String solution(String str){
        String answer ="NO";
     str= str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) answer="YES";


        return answer;
    }

    public static void main(String[] args){
        String8 T = new String8();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.println(T.solution(str));
    }
}