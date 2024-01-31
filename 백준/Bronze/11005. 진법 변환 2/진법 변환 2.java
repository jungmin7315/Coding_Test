import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        char[] s = {'0','1','2','3','4','5','6','7','8','9',
                      'A','B','C','D','E','F','G','H','I','J',
                      'K','L','M','N','O','P','Q','R','S','T',
                      'U','V','W','X','Y','Z'};
        
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n1 = n;
        int count =0;
        while(n!=0){//자릿수 구하기
            n /= b;
            count++;
        }
        char[] arr = new char[count];//자릿수에 맞는 배열 선언
        for(int i=0;i<count;i++){//해당 값 넣어주기
            arr[(count-i)-1] = s[n1%b];
            n1/=b;
        }
        
        for(char i:arr){
            System.out.printf("%c",i);//출력
        }
        
        br.close();
    }
}