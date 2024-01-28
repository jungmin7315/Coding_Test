import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);//세로 크기
        int m = Integer.parseInt(arr[1]);//가로 크기
        int[][] sum = new int[n][m];//a+b 2차원 배열 선언
        //a의 2차원 배열에 값 넣어주기
        for(int i=0;i<n;i++){
            String[] arrA = br.readLine().split(" ");
            for(int j=0;j<m;j++){
                sum[i][j] = Integer.parseInt(arrA[j]);
            }
        }
        //a+d의 결과 값 넣어주기
        for(int i=0;i<n;i++){
            String[] arrB = br.readLine().split(" ");
            for(int j=0;j<m;j++){
                sum[i][j] = sum[i][j] + Integer.parseInt(arrB[j]);
            }
        }
        //출력
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.printf("%d ",sum[i][j]);
            }
            System.out.println();
        }
        
        br.close();
    }
}