import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String input = br.readLine();
        char[] word = input.toCharArray();
        int count = 0;
        
        for(int i=0;i<word.length;i++){
            if(word[i] != word[(word.length -1)-i]){
                System.out.println("0");
                count++;
                break;
            }
        }
        if(count == 0){
            System.out.println("1");
        }
        br.close();
    }
}