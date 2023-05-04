import java.util.Scanner;

public class String9 {
    public int solution(String str){
        int answer =0;
        for (char x : str.toCharArray()){
            if (x>=48 && x<=57) answer= answer*10+(x-48);
        }


        return answer;
    }

    public static void main(String[] args){
        String9 T = new String9();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.println(T.solution(str));
    }
}



/*
public int solution (String str){
String answer ="";
for (char x: s.toCharArray()){
    if(Character.isdigit(x)) answer+=x;
}
return Integer.parseInt(answer);
}

*/