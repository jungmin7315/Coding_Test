import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        //낮에는 a미터 올라가는 변수
        int a = Integer.parseInt(st.nextToken());
        //밤에 잠을 자는 동안 b미터 내려가는 변수
        int b = Integer.parseInt(st.nextToken());
        //올라가야 하는 v미터 변수
        int v = Integer.parseInt(st.nextToken());
        
        int tmp1 = v-b;//총 올라가야 하는 거리
        int tmp2 = a-b;//하루에 올라가는 거리
        
        //며칠이 걸렸는지 저장하는 변수
        int day = (tmp1/tmp2);
        
        if(tmp1%tmp2!=0) day++;//만약 나눴을떄 나머지가 남는다면 하루증가
        
        System.out.printf("%d",day);//며칠이 걸리는지 출력
        br.close();
    }
}