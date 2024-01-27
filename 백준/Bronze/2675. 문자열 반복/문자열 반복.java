import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int count = Integer.parseInt(br.readLine());
        
        for(int i=0;i<count;i++){
            st = new StringTokenizer(br.readLine()," ");
            int su = Integer.parseInt(st.nextToken());
            String wo = st.nextToken();
            for(int j=0;j<wo.length();j++){
                for(int k=0;k<su;k++){
                    bw.write(wo.charAt(j)+"");
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}