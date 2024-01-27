import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //기본 체스의 변수
        int[] def = {1,1,2,2,2,8};
        //가지고 있는 체스의 변수
        String input = br.readLine();
        String[] chess = input.split(" ");
        //기본 값과 가지고 있는 값의 차이를 저장하는 변수
        int[] check = new int[6];
        //기본 값과 가지고 있는 값의 차이 계산하는 코드
        for(int i=0;i<check.length;i++){
            check[i] = def[i] - Integer.parseInt(chess[i]);
        }
        //출력
        for(int i:check){
            System.out.printf("%d ",i);
        }
        
        br.close();
    }
}