import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        char[] ch = input.toCharArray();
        
        //알파벳 26개의 자리를 -1로 초기화
        int[] check  = new int[26];
        for(int i=0;i<check.length;i++){
            check[i] = -1;
        }
        
        for(int i =0;i<ch.length;i++){
            //ch[i]의 값에 아스키코드'a'의 값을 빼고 
            int n = ch[i] -97;
            //check의 변수의 몇번째 자리의 알파벳인지 확인후 그 자리가 -1이면 i값을 넣어준다
            if(check[n] == -1){
                check[n] = i;
            }
        }
        
        for(int i:check){
            System.out.printf("%d ",i);
        }
               
    }
}