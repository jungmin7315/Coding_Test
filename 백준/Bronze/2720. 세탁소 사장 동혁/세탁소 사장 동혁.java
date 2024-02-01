import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        for(int i=0;i<t;i++){
            int c = Integer.parseInt(br.readLine())*10;
            int qu = 0;//쿼터
            int di = 0;//다임
            int ni = 0;//니켈
            int pe = 0;//페니
            while(true){
                if(c >= 250){//입력 받은 값이 0.25*100 보다 높으면 쿼터 증가
                    c -= 250;
                    qu++;
                }else if(c >= 100){//입력 받은 값이 0.1*100 보다 높으면 다임 증가
                    c-=100;
                    di++;
                }else if(c >= 50){//입력 받은 값이 0.05*100 보다 높으면 니켈 증가
                    c-=50;
                    ni++;
                }else if(c >= 10){//입력 받은 값이 0.01*100 보다 높으면 페니 증가
                    c-=10;
                    pe++;
                }else if(c < 10){//입렫 받은 값이 0.01*100 보다 작으면 반복문 나가기
                    break;
                }
            }
            System.out.printf("%d %d %d %d%n",qu,di,ni,pe);//출력
            
        }
        
        br.close();
    }
}