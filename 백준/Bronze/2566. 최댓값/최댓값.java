import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder str = new StringBuilder();
        
        int x=1;//전부 0일때를 방지하기 위해 초기값 1행1열로 초기화
        int y=1;//전부 0일때를 방지하기 위해 초기값 1행1열로 초기화
        int max;
        //2차원 배열 선언
        int[][] n = new int[9][9];
        //n 2차원 배열에 값 넣기
        for(int i=0;i<9;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<9;j++){
                n[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //max의 초기값 설정
        max = n[0][0];
        //최대값 찾기
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(max < n[i][j]){
                    max = n[i][j];
                    x = i+1;
                    y = j+1;
                }
            }
        }
        str.append(max+"\n"+x+" "+y);
        System.out.println(str);
        
        br.close();
    }
}