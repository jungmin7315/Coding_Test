import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int sum = 0; //소수의 총합
        int min = m; //소수의 최솟값

        for(int i=n;i<=m;i++){
            int count=0;
            //소수 체크 코드
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count == 2){//count가 2면 소수이므로 sum에 소수값 넣기
                sum +=i;
                
            }
            if(count == 2 && min>i){//소수이면서 min값이 더 크면 i값이 작으므로 최솟값 바꾸기
                min = i;
            }
        }
        if(sum == 0){//sum의 값이 0이면 소수가 없어 -1출력
            System.out.printf("%d",-1);
        }else{
            System.out.printf("%d%n%d",sum,min);
        }
    }
}