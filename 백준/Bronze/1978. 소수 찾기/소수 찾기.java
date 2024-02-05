import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; 
        
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        int[] a = new int[n];
        int sum = 0; //소수의 개수 저장변수
        for(int i=0;i<a.length;i++){
            a[i] = Integer.parseInt(st.nextToken());
            int count = 0;//소수 체크를 위한 변수
            for(int j=1;j<=a[i];j++){//1부터 a[i]값까지 나눴을때 0이였으면 count 증가
                if(a[i]%j==0){
                    count++;
                }
            }
            //너머지가 0이였던 count개수가 2개면 소수이므로 sum증가
            if(count == 2){
                sum++;
            }
        }
        System.out.println(sum);
    }
}