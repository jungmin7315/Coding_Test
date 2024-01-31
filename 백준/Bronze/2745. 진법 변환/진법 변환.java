import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        char[] n = st.nextToken().toCharArray();
        int b = Integer.parseInt(st.nextToken());//진법 수
        char al = 'A';
        char su = '0';
        long sum =0;//10진수 보여주기
        for(int i=0;i<n.length;i++){
            int a = 0;//n의 값에 대한 숫자 바꾸기
            long sq = 1;//제곱 계산
            //문자값이 '@'보다 낮으면 숫자이며 문자 '0'을 뺴준다
            if(n[i] < '@'){
                a = n[i]-su;
            }else{//그 외는 문자이며 문자 'A'를 빼주고 9뒤에 10을 A로 시작하니 10을 더해준다
                a = (n[i]-al) + 10;
            }
            for(int j=0;j<(n.length-1)-i;j++){
                sq *= b;
            }
            sum += sq*a;
        }
        
        System.out.printf("%d%n",sum);
        
        br.close();
    }
}