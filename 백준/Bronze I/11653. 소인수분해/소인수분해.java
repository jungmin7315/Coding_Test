import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());//소인수분해 하기 위한 변수 입력받기
        int count = 2; //소인수분해의 첫 시작 숫자
        
        while(true){
            if(n%count == 0){//n의 소인분해 결과 출력
                System.out.printf("%d\n",count);
                n=n/count;
                count = 2;
            }else{//count로 안나눠질때 count증가 시키고 다시 시도
                count++;
            }
            if(n==1){//n의 값이 1이면 중단
                break;
            }
        }
        br.close();
    }
}