import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int n = Integer.parseInt(st.nextToken()); //배열 길이
        int x = Integer.parseInt(st.nextToken()); 
        int[] su = new int[n]; //배열 선언
        
        //배열을 선언하고 그 배열에 값 넣기
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i<su.length;i++){
            su[i] = Integer.parseInt(st.nextToken());
        }
        
        //x보다 작은 수 찾기 위한 코드
        for(int i = 0; i<su.length;i++){
            if(su[i] < x){
                System.out.printf("%d ",su[i]);
            }
        }
        
    }
}