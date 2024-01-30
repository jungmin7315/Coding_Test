import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        char[][] al = new char[5][15];
        //입력받은 글자들을 배열에 넣어주기
        for(int i=0;i<5;i++){
            String input = br.readLine();
            for(int j=0;j<input.length();j++){
                al[i][j] = input.charAt(j);
            }
        }
        
        //세로로 읽은 순서대로 출력;
        for(int j=0;j<15;j++){
            for(int i=0;i<5;i++){
                //공백이 있을시 건너뛰기
                if(al[i][j] == 0){
                    continue;
                }else{
                    sb.append(al[i][j]);
                }
            }
        }
        
        System.out.printf("%s",sb);
        
        br.close();
    }
}