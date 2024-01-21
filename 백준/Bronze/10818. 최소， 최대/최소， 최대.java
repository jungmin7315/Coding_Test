import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        
        int n = Integer.parseInt(st.nextToken()); //배열 길이
        int[] su = new int[n]; //배열 선언
                
        //배열을 선언하고 그 배열에 값 넣기
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i<su.length;i++){
            su[i] = Integer.parseInt(st.nextToken());
        }
        
        //배열에 값 넣은후 최소값 최대값 초기 값 넣기
        int max = su[0]; //최대값 선언
        int min = su[0]; //최소값 선언
        
        //최소값 최대값 구하기
        for(int i = 0; i<su.length;i++){
            if(su[i] > max){
                max = su[i];
            }else if(su[i] < min){
                min = su[i];
            }
        }
        
        //출력
        System.out.printf("%d %d",min,max);
                
    }
}