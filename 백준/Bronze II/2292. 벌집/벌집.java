import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        long sum = 1;//시작방 포함(이웃하는 방의 합)변수
        
        for(long i=1;i<=n;i++){
            if(n == 1){//시작방과 끝의 방의 숫자가 같으면 자신을 출력
                System.out.printf("%d",n);
                break;
            }else if(sum >= n){//sum의 값이 n의 값보다 크면 n의 값이 포함으로 i개의 방을 지나간다
                System.out.printf("%d",i);
                break;
            }
            sum += i*6;//벌집의 규칙이 6의 배수로 증가
        }
        
        br.close();
    }
}