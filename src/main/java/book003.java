import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class book003 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer= new StringTokenizer(bufferedReader.readLine());
        //tringTokenizer 클래스는 문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 클래스입니다.
        int suNo =Integer.parseInt(stringTokenizer.nextToken());
        int quizNo =Integer.parseInt(stringTokenizer.nextToken());
        long [] S =new long[suNo+1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i=1; i<=suNo; i++){
            S[i] =S[i-1]+ Integer.parseInt(stringTokenizer.nextToken());
        }
        for(int q= 0; q< quizNo; q++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j  = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j]- S[i-1]);
        }
    }
}

//BufferedReader를 사용할때와 Scanner의 속도가 차이가 나는 이유는 buffer 사용 여부의 차이입니다.
//
//Scanner는 1KB 크기의 버퍼를 갖기 때문에 입력이 바로 전달되는 반면 BufferedReader는 8KB 크기의 버퍼를 가져 buffer에 입력들을 저장하였다 한 번에 전송하기 때문에 속도가 더 빠릅니다.
//5 3
//5 4 3 2 1
//1 3
//2 4
//5 5