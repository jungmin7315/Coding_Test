import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken()); 
        int m = Integer.parseInt(st.nextToken());  // 줄의 개수
        int count=0;
        
        int[] basket = new int[n];  // 바구니의 개수 1<= n <=100        
        
        //i번 부터 j번까지 k공 넣기
        while(true){
            //m번째 줄까지 실행하기 위한 체크문
            if(count == m){
                break;
            }
            count++;
            //i번 번호 값, j번 번호 값, k번 번호 값의 선언 및 넣기
            int i,j,k = 0;
            st = new StringTokenizer(br.readLine()," ");
            i = Integer.parseInt(st.nextToken())-1;//첫번째 바구니
            j = Integer.parseInt(st.nextToken())-1;//마지막 바구니
            k = Integer.parseInt(st.nextToken());  //공의 번호
            //첫번쨰 바구니부터 마지막 바구니까지 k번호 공 넣기
            for(;i<=j;i++){
                basket[i] = k;
            }
            
        }
        //향상된 for문으로 배열값 출력
        for(int i:basket){
            System.out.printf("%d ",i);
        }
    }
}