import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=1;i<=2*n-1;i+=2){
            for(int j=1;j<=(2*n-1)-i;j+=2){
                bw.write(" ");
            }
            for(int k=1;k<=i;k++){
                bw.write("*");
            }
            bw.write("\n");
        }
        for(int i=2*n-3;i>=1;i-=2){
            for(int j=(2*n-1)-i;j>=1;j-=2){
                bw.write(" ");
            }
            for(int k=i;k>=1;k--){
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}