import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(bf.readLine());
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(j <= i){
                    bw.write("*");
                }else{
                    bw.write(" ");
                }
            }
            bw.write("\n");
        }
        bw.close();  
    }
}
