import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=1;i<=n;i++){
            //공백 출력
            for(int j=1;j<=n-i;j++){
                bw.write(" ");
            }
            //홀수자리 *출력
            for(int k=1;k<=i*2-1;k++){
                bw.write("*");
            }
            bw.write("\n");
        }
        for(int i=n-1;i>=1;i--){
            //공백 출력
            for(int j=n-i;j>=1;j--){
                bw.write(" ");
            }
            //홀수자리 *출력
            for(int k=i*2-1;k>=1;k--){
                bw.write("*");
            }
            bw.write("\n");
        }
        //출력
        bw.flush();
        bw.close();
        br.close();
    }
}
