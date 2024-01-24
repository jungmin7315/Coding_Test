import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        //입력받은 문자열 저장하는 변수
        String input = st.nextToken();
        
        st = new StringTokenizer(br.readLine());
        //입력받은 숫자의 위치 번호 변수
        int i = Integer.parseInt(st.nextToken());
        
        //문자열중에서 원하는 i의 위치만 출력
        System.out.printf("%s",input.substring(i-1,i));
        
    }
}