import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true){
            int n = Integer.parseInt(br.readLine());
            int sum = 0; // n의 모든 약수들의 합 변수
            if( n == -1){ //입력받는 도중에 -1이 나오면 중단
                break;
            }
            for(int i=1;i<n;i++){//n의 모든 약수들의 합 계산 코드
                if(n%i==0){
                    sum+=i;
                }
            }
            if(sum == n){//만약 sum의 값과 n의 값이 같으면 완전수
                sb.append(n+" = ");//n의 값에 대한 약수 출력 코드
                for(int i=1;i<n;i++){
                    if(n%i==0){
                        sb.append(i+" + ");
                    }
                }
                sb.deleteCharAt(sb.length()-3);//마지막 값의 +와 공백 제거
                sb.deleteCharAt(sb.length()-2);
                sb.deleteCharAt(sb.length()-1);
                sb.append("\n");//여기까지 n의 값에 대한 약수 출력 코드
            }else{//sum의 값과 n의 값이 다르다면 is NOT perfect.
                sb.append(n+" is NOT perfect.\n");
            }
        }
        System.out.printf("%s",sb);//출력
        br.close();
    }
}