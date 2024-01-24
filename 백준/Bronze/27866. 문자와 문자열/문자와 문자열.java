import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //input단어 문자열 변수
        String input = br.readLine();
        //i번째 글자를 출력받기 위한 변수
        int i = Integer.parseInt(br.readLine());
        
        //문자열중에서 원하는 i의 번째만 출력
        System.out.printf("%s",input.charAt(i-1));
        
    }
}