import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String input = br.readLine();
        //문자열을 문자단위로 나눠 저장하는 변수
        char[] word = input.toCharArray();
        //서로 다른 문자가 있으면 값을 늘려주는 변수
        int check = 0;
        
        //단어의 앞과 뒤의 문자를 확인하는 코드
        for(int i=0;i<word.length;i++){
            if(word[i] != word[(word.length -1)-i]){
                System.out.println("0");
                check++;
                break;
            }
        }
        //값이 늘었는지 안늘었는지 확인하는 코드 없으면 1을 출력
        if(check == 0){
            System.out.println("1");
        }
        br.close();
    }
}
