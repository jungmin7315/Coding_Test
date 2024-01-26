import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //문자 단어 입력받기
        String input = br.readLine();
        //문자 단어 공백으로 구분
        String[] in = input.split(" ");
        
        int count = 0;
        
        //문자열의 공백이 있는지 없는지 체크
        for(int i=0;i<in.length;i++){
            if(in[i].equals("")){
                count++;
            }
        }
        
        System.out.printf("%d",in.length-count);
    }
}