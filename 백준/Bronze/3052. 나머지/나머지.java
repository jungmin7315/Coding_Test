import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //나머지 저장하기 위한 배열
        int[] su = new int[10];
        //나머지의 총 개수
        int count = 10;
        
        
        //수 10개를 입력받고 42로 나눈 나머지를 저장하는 코드
        for(int i = 0;i<su.length;i++){
            String input = br.readLine();
            st = new StringTokenizer(input);
            int a = Integer.parseInt(st.nextToken());
            
            su[i] = a%42;
        }
        
        //중복된 나머지가 있는지 없는지 체크
        for(int i=0;i<su.length;i++){
            for(int j=i+1;j<su.length;j++){
                if(su[i] == su[j]){
                    count--;
                    break;
                }
            }
        }
        System.out.printf("%d%n",count);
        
    }
}