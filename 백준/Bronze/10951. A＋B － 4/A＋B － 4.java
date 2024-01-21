import java.io.*;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
                
        StringTokenizer st;

        while(true){
            String input = br.readLine();
            if (input == null || input.equals("")) {
				break;
			}
            st = new StringTokenizer(input," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a+b+"\n");
        }
        
        bw.close();
        
    }
}