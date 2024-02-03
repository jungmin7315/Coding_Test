import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        while(true){
            st = new StringTokenizer(br.readLine()," ");//두수 입력받기

            int n = Integer.parseInt(st.nextToken());//첫번쨰 숫자
            int m = Integer.parseInt(st.nextToken());//두번쨰 숫자
            if(n == 0 && m == 0){//만약 마지막 두숫자의 값이 0이 들어온다면 반목문 나가기
                break;
            }
            if(n > m){
                if(n%m==0){ //두 숫자를 비교 두번째 숫자 크다면 약수
                    sb.append("multiple\n");
                }else{
                    sb.append("neither\n");//검사후 배수가 아니라면 neither 출력
                }
            }else if(n < m){
                if(m%n==0){//두 숫자를 비교 두번째 숫자 크다면 약수
                    sb.append("factor\n");
                }else{
                    sb.append("neither\n");//검사후 약수가 아니라면 neither 출력
                }
            }
        }
        System.out.printf("%s",sb);

        //약수 factor 배수 multiple 둘다X neither
    }
}