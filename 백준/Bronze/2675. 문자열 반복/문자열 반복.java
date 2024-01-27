import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        //테스트 케이스의 개수 변수
        int count = Integer.parseInt(br.readLine());
        
        for(int i=0;i<count;i++){
            //테스트 케이스의 반복 횟수와 문자열을 담는 변수
            st = new StringTokenizer(br.readLine()," ");
            //테스트 케이스의 반복 횟수 변수
            int su = Integer.parseInt(st.nextToken());
            String wo = st.nextToken();//문자열 변수
            //각 테스트 케이스에 대헤 출력하는 코드
            for(int j=0;j<wo.length();j++){
                for(int k=0;k<su;k++){
                    bw.write(wo.charAt(j)+"");
                }
            }
            //각 테스트 케이스에 대헤 출력하는 코드
            bw.write("\n");
        }
        //출력
        bw.flush();
        //닫기
        bw.close();
        //닫기
        br.close();
    }
}