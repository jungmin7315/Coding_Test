import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int input = Integer.parseInt(st.nextToken());
        int[] n = new int[input];
        float sum=0;
        
        st = new StringTokenizer(br.readLine()," ");
        for(int i =0;i<n.length;i++){
            input = Integer.parseInt(st.nextToken());
            n[i] = input;
        }
        //최대값 변수
        float max = n[0];
        //최대값 찾기 코드
        for(int i = 0; i<n.length;i++){
            if(max < n[i]){
                max = n[i];
            }
        }
        //점수 조작한 총합 코드 (점수/최대값 * 100)
        for(int i = 0; i<n.length;i++){
            sum = sum + (n[i]/max *100);
        }
        
        System.out.println((float)sum/n.length);
        
        
    }
}