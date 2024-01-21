import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuffer result = new StringBuffer();
        
        int n = Integer.parseInt(bf.readLine());
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){
                result.append(" ");
            }
            for(int j=0;j<i;j++){
                result.append("*");
            }
            result.append("\n");
        }
        
        bw.write(result.toString());
        bw.close();  
    }
}