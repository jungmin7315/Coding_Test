import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        
        for(int i=0;i<t;i++){
            //c의 단위는 센트(1달러 = 100센트)
             int c = Integer.parseInt(br.readLine());
            //쿼터 25
            //다임 10
            //니켈 5
            //페니 1
            sb.append(c/25+" ");//c의 값을 쿼터로 나눴을때 몫 출력
            c %= 25;//나머지는 c에 저장
            sb.append(c/10+" ");//c의 값을 다임로 나눴을때 몫 출력
            c %= 10;//나머지는 c에 저장
            sb.append(c/5+" ");//c의 값을 니켈로 나눴을때 몫 출력
            c %= 5;//나머지는 c에 저장
            sb.append(c/1+" ");//c의 값을 페니로 나눴을때 몫 출력
            sb.append("\n");
        }
        System.out.printf("%s",sb);
        br.close();
    }
}