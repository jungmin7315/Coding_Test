import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        //도화지 넓이 배열
        int[][] paper = new int[100][100];
        //색종이의 수를 입력받는 변수
        int n = Integer.parseInt(br.readLine());
        //도화지에 색종이를 붙이는데 붙은 곳은 1로 체크                
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine()," ");
            int length = Integer.parseInt(st.nextToken());
            int width = Integer.parseInt(st.nextToken());
            //색종이의 시작점을 입력받고 그 시작점부터 색종이 붙이기;(붙은 곳은 1로 체크)
            for(int j=length;j<length+10;j++){
                for(int k=width;k<width+10;k++){
                    paper[j][k] = 1;
                }
            }
            
        }
        int sum=0;
        //도화지에 1로 체크된 색종이를 모두 더하여 넓이 구하기
        for(int[] i:paper){
            for(int j:i){
                sum +=j;
            }
        }
        
        System.out.printf("%d",sum);
        
        br.close();
    }
}