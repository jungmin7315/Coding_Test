import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st;
        
        int[] su = new int[9]; //배열 선언
        int count = 1; //몇 번째인지 알기 위한 변수 선언
                
        //배열을 선언하고 그 배열에 값 넣기
        for(int i = 0; i<su.length;i++){
            String input = br.readLine();
            st = new StringTokenizer(input);
            if(input == null || input.equals("")){
                break;
            }
            su[i] = Integer.parseInt(st.nextToken());
        }
        
        //배열에 값 넣은후 최대값 초기 값 넣기
        int max = su[0]; //최대값 선언
                
        //최대값 구하기
        for(int i = 0; i<su.length;i++){
            if(su[i] > max){
                max = su[i];
                count = i+1;
            }
            
        }
        
        //출력
        System.out.printf("%d%n%d",max,count);
                
    }
}