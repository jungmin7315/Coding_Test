import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //테스트 케이스의 개수
        int t = Integer.parseInt(br.readLine());
        String input;
        
        for(int i =0; i<t;i++){
            //input단어 문자열 변수
            input = br.readLine();
            //문자열의 첫번째와 끝 출력 단 문자열의 길이가 1인경우 그 값을 2번 출력
            if(input.length() != 1){
                System.out.printf("%c%c%n",input.charAt(0),input.charAt(input.length()-1));    
            }else{
                System.out.printf("%c%c%n",input.charAt(0),input.charAt(0));    
            }
        }
    }
}
