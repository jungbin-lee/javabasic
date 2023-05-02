import java.util.Scanner;
//소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.


public class String6 {
    public String solution(String str){
        String answer= "";
        for (int i= 0; i<str.length(); i++){
            if (str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
        }
        //charAt String으로 저장된 문자열 중에서 한 글자만 선택해서. char타입으로 변환
        //indexOf 문자열에서 특정 문자열의 위치를 찾아 index값을 반환

        return answer;
    }

    public static void main(String[] args){
        String6 T = new String6();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}

