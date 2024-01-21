import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;


public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        int count = 0;
        
        StringTokenizer st = new StringTokenizer(input);
        int a = 0;
        
        //배열크기 정하는 코드
        if(st.hasMoreTokens()) {
            a = Integer.parseInt(st.nextToken());
        }
        int[] su = new int[a];
        
        //배열에 들어가는 값 넣는 코드
        input = br.readLine();
        st = new StringTokenizer(input," ");
        
        while(st.hasMoreTokens()){
            a = Integer.parseInt(st.nextToken());
            su[count] = a;
            count++;
        }
        
        //배열에 check의 값이 있으면 그 값이 몇개 있는지 확인하는 코드
        input = br.readLine();
        st = new StringTokenizer(input);
        int check = 0;
        if(st.hasMoreTokens()){
            check = Integer.parseInt(st.nextToken());
        }
        count = 0;
        for(int i = 0;i<su.length;i++){
            if(su[i] == check){
                count++;
            }
        }
        //확인한 값의 개수 출력
        System.out.println(count);
    }
}