import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        String tmp = " ";
        //숫자 꺼꾸로 변환
        String[] a = st.nextToken().split("");
        tmp = a[0];
        a[0] = a[2];
        a[2] = tmp;
        
        //숫자 꺼꾸로 변환
        String[] b = st.nextToken().split("");
        tmp = b[0];
        b[0] = b[2];
        b[2] = tmp;
        
        //변환한 세자리 수의 비교 코드
        for(int i=0;i<a.length;i++){
            if(Integer.parseInt(a[i]) < Integer.parseInt(b[i])){
                for(String j:b){
                    bw.write(j);
                }
                break;
            }else if(Integer.parseInt(a[i]) > Integer.parseInt(b[i])){
                for(String j:a){
                    bw.write(j);
                }
                break;
            }
        }
        //출력
        bw.flush();
        bw.close();
        br.close();
    }
}