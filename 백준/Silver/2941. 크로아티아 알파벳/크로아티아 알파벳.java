import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        
        char[] al = input.toCharArray();
        int count = 0;
        
        //크로아티아 알파벳 체크하는 코드
        for(int i=0;i<al.length;i++){
            if(al[i] == 'c' && i < al.length-1){
                if(al[i+1] == '='){
                    i = i+1;
                }else if(al[i+1] == '-'){
                    i = i+1;
                }
            }else if(al[i] == 'd' && i < al.length-1){
                if(al[i+1] == '-'){
                    i = i+1;
                }else if(al[i+1] == 'z' && i < al.length-2){
                    if(al[i+2] == '='){
                        i = i+2;
                    }
                }
            }
            else if(al[i] == 'l' && i < al.length-1){
                if(al[i+1] == 'j'){
                    i = i+1;
                }
            }
            else if(al[i] == 'n' && i < al.length-1){
                if(al[i+1] == 'j'){
                    i = i+1;
                }
            }
            else if(al[i] == 's' && i < al.length-1){
                if(al[i+1] == '='){
                    i = i+1;
                }
            }
            else if(al[i] == 'z' && i < al.length-1){
                if(al[i+1] == '='){
                    i = i+1;
                }
            }
            count++;
        }
        //출력
        System.out.println(count);
        
        br.close();
    }
}