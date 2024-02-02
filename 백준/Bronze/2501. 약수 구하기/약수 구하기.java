import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        //약수의 순서 저장 벼수
        int count = 0;
        //k번쨰 약수 저장 변수
        int result = 0;
        
        for(int i=1;i<=n;i++){
            //n숫자의 i를 나눴을때 그 i가 약수면 count증가
            if(n%i == 0){
                count++;
            }
            //count의 숫자와 k번째와 같다면 result변수의 저장후 반복문 나오기
            if(count == k){
                result = i;
                break;
            }
        }
        //출력
        System.out.printf("%d",result);
        
        br.close();
    }
}