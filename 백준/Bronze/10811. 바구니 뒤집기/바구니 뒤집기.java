import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken()); 
        int m = Integer.parseInt(st.nextToken());  // 줄의 개수
                            
        int[] basket = new int[n];  // 바구니의 개수 1<= n <=100        

        //for문으로 1 ~ n번째 값 넣기
        for(int i = 0;i<basket.length;i++){
            basket[i] = i+1;
            
        }
        //바구니 a번 ~ 바구니 b번의 값 교환 코드
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            for(int j=a;j<=b;j++,a++,b--){
                int tmp = 0;
                tmp = basket[b];
                basket[b] = basket[a];
                basket[a] = tmp;
            }
        }
        for(int i=0;i<basket.length;i++){
            System.out.printf("%d ",basket[i]);
        }    
    }
}